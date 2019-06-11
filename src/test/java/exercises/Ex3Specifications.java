package exercises;

import io.restassured.specification.RequestSpecification;
import io.restassured.specification.ResponseSpecification;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

public class Ex3Specifications {
    private static RequestSpecification requestSpec;
    private static ResponseSpecification responseSpec;

    /*************************************************************
     * Create request and response specifications using builders
     * Request specification should include our base URI and
     * a base path that points to comments collection
     * Response specification should expect status code 200
     ************************************************************/
    @BeforeAll
    public static void createSpecifications() {

    }

    /**********************************************************
     * Delete the comment with ID 1 (use both specifications)
     *********************************************************/
    @Test
    public void testDeleteComment() {

    }

    /**********************************************************
     * Update the comment with ID 2
     * (use both specifications)
     *********************************************************/
    @Test
    public void testAddComment() {

    }
}