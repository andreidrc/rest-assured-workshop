package example;

import lifecycle.TestSetup;
import model.Comment;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import service.CommentsService;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

@ExtendWith(TestSetup.class)
public class CommentsTest {
    private static CommentsService commentsService;

    @BeforeAll
    public static void BeforeTests() {
        commentsService = new CommentsService();
    }

    @Test
    @DisplayName("Get all comments")
    public void getAllComments() {
        Comment[] allComments= commentsService.getComments();
        assertEquals(allComments.length, 9, "Wrong!!!");
        assertTrue(allComments[0].getBody().contains("quasi"));
    }
}
