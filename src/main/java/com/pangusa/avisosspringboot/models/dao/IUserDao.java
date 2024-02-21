package com.pangusa.avisosspringboot.models.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import com.pangusa.avisosspringboot.models.entity.User;

public interface IUserDao extends JpaRepository<User, Long> {

}
