/*
 * Copyright 2021-2021 Alfresco Software, Ltd.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.alfresco.core;

import static org.assertj.core.api.Assertions.assertThat;

import org.alfresco.AbstractFolderBasedIntegrationTest;
import org.alfresco.core.handler.TagsApiClient;
import org.alfresco.core.model.TagBody;
import org.alfresco.core.model.TagEntry;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.ResponseEntity;
import util.TestUtils;

/**
 * Integration tests for {@link TagsApiClient}.
 */
@SpringBootTest
@Disabled
public class TagsApiServiceIntegrationTest extends AbstractFolderBasedIntegrationTest {

    @Autowired
    private TagsApiClient tagsApiClient;

    @Test
    void should_createTagAndGetTag() {
        String tagName = TestUtils.getRandomTagName();
        TagBody tagBody = new TagBody();
        tagBody.setTag(tagName);
        ResponseEntity<TagEntry> createTagForNodeResponse = tagsApiClient.createTagForNode(testNode.getId(), tagBody, null);
        ResponseEntity<TagEntry> getTagResponse = tagsApiClient.getTag(createTagForNodeResponse.getBody().getEntry().getId(), null, null);

        assertThat(createTagForNodeResponse.getBody().getEntry().getTag()).isEqualTo(tagName);
        assertThat(getTagResponse.getBody().getEntry().getTag()).isEqualTo(tagName);
    }

    @Test
    void should_deleteTag() {
        String tagName = TestUtils.getRandomTagName();
        TagBody tagBody = new TagBody();
        tagBody.setTag(tagName);
        ResponseEntity<TagEntry> createTagForNodeResponse = tagsApiClient.createTagForNode(testNode.getId(), tagBody, null);
        tagsApiClient.deleteTagFromNode(testNode.getId(), createTagForNodeResponse.getBody().getEntry().getId());

        assertThat(tagsApiClient.listTagsForNode(testNode.getId(), null, null, null).getBody().getList().getPagination().getTotalItems()).isEqualTo(0);
    }

    @Test
    void should_updateTag() {
        String tagName = TestUtils.getRandomTagName();
        TagBody tagBody = new TagBody();
        tagBody.setTag(tagName);
        ResponseEntity<TagEntry> createTagForNodeResponse = tagsApiClient.createTagForNode(testNode.getId(), tagBody, null);

        String updatedTagName = TestUtils.getRandomTagName();
        tagBody.setTag(updatedTagName);
        ResponseEntity<TagEntry> updateTagResponse = tagsApiClient.updateTag(createTagForNodeResponse.getBody().getEntry().getId(), tagBody, null, null);

        assertThat(createTagForNodeResponse.getBody().getEntry().getTag()).isEqualTo(tagName);
        assertThat(updateTagResponse.getBody().getEntry().getTag()).isEqualTo(updatedTagName);
    }
}
