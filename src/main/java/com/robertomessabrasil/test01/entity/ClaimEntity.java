package com.robertomessabrasil.test01.entity;

import java.time.LocalDateTime;

public class ClaimEntity {

    private long id;
    private CarEntity car;
    private CarDriverEntity carDriver;
    private LocalDateTime eventDate;

    public ClaimEntity createClaim(CarEntity carEntity, CarDriverEntity carDriverEntity, LocalDateTime eventDate) {

        this.car = carEntity;
        this.carDriver = carDriverEntity;
        this.eventDate = eventDate;

        return this;

    }

    @Override
    public String toString() {
        return "ClaimEntityEntity{" +
                "id=" + id +
                ", car=" + car +
                ", carDriver=" + carDriver +
                ", eventDate=" + eventDate +
                '}';
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public CarEntity getCar() {
        return car;
    }

    public void setCar(CarEntity car) {
        this.car = car;
    }

    public CarDriverEntity getCarDriver() {
        return carDriver;
    }

    public void setCarDriver(CarDriverEntity carDriver) {
        this.carDriver = carDriver;
    }

    public LocalDateTime getEventDate() {
        return eventDate;
    }

    public void setEventDate(LocalDateTime eventDate) {
        this.eventDate = eventDate;
    }
}
