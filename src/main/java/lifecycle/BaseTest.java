package lifecycle;

import io.restassured.RestAssured;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.TestInfo;

import java.util.logging.Logger;

public class BaseTest {
    private static final Logger LOG = Logger.getLogger(BaseTest.class.getName());
    private static final String BASE_URI = "http://localhost:3000";

    @BeforeAll
    static void classSetup(TestInfo testInfo) {
        LOG.info(() -> String.format("Executing tests from class %s", testInfo.getTestClass().get().getName()));
        RestAssured.baseURI = BASE_URI;
    }

    @BeforeEach
    void testSetup(TestInfo testInfo) {
        LOG.info(() -> String.format("About to execute [%s]", testInfo.getDisplayName()));
        RestAssured.enableLoggingOfRequestAndResponseIfValidationFails();
    }

    @AfterEach
    void testTeardown(TestInfo testInfo) {
        LOG.info(() -> String.format("Finished executing [%s]", testInfo.getDisplayName()));
    }

    @AfterAll
    static void classTeardown(TestInfo testInfo) {
        LOG.info(() -> String.format("Done executing tests for class %s", testInfo.getTestClass().get().getName()));
    }
}