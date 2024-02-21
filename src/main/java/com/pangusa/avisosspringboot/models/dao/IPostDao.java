package com.pangusa.avisosspringboot.models.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import com.pangusa.avisosspringboot.models.entity.Post;

public interface IPostDao extends JpaRepository<Post, Long> {

}
