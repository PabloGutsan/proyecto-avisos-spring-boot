package com.pangusa.avisosspringboot.models.services;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.pangusa.avisosspringboot.models.dao.ICountryDao;
import com.pangusa.avisosspringboot.models.entity.Country;

@Service
public class CountryServiceImpl implements ICountryService {

    @Autowired
    private ICountryDao countryDao;

    @Override
    @Transactional(readOnly = true)
    public List<Country> findAll() {
        return (List<Country>) countryDao.findAll();
    }

    @Override
    @Transactional(readOnly = true)
    public Country findById(Long id) {
        return countryDao.findById(id).orElse(null);
    }

    @Override
    @Transactional
    public Country save(Country country) {
        return countryDao.save(country);
    }

    @Override
    @Transactional
    public void delete(Long id) {
        countryDao.deleteById(id);
    }
}
