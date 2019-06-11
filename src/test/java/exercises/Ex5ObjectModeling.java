package exercises;

import io.restassured.specification.RequestSpecification;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

public class Ex5ObjectModeling {
    private static RequestSpecification requestSpec;

    /*************************************************************
     * Request specification should include our base URI
     * and base path pointing to posts collection
     ************************************************************/
    @BeforeAll
    public static void createSpecifications() {

    }

    /**********************************************************
     * Check the title of any post using deserialization.
     * You should create a new class Post.java that has the same
     * structure as the objects in the posts collection and
     * has a getter method for the title property.
     *********************************************************/
    @Test
    public void testGetPost() {

    }

    /**********************************************************
     * Add a new item to posts collection using serialization.
     * You should use the new class Post.java - create a new
     * instance of it and set it as the request body.
     * Make sure your Post.java class has a constructor.
     * Check that the response status code is 201 (created).
     *********************************************************/
    @Test
    public void testAddPost() {

    }
}
