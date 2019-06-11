package exercises;

import io.restassured.specification.RequestSpecification;
import io.restassured.specification.ResponseSpecification;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.params.ParameterizedTest;

public class Ex6DataDriven {
    private static RequestSpecification requestSpec;
    private static ResponseSpecification responseSpec;

    /*************************************************************
     * Create request and response specifications using builders
     * Request specification should include our base URI
     * Response specification should expect status code 200
     ************************************************************/
    @BeforeAll
    public static void createSpecifications() {

    }

    /*************************************************************
     * Use @ValueSource to test that todos items
     * having ids 1, 2, 3 are not completed
     ************************************************************/
    @ParameterizedTest
    public void testTodoIsIncomplete(int todoId) {

    }

    /*****************************************************************
     * Use @MethodSource to test the album size for albums 1, 2, 3
     * (album 1 = 50 photos, album 2 = 50 photos, album 3 = 50 photos)
     *****************************************************************/
    @ParameterizedTest
    public void testAlbumSizes(int albumId, int albumSize) {

    }

}
