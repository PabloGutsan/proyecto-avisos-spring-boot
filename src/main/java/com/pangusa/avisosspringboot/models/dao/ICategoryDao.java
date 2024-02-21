package com.pangusa.avisosspringboot.models.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import com.pangusa.avisosspringboot.models.entity.Category;

public interface ICategoryDao extends JpaRepository<Category, Long> {

}
