package com.example.demo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Country {

    //properties declare here
    //id is use as the primary key of the table. It is an auto incremented value
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String countryName;

    //default constructor
    public Country() {
    }

    //overloaded constructor
    public Country(Integer id, String countryName) {
        this.id = id;
        this.countryName = countryName;
    }

    //setters and getters for the properties
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCountryName() {
        return countryName;
    }

    public void setCountryName(String countryName) {
        this.countryName = countryName;
    }

    //convert property values to string values
    @Override
    public String toString() {
        return "Country{" +
                "id=" + id +
                ", countryName='" + countryName + '\'' +
                '}';
    }
}
