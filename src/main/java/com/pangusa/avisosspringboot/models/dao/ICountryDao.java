package com.pangusa.avisosspringboot.models.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import com.pangusa.avisosspringboot.models.entity.Country;

public interface ICountryDao extends JpaRepository<Country, Long> {

}
