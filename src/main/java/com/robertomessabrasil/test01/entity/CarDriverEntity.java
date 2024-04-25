package com.robertomessabrasil.test01.entity;

public class CarDriverEntity  {

    private long id;
    private DriverEntity driver;
    private CarEntity car;
    private boolean mainDriver;

    public CarDriverEntity createCarDriver(CarEntity carEntity, DriverEntity driverEntity, boolean mainDriver) {

        this.driver = driverEntity;
        this.car = carEntity;
        this.mainDriver = mainDriver;

        return this;

    }

    @Override
    public String toString() {
        return "CarDriverEntity{" +
                "id=" + id +
                ", driver=" + driver +
                ", car=" + car +
                ", mainDriver=" + mainDriver +
                '}';
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public DriverEntity getDriver() {
        return driver;
    }

    public void setDriver(DriverEntity driver) {
        this.driver = driver;
    }

    public CarEntity getCar() {
        return car;
    }

    public void setCar(CarEntity car) {
        this.car = car;
    }

    public boolean isMainDriver() {
        return mainDriver;
    }

    public void setMainDriver(boolean mainDriver) {
        this.mainDriver = mainDriver;
    }
}
