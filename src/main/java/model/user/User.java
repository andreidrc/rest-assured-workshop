package model.user;

public class User {
    private long id;
    private String name;
    private String username;
    private String email;
    private String phone;
    private String website;
    private Address address;
    private Company company;

    private long getId() {
        return id;
    }

    private void setId(long id) {
        this.id = id;
    }

    private String getName() {
        return name;
    }

    private void setName(String name) {
        this.name = name;
    }

    private String getUsername() {
        return username;
    }

    private void setUsername(String username) {
        this.username = username;
    }

    private String getEmail() {
        return email;
    }

    private void setEmail(String email) {
        this.email = email;
    }

    private String getPhone() {
        return phone;
    }

    private void setPhone(String phone) {
        this.phone = phone;
    }

    private String getWebsite() {
        return website;
    }

    private void setWebsite(String website) {
        this.website = website;
    }

    private Address getAddress() {
        return address;
    }

    private void setAddress(Address address) {
        this.address = address;
    }

    private Company getCompany() {
        return company;
    }

    private void setCompany(Company company) {
        this.company = company;
    }
}
