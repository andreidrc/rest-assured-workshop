package exercises;

import io.restassured.specification.RequestSpecification;
import io.restassured.specification.ResponseSpecification;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

public class Ex4ResponseBody {
    private static RequestSpecification requestSpec;
    private static ResponseSpecification responseSpec;

    /*************************************************************
     * Request specification should include our base URI and
     * a base path that points to todos collection
     * Response specification should expect status code 200
     ************************************************************/
    @BeforeAll
    public static void createSpecifications() {

    }

    /**********************************************************
     * Verify correctness of the todo item with ID 1
     * using only body matchers on all of its properties
     *********************************************************/
    @Test
    public void testPropertiesOfFirstTodoItem() {

    }

    /**********************************************************
     * Verify correctness of the todo item with ID 1
     * using containsString matcher
     *********************************************************/
    @Test
    public void testFirstTodoItemResponseString() {

    }
}
