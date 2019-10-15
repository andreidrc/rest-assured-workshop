package utils;

public enum Endpoint {
    COMMENTS("/Comments"),
    COMMENT("/Comments/{commentId}");

    private final String url;

    Endpoint(String url) {
        this.url = url;
    }

    public String getUrl() {
        return this.url;
    }
}
