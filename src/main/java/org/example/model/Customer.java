package org.example.model;

public class Customer {
    private String id;
    private String name;
    private String city;

    public Customer(String id, String name, String city) {

        this.id = id;
        this.name = name;
        this.city = city;
    }

    public Customer(String cu) {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", city='" + city + '\'' +
                '}';
    }
}