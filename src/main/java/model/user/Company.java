package model.user;

public class Company {
    private String name;
    private String catchphrase;
    private String bs;

    private String getName() {
        return name;
    }

    private void setName(String name) {
        this.name = name;
    }

    private String getCatchphrase() {
        return catchphrase;
    }

    private void setCatchphrase(String catchphrase) {
        this.catchphrase = catchphrase;
    }

    private String getBs() {
        return bs;
    }

    private void setBs(String bs) {
        this.bs = bs;
    }
}
