package model.user;

public class Address {
    private String street;
    private String suite;
    private String city;
    private String zipcode;

    private String getStreet() {
        return street;
    }

    private void setStreet(String street) {
        this.street = street;
    }

    private String getSuite() {
        return suite;
    }

    private void setSuite(String suite) {
        this.suite = suite;
    }

    private String getCity() {
        return city;
    }

    private void setCity(String city) {
        this.city = city;
    }

    private String getZipcode() {
        return zipcode;
    }

    private void setZipcode(String zipcode) {
        this.zipcode = zipcode;
    }
}
