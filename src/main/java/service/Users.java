package service;

import io.restassured.RestAssured;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.builder.ResponseSpecBuilder;
import io.restassured.config.ObjectMapperConfig;
import io.restassured.config.RestAssuredConfig;
import io.restassured.http.ContentType;
import io.restassured.mapper.ObjectMapperType;
import io.restassured.specification.RequestSpecification;
import io.restassured.specification.ResponseSpecification;
import model.user.User;
import utils.Endpoint;

import static io.restassured.RestAssured.given;

public class Users {
    private static final String USER_ID_PATH_PARAM = "userId";
    private RequestSpecification requestSpecification;
    private ResponseSpecification responseSpecification;

    public Users() {
        setDefaultSpecifications();
    }

    public User[] getUsers() {
        return given()
            .spec(requestSpecification)
            .get(Endpoint.USERS.getUrl())
            .body().as(User[].class);
    }

    public User getUser(int id) {
        return given()
            .spec(requestSpecification)
            .pathParam(USER_ID_PATH_PARAM, id)
            .get(Endpoint.USER.getUrl())
            .body().as(User.class);
    }

    public void addUser(User user) {
        given()
            .spec(requestSpecification)
            .body(user)
            .post(Endpoint.USERS.getUrl())
            .then().statusCode(201);
    }

    public void updateUser(User user, int userId) {
        given()
            .spec(requestSpecification)
            .body(user)
            .pathParam(USER_ID_PATH_PARAM, userId)
            .put(Endpoint.USER.getUrl())
            .then().spec(responseSpecification);
    }

    public void deleteUser(int userId) {
        given()
            .spec(requestSpecification)
            .pathParam(USER_ID_PATH_PARAM, userId)
            .delete(Endpoint.USER.getUrl())
            .then().spec(responseSpecification);
    }

    private void setDefaultSpecifications() {
        setDefaultRequestSpecification();
        setDefaultResponseSpecification();
    }

    private void setDefaultRequestSpecification() {
        this.requestSpecification = new RequestSpecBuilder()
            .setContentType(ContentType.JSON)
            .setConfig(getGsonMapper())
            .build();
    }

    private void setDefaultResponseSpecification() {
        ResponseSpecBuilder builder = new ResponseSpecBuilder();
        builder.expectStatusCode(200);
        this.responseSpecification = builder.build();
    }

    private RestAssuredConfig getGsonMapper() {
        return RestAssured.config().objectMapperConfig(new ObjectMapperConfig(ObjectMapperType.GSON));
    }
}