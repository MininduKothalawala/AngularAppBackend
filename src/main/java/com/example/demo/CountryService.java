package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CountryService {

    private CountryRepository repository;

    @Autowired
    public CountryService(CountryRepository repository) {
        super();
        this.repository = repository;
    }

    //get all country records
    public List<Country> getCountries(){
        return repository.findAll();
    }

    //insert one new record
    public void addCountry(Country country){
        repository.save(country);
    }

    //update one record
    public void updateCountry(Country country){
        repository.save(country);
    }

    //delete record
    public void deleteCountry(Integer id){
        repository.deleteById(id);
    }

    //get one country
    //return as an object
    public Object getCountry(Integer id) {
        return repository.findById(id);
    }
}
