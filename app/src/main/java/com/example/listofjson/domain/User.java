package com.example.listofjson.domain;

public class User {

    public final int id;
    public final String name;
    public final String userName;
    public final String email;
    public final Address address;
    public final String phone;
    public final String website;
    public final Company company;


    public User(int id, String name, String userName, String email, Address address, String phone, String website, Company company) {

        this.id = id;
        this.name = name;
        this.userName = userName;
        this.email = email;
        this.address = address;
        this.phone = phone;
        this.website = website;
        this.company = company;
    }

    @Override
    public String toString() {

        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", userName='" + userName + '\'' +
                ", email='" + email + '\'' +
                ", address=" + address +
                ", phone='" + phone + '\'' +
                ", website='" + website + '\'' +
                ", company=" + company +
                '}';
    }

    public String getName() {
        return this.name;
    }

    public int getId() {
        return this.id;
    }

    public String getUserName() {
        return this.userName;
    }

    public String getEmail() {
        return this.email;
    }

    public String getPhone() {
        return this.phone;
    }

    public String getWebsite() {
        return this.website;
    }

    public Address getAddress() {
        return this.address;
    }

    public Company getCompany() {
        return this.company;
    }



}