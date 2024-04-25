package com.robertomessabrasil.test01.entity;

import java.time.LocalDate;

public class DriverEntity {

    private long id;
    private String document;
    private LocalDate birthDate;

    public DriverEntity createDriver(String document, LocalDate birthDate) {

        this.document = document;
        this.birthDate = birthDate;

        return this;
    }

    @Override
    public String toString() {
        return "DriverEntity{" +
                "id=" + id +
                ", document='" + document + '\'' +
                ", birthDate=" + birthDate +
                '}';
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getDocument() {
        return document;
    }

    public void setDocument(String document) {
        this.document = document;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(LocalDate birthDate) {
        this.birthDate = birthDate;
    }
}
