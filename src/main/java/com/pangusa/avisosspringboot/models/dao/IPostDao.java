package com.pangusa.avisosspringboot.models.dao;

import org.springframework.data.repository.CrudRepository;

import com.pangusa.avisosspringboot.models.entity.Post;

public interface IPostDao extends CrudRepository<Post, Long> {
    
    
}
