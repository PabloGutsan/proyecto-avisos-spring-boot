package com.pangusa.avisosspringboot.models.dao;

import org.springframework.data.repository.CrudRepository;
import com.pangusa.avisosspringboot.models.entity.Region;

public interface IRegionDao extends CrudRepository<Region, Long> {
    
    
}
