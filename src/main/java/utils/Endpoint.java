package utils;

public enum Endpoint {
    POSTS("/Posts"),
    POST("/Post/{postId}");

    private final String url;

    Endpoint(String url) {
        this.url = url;
    }

    public String getUrl() {
        return this.url;
    }
}
