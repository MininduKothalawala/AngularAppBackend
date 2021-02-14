package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
//@RequestMapping
//@CrossOrigin
public class CountryController {

    //create object from the Service class
    private final CountryService service;

    @Autowired
    public CountryController(CountryService service){
        super();
        this.service = service;
    }

    //get all countries from database
    @GetMapping("/country")
    public List<Country> getCountries(){
        return service.getCountries();
    }

    //get one country from database
    @GetMapping("/country/{id}")
    public Object getCountry(@PathVariable("id") Integer id){
        return service.getCountry(id);
    }

    //insert country to database
    @PostMapping("/country/add")
    public void addCountry(@RequestBody Country country){
        service.addCountry(country);
    }

    //update record from database
    @PutMapping("/country/{id}/edit")
    public void updateCountry(@PathVariable("id") Integer id, @RequestBody Country country){
        service.updateCountry(country);
    }

    //delete record from database
    @DeleteMapping("/country/{id}/delete")
    public void deleteCountry(@PathVariable("id") Integer id){
        service.deleteCountry(id);
    }
}
