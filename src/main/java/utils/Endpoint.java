package utils;

public enum Endpoint {
    USERS("/Users"),
    USER("/Users/{userId}");

    private final String url;

    Endpoint(String url) {
        this.url = url;
    }

    public String getUrl() {
        return this.url;
    }
}
