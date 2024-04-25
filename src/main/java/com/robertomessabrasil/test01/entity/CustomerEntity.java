package com.robertomessabrasil.test01.entity;

public class CustomerEntity {

    private long id;
    private String name;

    public CustomerEntity createCustomer(String name) {

        this.name = name;

        return this;

    }

    @Override
    public String toString() {
        return "CustomerEntity{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
