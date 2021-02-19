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
/**
 * NOTE: This class is auto generated by the swagger code generator program (2.4.10).
 * https://github.com/swagger-api/swagger-codegen
 * Do not edit the class manually.
 */
package org.alfresco.search.sql.handler;

import org.alfresco.search.sql.model.Error;
import org.alfresco.search.sql.model.SQLResultSetPaging;
import org.alfresco.search.sql.model.SQLSearchRequest;
import io.swagger.annotations.*;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.multipart.MultipartFile;

import javax.validation.Valid;
import javax.validation.constraints.*;
import java.util.List;

@Api(value = "Sql")
public interface SqlApi {

    @ApiOperation(value = "Alfresco Insight Engine SQL Passthrough", nickname = "search", notes = "**Note**: this endpoint is available in Alfresco 6.0 and newer versions. This will require Insight Engine and will not work with Alfresco Search Services.  **You specify all the parameters in this API in a JSON body**, A basic query looks like this:  ```JSON {   \"stmt\": \"select * from alfresco\",   \"locales\": [\"en_UK\"]   \"timezone\": \"Europe/London\"   \"includeMetadata\":true } ```  **Note:** the minimum possible query parameter required. ```JSON {   \"stmt\": } ``` The expected reponse will appear in the Alfresco format as seen below. ```JSON {   \"list\": {     \"pagination\": {       \"count\": 1,       \"hasMoreItems\": false,       \"totalItems\": 1,       \"skipCount\": 0,       \"maxItems\": 100   },   \"entries\": [{     \"entry\": [       {         \"label\": \"aliases\",         \"value\": \"{\\\"SITE\\\":\\\"site\\\"}\"       },       {         \"label\": \"isMetadata\",         \"value\": \"true\"       },       {         \"label\": \"fields\",         \"value\": \"[\\\"SITE\\\"]\"       }     ]   }]}}   ```   To override the default format set the format to solr.   ```JSON   {     \"stmt\": \"select * from alfresco\",     \"format\": \"solr\"   } ``` This will return Solr's output response. ```JSON {   \"result-set\": {   \"docs\": [     {       \"aliases\": {       \"SITE\": \"site\"     },       \"isMetadata\": true,       \"fields\": [ \"SITE\"]     },     {         \"RESPONSE_TIME\": 23,         \"EOF\": true     }   ]} } ```   You can use the **locales parameter** to filter results based on locale. ```JSON \"locales\": [\"en_UK\", \"en_US\"] ```  To include timezone in the query add the **timezone parameter**. ```JSON \"timezone\": \"Japan\" ```  To include custom filter queries add the **filterQueries parameter**. ```JSON \"filterQueries\": [\"-SITE:swsdp\"] ```  You can use the **includeMetadata parameter** to include addtional  information, this is by default set to false.  ```JSON \"includeMetadata\": \"false\" ``` Please note that if its set to true the first entry will represent the metdata requested   ```JSON  {    \"stmt\": \"select site from alfresco limit 2\",    \"includeMetadata\":true  } ``` The expected response: ```JSON \"entries\": [   {     #First entry holds the Metadata infromation as set by {includeMetadata:true}     \"entry\": [       {         \"label\": \"aliases\",         \"value\": \"{\\\"SITE\\\":\\\"site\\\"}\"        },       {         \"label\": \"isMetadata\",         \"value\": \"true\"       },       {         \"label\": \"fields\",         \"value\": \"[\\\"SITE\\\"]\"       }     ]     #end of Metadata   },   {     #Query result entry value.     \"entry\": [       {         \"label\": \"site\",         \"value\": \"[\\\"test\\\"]\"       }     ]   },   {     \"entry\": [     {       \"label\": \"site\",       \"value\": \"[\\\"test\\\"]\"     }     ]   } ] ``` ", response = SQLResultSetPaging.class, authorizations = {
        @Authorization(value = "basicAuth")
    }, tags={ "sql", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Successful response", response = SQLResultSetPaging.class),
        @ApiResponse(code = 200, message = "Unexpected error", response = Error.class) })
    @RequestMapping(value = "/sql",
        produces = "application/json", 
        consumes = "application/json",
        method = RequestMethod.POST)
    ResponseEntity<SQLResultSetPaging> search(@ApiParam(value = "Generic query API " ,required=true )  @Valid @RequestBody SQLSearchRequest queryBody);

}
