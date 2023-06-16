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
package org.alfresco.core.handler;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import io.swagger.annotations.Authorization;
import java.util.List;
import jakarta.validation.Valid;
import org.alfresco.core.model.NodeEntry;
import org.springframework.cloud.openfeign.CollectionFormat;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.multipart.MultipartFile;

@Api(value = "Content")
public interface ContentApi {

    @ApiOperation(value = "Create a node", nickname = "createNode", notes = "**Note:** this endpoint is available in Alfresco 5.2 and newer versions.  Create a node and add it as a primary child of node **nodeId**.  This endpoint supports both JSON and multipart/form-data (file upload).  **Using multipart/form-data**  Use the **filedata** field to represent the content to upload, for example, the following curl command will create a node with the contents of test.txt in the test user's home folder.  ```curl -utest:test -X POST host:port/alfresco/api/-default-/public/alfresco/versions/1/nodes/-my-/children -F filedata=@test.txt```  You can use the **name** field to give an alternative name for the new file.  You can use the **nodeType** field to create a specific type. The default is cm:content.  You can use the **renditions** field to create renditions (e.g. doclib) asynchronously upon upload. Also, as requesting rendition is a background process, any rendition failure (e.g. No transformer is currently available) will not fail the whole upload and has the potential to silently fail.  Use **overwrite** to overwrite an existing file, matched by name. If the file is versionable, the existing content is replaced.  When you overwrite existing content, you can set the **majorVersion** boolean field to **true** to indicate a major version should be created. The default for **majorVersion** is **false**. Setting  **majorVersion** enables versioning of the node, if it is not already versioned.  When you overwrite existing content, you can use the **comment** field to add a version comment that appears in the version history. This also enables versioning of this node, if it is not already versioned.  You can set the **autoRename** boolean field to automatically resolve name clashes. If there is a name clash, then the API method tries to create a unique name using an integer suffix.  You can use the **relativePath** field to specify the folder structure to create relative to the node **nodeId**. Folders in the **relativePath** that do not exist are created before the node is created.  Any other field provided will be treated as a property to set on the newly created node.  **Note:** setting properties of type d:content and d:category are not supported.  **Note:** When creating a new node using multipart/form-data by default versioning is enabled and set to MAJOR Version. Since Alfresco 6.2.3 **versioningEnabled** flag was introduced offering better control over the new node Versioning.  | **versioningEnabled** | **majorVersion** | **Version Type** | |-----------------------|------------------|------------------| |        unset          |        unset     |    MAJOR         | |        unset          |        true      |    MAJOR         | |        unset          |        false     |    MINOR         | |        true           |        unset     |    MAJOR         | |        true           |        true      |    MAJOR         | |        true           |        false     |    MINOR         | |        false          |        true      |    Unversioned   | |        false          |        false     |    Unversioned   | |        false          |        true      |    Unversioned   | <br> ", response = NodeEntry.class, authorizations = {
        @Authorization(value = "basicAuth")
    }, tags={ "nodes", })
    @ApiResponses(value = {
        @ApiResponse(code = 201, message = "Successful response", response = NodeEntry.class),
        @ApiResponse(code = 400, message = "Invalid parameter: **nodeId** is not a valid format"),
        @ApiResponse(code = 401, message = "Authentication failed"),
        @ApiResponse(code = 403, message = "Current user does not have permission to create children of **nodeId**"),
        @ApiResponse(code = 404, message = "**nodeId** or **renditionId** does not exist "),
        @ApiResponse(code = 409, message = "New name clashes with an existing node in the current parent folder"),
        @ApiResponse(code = 413, message = "Content exceeds individual file size limit configured for the network or system"),
        @ApiResponse(code = 415, message = "Content Type is not supported"),
        @ApiResponse(code = 422, message = "Model integrity exception including a file name containing invalid characters"),
        @ApiResponse(code = 507, message = "Content exceeds overall storage quota limit configured for the network or system"),
        @ApiResponse(code = 200, message = "Unexpected error", response = Error.class) })
    @RequestMapping(value = "/nodes/{nodeId}/children",
        produces = "application/json",
        consumes = "multipart/form-data",
        method = RequestMethod.POST)
    @CollectionFormat(feign.CollectionFormat.CSV)
    ResponseEntity<NodeEntry> createNode(@ApiParam(value = "The identifier of a node. You can also use one of these well-known aliases: * -my- * -shared- * -root- ",required=true) @PathVariable("nodeId") String nodeId, @ApiParam(value = "The content to upload." ,required=true ) @RequestPart("filedata") MultipartFile filedata, @ApiParam(value = "Alternative name for the new file.") @RequestPart(value = "name", required = false) String name, @ApiParam(value = "Specific type. The default is cm:content.") @RequestPart(value = "nodeType", required = false) String nodeType, @ApiParam(value = "You can use the renditions field to create renditions (e.g. doclib) asynchronously upon upload.") @RequestPart(value = "renditions", required = false) List<String> renditions, @ApiParam(value = "overwrite an existing file, matched by name. If the file is versionable, the existing content is replaced.") @RequestPart(value = "overwrite", required = false) Boolean overwrite, @ApiParam(value = "When you overwrite existing content, you can set the majorVersion boolean field to true to indicate a major version should be created. The default for majorVersion is false. Setting majorVersion enables versioning of the node, if it is not already versioned.") @RequestPart(value = "majorVersion", required = false) Boolean majorVersion, @ApiParam(value = "When you overwrite existing content, you can use the comment field to add a version comment that appears in the version history. This also enables versioning of this node, if it is not already versioned.") @RequestPart(value = "comment", required = false) String comment, @ApiParam(value = "You can set the autoRename boolean field to automatically resolve name clashes. If there is a name clash, then the API method tries to create a unique name using an integer suffix.") @RequestPart(value = "autoRename", required = false) Boolean autoRename, @ApiParam(value = "You can use the relativePath field to specify the folder structure to create relative to the node nodeId. Folders in the relativePath that do not exist are created before the node is created.") @RequestPart(value = "relativePath", required = false) String relativePath, @ApiParam(value = "If true, then created node will be versioned. If false, then created node will be unversioned and auto-versioning disabled.") @RequestPart(value = "versioningEnabled", required = false) Boolean versioningEnabled, @ApiParam(value = "Returns additional information about the node. The following optional fields can be requested: * allowableOperations * association * isLink * isFavorite * isDirectLinkEnabled * isLocked * path * permissions * definition ") @Valid @RequestParam(value = "include", required = false) List<String> include, @ApiParam(value = "A list of field names.  You can use this parameter to restrict the fields returned within a response if, for example, you want to save on overall bandwidth.  The list applies to a returned individual entity or entries within a collection.  If the API method also supports the **include** parameter, then the fields specified in the **include** parameter are returned in addition to those specified in the **fields** parameter. ") @Valid @RequestParam(value = "fields", required = false) List<String> fields);
}
