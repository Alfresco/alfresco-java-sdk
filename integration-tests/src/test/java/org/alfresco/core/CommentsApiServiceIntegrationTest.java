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
import static org.awaitility.Awaitility.await;

import java.util.concurrent.TimeUnit;
import org.alfresco.AbstractFolderBasedIntegrationTest;
import org.alfresco.core.handler.CommentsApiClient;
import org.alfresco.core.model.CommentBody;
import org.alfresco.core.model.CommentEntry;
import org.alfresco.core.model.CommentPaging;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.ResponseEntity;

/**
 * Integration tests for {@link CommentsApiClient}.
 */
@SpringBootTest
public class CommentsApiServiceIntegrationTest extends AbstractFolderBasedIntegrationTest {

    public static final String TEST_COMMENT = "Test comment";

    @Autowired
    private CommentsApiClient commentsApiClient;

    @Test
    void should_createCommentAndListComments() {
        CommentBody commentBody = new CommentBody();
        commentBody.setContent(TEST_COMMENT);

        ResponseEntity<CommentEntry> createCommentResponse = commentsApiClient.createComment(testNode.getId(), commentBody, null);
        ensureCommentCreation();
        ResponseEntity<CommentPaging> listCommentsResponse = commentsApiClient.listComments(testNode.getId(), null, null, null);

        assertThat(createCommentResponse.getBody()).isNotNull();
        assertThat(createCommentResponse.getBody().getEntry().getContent()).isEqualTo(commentBody.getContent());
        assertThat(listCommentsResponse.getBody().getList().getEntries()).isNotNull();
        assertThat(listCommentsResponse.getBody().getList().getEntries().get(0).getEntry().getContent()).isEqualTo(commentBody.getContent());
    }

    @Test
    void should_updateComment() {
        CommentBody commentBody = new CommentBody();
        commentBody.setContent(TEST_COMMENT);
        CommentBody updateCommentBody = new CommentBody();
        updateCommentBody.setContent("Updated comment");

        ResponseEntity<CommentEntry> createCommentResponse = commentsApiClient.createComment(testNode.getId(), commentBody, null);
        ensureCommentCreation();
        ResponseEntity<CommentEntry> updateCommentResponse = commentsApiClient
            .updateComment(testNode.getId(), createCommentResponse.getBody().getEntry().getId(), updateCommentBody, null);

        assertThat(updateCommentResponse.getBody().getEntry().getContent()).isEqualTo(updateCommentBody.getContent());
    }

    @Test
    void should_deleteComment() {
        CommentBody commentBody = new CommentBody();
        commentBody.setContent(TEST_COMMENT);

        ResponseEntity<CommentEntry> createCommentResponse = commentsApiClient.createComment(testNode.getId(), commentBody, null);
        ensureCommentCreation();
        commentsApiClient.deleteComment(testNode.getId(), createCommentResponse.getBody().getEntry().getId());

        assertThat(commentsApiClient.listComments(testNode.getId(), null, null, null).getBody().getList().getEntries().isEmpty())
            .isTrue();
    }

    private void ensureCommentCreation() {
        await()
            .atMost(10_000, TimeUnit.MILLISECONDS)
            .pollDelay(2_000, TimeUnit.MILLISECONDS)
            .untilAsserted(() ->
                assertThat(commentsApiClient.listComments(testNode.getId(), null, null, null)
                    .getBody().getList().getPagination().getTotalItems())
                    .isEqualTo(1));
    }
}
