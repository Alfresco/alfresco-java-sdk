/*
 * Copyright 2010-2021 Alfresco Software, Ltd.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *       http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License.
 */
package org.alfresco.event.sdk.model.v1.model;

import java.util.Objects;

/**
 * @author Jamal Kaabi-Mofrad
 */
public class UserInfo {

    private String id;
    private String displayName;

    public UserInfo() {
    }

    public UserInfo(final String id, final String firstName, final String lastName) {
        this.id = id;
        this.displayName = ((firstName != null ? firstName + " " : "") + (lastName != null ? lastName : "")).trim();
    }

    public String getId() {
        return id;
    }

    public String getDisplayName() {
        return displayName;
    }

    @Override
    public boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof UserInfo)) {
            return false;
        }
        final UserInfo userInfo = (UserInfo) o;
        return Objects.equals(id, userInfo.id)
                && Objects.equals(displayName, userInfo.displayName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, displayName);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder(100);
        sb.append("UserInfo [id=").append(id)
                .append(", displayName=").append(displayName)
                .append(']');

        return sb.toString();
    }
}
