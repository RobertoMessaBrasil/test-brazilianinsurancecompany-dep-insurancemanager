package com.robertomessabrasil.test01.entity;

import java.time.LocalDateTime;

public class InsuranceEntity {

    private long id;
    private CustomerEntity customer;
    private CarEntity car;
    private LocalDateTime created;
    private LocalDateTime updated;
    private boolean active;

    public InsuranceEntity createInsurance(CustomerEntity customerEntity, CarEntity carEntity, boolean active, LocalDateTime dateTime) {

        this.customer = customerEntity;
        this.car = carEntity;
        this.created = dateTime;
        this.updated = dateTime;
        this.active = active;

        return this;

    }

    @Override
    public String toString() {
        return "InsuranceEntity{" +
                "id=" + id +
                ", customer=" + customer +
                ", car=" + car +
                ", created=" + created +
                ", updated=" + updated +
                ", active=" + active +
                '}';
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public CustomerEntity getCustomer() {
        return customer;
    }

    public void setCustomer(CustomerEntity customer) {
        this.customer = customer;
    }

    public CarEntity getCar() {
        return car;
    }

    public void setCar(CarEntity car) {
        this.car = car;
    }

    public LocalDateTime getCreated() {
        return created;
    }

    public void setCreated(LocalDateTime created) {
        this.created = created;
    }

    public LocalDateTime getUpdated() {
        return updated;
    }

    public void setUpdated(LocalDateTime updated) {
        this.updated = updated;
    }

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }
}
