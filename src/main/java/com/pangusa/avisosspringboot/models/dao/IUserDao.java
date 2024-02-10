package com.pangusa.avisosspringboot.models.dao;

import org.springframework.data.repository.CrudRepository;

import com.pangusa.avisosspringboot.models.entity.User;

public interface IUserDao extends CrudRepository<User, Long> {
    
    
}
