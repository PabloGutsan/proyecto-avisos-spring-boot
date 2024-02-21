package com.pangusa.avisosspringboot.models.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import com.pangusa.avisosspringboot.models.entity.Region;

public interface IRegionDao extends JpaRepository<Region, Long> {

}
