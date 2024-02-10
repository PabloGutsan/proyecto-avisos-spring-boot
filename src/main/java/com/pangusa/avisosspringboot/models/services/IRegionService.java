package com.pangusa.avisosspringboot.models.services;

import java.util.List;

import com.pangusa.avisosspringboot.models.entity.Region;

public interface IRegionService {
    
     public List<Region> findAll();

     public Region findById(Long id);

     public Region save(Region region);

     public void delete(Long id);
}
