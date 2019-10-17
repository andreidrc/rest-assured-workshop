package utils;

public enum Endpoint {
    COMMENTS("/comments"),
    COMMENT("/comments/{commentId}");

    private final String url;

    Endpoint(String url) {
        this.url = url;
    }

    public String getUrl() {
        return this.url;
    }
}
