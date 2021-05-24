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

public class Constants {

    public static class TestContainers {

        public static final String SERVICE_NAME = "alfresco";
        public static final int SERVICE_PORT = 8080;
        public static final long TIMEOUT_DURATION = 90;
    }

    public static class Timeouts {

        public static final long TWO_MINUTES_IN_MILLIS = 120_000;
        public static final long POLL_DELAY_IN_MILLIS = 100_000;
    }

    public static class NodeIds {

        public static String MY_NODE = "-my-";
    }

    public static class NodeTypes {

        public static String FOLDER = "cm:folder";
        public static String FILE = "cm:content";
    }

    public static class PersonIds {

        public static String CURRENT_USER = "-me-";
    }
}
