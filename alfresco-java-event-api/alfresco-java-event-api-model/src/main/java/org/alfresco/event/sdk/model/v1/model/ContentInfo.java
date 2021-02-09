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
package org.alfresco.event.sdk.model.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import java.util.Objects;

/**
 * @author Jamal Kaabi-Mofrad
 */
@JsonInclude(Include.NON_NULL)
public class ContentInfo {

    private String mimeType;
    private Long sizeInBytes;
    private String encoding;

    public ContentInfo() {
    }

    public ContentInfo(final String mimeType, final Long sizeInBytes, final String encoding) {
        this.mimeType = mimeType;
        this.sizeInBytes = sizeInBytes;
        this.encoding = encoding;
    }

    public String getMimeType() {
        return mimeType;
    }

    public Long getSizeInBytes() {
        return sizeInBytes;
    }

    public String getEncoding() {
        return encoding;
    }

    @Override
    public boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ContentInfo)) {
            return false;
        }
        final ContentInfo that = (ContentInfo) o;
        return Objects.equals(mimeType, that.mimeType)
                && Objects.equals(sizeInBytes, that.sizeInBytes)
                && Objects.equals(encoding, that.encoding);
    }

    @Override
    public int hashCode() {
        return Objects.hash(mimeType, sizeInBytes, encoding);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder(100);
        sb.append("ContentInfo [mimeType=").append(mimeType)
                .append(", sizeInBytes=").append(sizeInBytes)
                .append(", encoding=").append(encoding)
                .append(']');
        return sb.toString();
    }
}
