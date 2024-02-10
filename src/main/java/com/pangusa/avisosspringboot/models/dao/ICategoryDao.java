package com.pangusa.avisosspringboot.models.dao;

import org.springframework.data.repository.CrudRepository;

import com.pangusa.avisosspringboot.models.entity.Category;

public interface ICategoryDao extends CrudRepository<Category, Long> {
    
    
}

