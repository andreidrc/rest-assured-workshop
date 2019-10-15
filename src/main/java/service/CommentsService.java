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
import model.Comment;
import utils.Endpoint;

import static io.restassured.RestAssured.given;

public class CommentsService {
    private static final String COMMENT_ID_PATH_PARAM = "commentId";
    private RequestSpecification requestSpecification;
    private ResponseSpecification responseSpecification;

    public CommentsService() {
        setDefaultSpecifications();
    }

    public Comment[] getComments() {
        return given()
            .spec(requestSpecification)
            .get(Endpoint.COMMENTS.getUrl())
            .body().as(Comment[].class);
    }

    public Comment getComment(int id) {
        return given()
            .spec(requestSpecification)
            .pathParam(COMMENT_ID_PATH_PARAM, id)
            .get(Endpoint.COMMENT.getUrl())
            .body().as(Comment.class);
    }

    public void addComment(Comment comment) {
        given()
            .spec(requestSpecification)
            .body(comment)
            .post(Endpoint.COMMENTS.getUrl())
            .then().statusCode(201);
    }

    public void updateComment(Comment comment, int id) {
        given()
            .spec(requestSpecification)
            .body(comment)
            .pathParam(COMMENT_ID_PATH_PARAM, id)
            .put(Endpoint.COMMENT.getUrl())
            .then().spec(responseSpecification);
    }

    public void deleteComment(int id) {
        given()
            .spec(requestSpecification)
            .pathParam(COMMENT_ID_PATH_PARAM, id)
            .delete(Endpoint.COMMENT.getUrl())
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
        this.responseSpecification = new ResponseSpecBuilder()
            .expectStatusCode(200)
            .build();
    }

    private RestAssuredConfig getGsonMapper() {
        return RestAssured.config().objectMapperConfig(new ObjectMapperConfig(ObjectMapperType.GSON));
    }
}