package com.pangusa.avisosspringboot.controllers;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
import com.pangusa.avisosspringboot.models.entity.Country;
import com.pangusa.avisosspringboot.models.services.ICountryService;

@CrossOrigin(origins = { "http://localhost:4200" })
@RestController
@RequestMapping("/api")
public class CountryRestController {

    @Autowired
    private ICountryService countryService;

    @GetMapping("/countries")
    public List<Country> index() {
        return countryService.findAll();
    }

    @GetMapping("/countries/{id}")
    public Country show(@PathVariable Long id) {
        return countryService.findById(id);
    }

    @PostMapping("/countries")
    @ResponseStatus(HttpStatus.CREATED)
    public Country create(@RequestBody Country country) {
        return countryService.save(country);
    }

    @PutMapping("/countries/{id}")
    @ResponseStatus(HttpStatus.CREATED)
    public Country update(@RequestBody Country country, @PathVariable Long id) {

        Country countryActual = countryService.findById(id);

        countryActual.setName(country.getName());

        return countryService.save(countryActual);
    }

    @DeleteMapping("/countries/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void delete(@PathVariable Long id) {
        countryService.delete(id);
    }
}
