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
import model.Post;
import utils.Endpoint;

import static io.restassured.RestAssured.given;

public class PostsService {
    private static final String POST_ID_PATH_PARAM = "postId";
    private RequestSpecification requestSpecification;
    private ResponseSpecification responseSpecification;

    public PostsService() {
        setDefaultSpecifications();
    }

    public Post[] getPosts() {
        return given()
            .spec(requestSpecification)
            .get(Endpoint.POSTS.getUrl())
            .body().as(Post[].class);
    }

    public Post getPost(int id) {
        return given()
            .spec(requestSpecification)
            .pathParam(POST_ID_PATH_PARAM, id)
            .get(Endpoint.POST.getUrl())
            .body().as(Post.class);
    }

    public void addPost(Post post) {
        given()
            .spec(requestSpecification)
            .body(post)
            .post(Endpoint.POSTS.getUrl())
            .then().statusCode(201);
    }

    public void updatePost(Post post, int id) {
        given()
            .spec(requestSpecification)
            .body(post)
            .pathParam(POST_ID_PATH_PARAM, id)
            .put(Endpoint.POST.getUrl())
            .then().spec(responseSpecification);
    }

    public void deletePost(int id) {
        given()
            .spec(requestSpecification)
            .pathParam(POST_ID_PATH_PARAM, id)
            .delete(Endpoint.POST.getUrl())
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