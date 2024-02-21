package com.pangusa.avisosspringboot.models.services;

import java.util.List;
import com.pangusa.avisosspringboot.models.entity.Country;

public interface ICountryService {

    public List<Country> findAll();

    public Country findById(Long id);

    public Country save(Country country);

    public void delete(Long id);
}
