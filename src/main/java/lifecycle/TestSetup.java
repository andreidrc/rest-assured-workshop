package lifecycle;

import io.restassured.RestAssured;
import org.junit.jupiter.api.extension.*;

import java.util.logging.Logger;

public class TestSetup implements BeforeAllCallback, AfterAllCallback, BeforeEachCallback, AfterEachCallback {
    private static final Logger LOG = Logger.getLogger(TestSetup.class.getName());
    private static final String BASE_URI = "https://jsonplaceholder.typicode.com";

    @Override
    public void beforeAll(ExtensionContext context) throws Exception {
        LOG.info(() -> String.format("Executing tests from class %s", context.getTestClass().get().getName()));
        RestAssured.baseURI = BASE_URI;
    }

    @Override
    public void beforeEach(ExtensionContext context) throws Exception {
        LOG.info(() -> String.format("About to execute [%s]", context.getDisplayName()));
        RestAssured.enableLoggingOfRequestAndResponseIfValidationFails();
    }

    @Override
    public void afterAll(ExtensionContext context) throws Exception {
        LOG.info(() -> String.format("Done executing tests for class %s", context.getTestClass().get().getName()));
    }


    @Override
    public void afterEach(ExtensionContext context) throws Exception {
        LOG.info(() -> String.format("Finished executing [%s]", context.getDisplayName()));
    }

}
