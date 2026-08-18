# Alfresco Java SDK release process

This document describes how to release the Alfresco Java SDK using the automated CI pipeline introduced in [ACS-12085](https://hyland.atlassian.net/browse/ACS-12085).

Releases are performed on **`develop`** or **`release/**`** via GitHub Actions. The pipeline uses [`maven-release-slim`](https://github.com/Alfresco/alfresco-build-tools) from Alfresco build-tools and a GitHub App installation token to create **verified** commits and tags.

## Version conventions

### Alpha versions (dot notation)

Alpha releases **must** use a dot between `A` and the alpha number:

| Correct | Incorrect |
|---------|-----------|
| `7.3.4-A.1` | `7.3.4-A1` |
| `7.3.4-A.2` | `7.3.4-A2` |

Use this format in `RELEASE_VERSION`, Git tags, and released Maven coordinates. **Do not** include `-SNAPSHOT` in `RELEASE_VERSION`.

### Pre-release POM versions (`-SNAPSHOT`)

Before triggering `[release]`, all project `pom.xml` files **must** use the alpha version **with** the `-SNAPSHOT` suffix:

| `RELEASE_VERSION` (in `ci.yml`) | POM version (before release) |
|---------------------------------|------------------------------|
| `7.3.4-A.1` | `7.3.4-A.1-SNAPSHOT` |
| `7.3.4` (GA) | `7.3.4-SNAPSHOT` |

This matches the convention used in previous releases (for example [PR #425](https://github.com/Alfresco/alfresco-java-sdk/pull/425): `7.3.3-SNAPSHOT` → `7.3.3-A.1-SNAPSHOT`).

### Next development version (`-SNAPSHOT`)

`DEVELOPMENT_VERSION` **must** include the `-SNAPSHOT` suffix. This is the version written to all POMs after the release completes.

| Correct | Incorrect |
|---------|-----------|
| `7.3.4-A.2-SNAPSHOT` | `7.3.4-A.2` |
| `7.3.5-SNAPSHOT` | `7.3.5` |

This applies to both alpha and GA release cycles.

## Overview

| Step | Trigger | CI job | Result |
|------|---------|--------|--------|
| Alpha / Nexus release | `[release]` in commit message | `release` | Deploy to Alfresco Nexus, Git tag, verified bot commits |
| GA Maven Central publish | `[publish]` in commit message | `publish_to_maven_central` | Publish to Maven Central (GA versions only) |
| Re-publish to Maven Central | `workflow_dispatch` with `publish_to_maven_central` | `publish_to_maven_central` | Re-run publish for an existing tag |

Alpha releases (for example `7.3.4-A.1`) are deployed to **Nexus only**. GA releases (for example `7.3.4`) can additionally be published to **Maven Central** using `[publish]`.

## Prerequisites

- Merge your changes to **`develop`** or a **`release/**`** branch.
- Ensure CI tests pass (`build_and_verify` job). Do not use `[skip tests]` on a release commit.
- Confirm the repository has the `GH_APP_ENGINEERING_CONTRIB_CLIENT_ID` variable and `GH_APP_ENGINEERING_CONTRIB_PRIVATE_KEY` secret configured (DevOps).
- Protected branches must allow verified commits from the engineering-contrib GitHub App.

## Configure release versions

Version numbers are configured in the workflow `env` block in [`.github/workflows/ci.yml`](../.github/workflows/ci.yml):

```yaml
RELEASE_VERSION: "7.3.4-A.1" # The version of the release (tag).
DEVELOPMENT_VERSION: "7.3.4-A.2-SNAPSHOT" # The version that will be set in pom files after the release (next dev version).
```

| Variable | Purpose | Example (alpha) | Example (GA) |
|----------|---------|-----------------|--------------|
| `RELEASE_VERSION` | Version to release and tag | `7.3.4-A.1` | `7.3.4` |
| `DEVELOPMENT_VERSION` | Next development version written to POMs after release (must end with `-SNAPSHOT`) | `7.3.4-A.2-SNAPSHOT` | `7.3.5-SNAPSHOT` |

Update both values in the **same commit** that triggers the release. The GitHub App bot does **not** modify `ci.yml`; you must update it again before the next release.

## Alpha release (Nexus)

Example: release `7.3.4-A.1` when preparing the next alpha cycle.

1. Update `RELEASE_VERSION` and `DEVELOPMENT_VERSION` in [`.github/workflows/ci.yml`](../.github/workflows/ci.yml):

   ```yaml
   RELEASE_VERSION: "7.3.4-A.1"
   DEVELOPMENT_VERSION: "7.3.4-A.2-SNAPSHOT"
   ```

2. Update all project `pom.xml` files to `${RELEASE_VERSION}-SNAPSHOT` (for example `7.3.4-A.1-SNAPSHOT`).

3. Commit and push to **`develop`** (or `release/**`) with `[release]` in the commit message, for example:

   ```text
   [release] Alfresco Java SDK 7.3.4-A.1 alpha
   ```

4. Wait for the CI workflow to finish. The `release` job runs only when:
   - `build_and_verify` succeeds
   - The branch is `develop` or `release/**`
   - The commit message contains `[release]`
   - The commit message does **not** contain `[no release]`

### What happens automatically

When the `release` job succeeds, CI will:

1. Set all POM versions to `RELEASE_VERSION`
2. Deploy artifacts to Alfresco Nexus
3. Create a **verified** bot commit for the release version
4. Create a Git tag named exactly `RELEASE_VERSION` (for example `7.3.4-A.1`)
5. Set all POM versions to `DEVELOPMENT_VERSION`
6. Create a **verified** bot commit for the next development version

You should **not** manually create Git tags. The bot commits for the release and post-release POM versions are created automatically.

### After an alpha release

On `develop` you should see:

- Git tag: `7.3.4-A.1` (plain version string from `RELEASE_VERSION`)
- Two new **Verified** commits from the engineering-contrib bot
- Root POM version: `7.3.4-A.2-SNAPSHOT`
- Artifacts on Alfresco Nexus for `7.3.4-A.1`

Before the next alpha, update `ci.yml` again (for example `7.3.4-A.2` / `7.3.4-A.3-SNAPSHOT`).

## GA release and Maven Central

For a GA release (version matching `major.minor.patch` with no suffix):

1. Update `RELEASE_VERSION` and `DEVELOPMENT_VERSION` in `ci.yml`, for example:

   ```yaml
   RELEASE_VERSION: "7.3.4"
   DEVELOPMENT_VERSION: "7.3.5-SNAPSHOT"
   ```

2. Update all project `pom.xml` files to `${RELEASE_VERSION}-SNAPSHOT` (for example `7.3.4-SNAPSHOT`).

3. Push to **`develop`** with both keywords in the **same** commit message:

   ```text
   [release][publish] Alfresco Java SDK 7.3.4
   ```

   To publish to Maven Central as part of the GA release, include `[publish]` in the **same** commit message as `[release]` so the workflow checks out the tagged `RELEASE_VERSION`.

   A standalone `[publish]` commit (without `[release]` in the same workflow run) will not have `needs.release.outputs.release_tag` set, so Maven Central publish will not target the released tag.

### Re-publish to Maven Central

If the publish step failed after a successful release, use **workflow_dispatch**:

1. Open the CI workflow in GitHub Actions.
2. Run workflow manually with:
   - `publish_to_maven_central`: `true`
   - `release_tag`: the existing tag (for example `7.3.4`)

## Commit message keywords

| Keyword | Effect |
|---------|--------|
| `[release]` | Run the automated Nexus release |
| `[publish]` | Run Maven Central publish (checkout uses release tag from the same workflow run) |
| `[no release]` | Skip the release job even if `[release]` would otherwise match |

## Troubleshooting

| Symptom | Likely cause |
|---------|----------------|
| Release job skipped | No `[release]` in commit message, wrong branch, or `build_and_verify` failed |
| App token step fails | GitHub App credentials not configured on the repository |
| Verified commit rejected | Branch protection or App permissions |
| Tag already exists | `RELEASE_VERSION` was released before |
| Deploy fails on generated REST API client POMs | `mvn versions:set` does not update POMs under `alfresco-acs-java-rest-api-lib/generated/`; the release job syncs them inline in `ci.yml` after each version bump |
| Maven Central publish failed | Missing `[publish]` on same commit as `[release]`, or use `workflow_dispatch` with `release_tag` |

## Related files

- [`.github/workflows/ci.yml`](../.github/workflows/ci.yml) — CI pipeline, release version configuration, and generated POM sync steps

## Related JIRA
- [ACS-12085](https://hyland.atlassian.net/browse/ACS-12085)
