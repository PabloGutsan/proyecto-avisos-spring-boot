package com.pangusa.avisosspringboot.models.services;

import java.util.List;
import com.pangusa.avisosspringboot.models.entity.Post;

public interface IPostService {

     public List<Post> findAll();

     public Post findById(Long id);

     public Post save(Post post);

     public void delete(Long id);
}
