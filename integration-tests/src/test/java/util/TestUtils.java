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
package util;

import org.apache.commons.lang3.RandomStringUtils;

/**
 * Utility class for testing.
 */
public class TestUtils {

    public static String getRandomSiteName() {
        return "java-sdk-test-site-" + RandomStringUtils.randomNumeric(8);
    }

    public static String getRandomGroupName() {
        return "java-sdk-test-group-" + RandomStringUtils.randomNumeric(8);
    }

    public static String getRandomTagName() {
        return "java-sdk-test-tag-" + RandomStringUtils.randomNumeric(8);
    }

    public static String getRandomNodeName() {
        return "java-sdk-test-node-" + RandomStringUtils.randomNumeric(8);
    }
}
