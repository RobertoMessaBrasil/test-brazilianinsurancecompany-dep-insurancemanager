package com.robertomessabrasil.test01.entity;

public class CarEntity {

    private long id;
    private String model;
    private String manufacturer;
    private String year;
    private float fipeValue;

    public CarEntity createCar(String model, String manufacturer, String year, float fipeValue) {

        this.model = model;
        this.manufacturer = manufacturer;
        this.year = year;
        this.fipeValue = fipeValue;

        return this;

    }

    @Override
    public String toString() {
        return "CarEntityEntity{" +
                "id=" + id +
                ", model='" + model + '\'' +
                ", manufacturer='" + manufacturer + '\'' +
                ", year='" + year + '\'' +
                ", fipeValue=" + fipeValue +
                '}';
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public float getFipeValue() {
        return fipeValue;
    }

    public void setFipeValue(float fipeValue) {
        this.fipeValue = fipeValue;
    }
}
