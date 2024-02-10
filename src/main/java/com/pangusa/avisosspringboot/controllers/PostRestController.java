package com.pangusa.avisosspringboot.controllers;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
import com.pangusa.avisosspringboot.models.entity.Post;
import com.pangusa.avisosspringboot.models.services.IPostService;

@CrossOrigin(origins = {"http://localhost:4200"})
@RestController
@RequestMapping("/api")
public class PostRestController {
    
    @Autowired
    private IPostService postService;

    @GetMapping("/posts")
    public List<Post> index(){
        return postService.findAll();
    }

    @GetMapping("/posts/{id}")
    public Post show(@PathVariable Long id){
        return postService.findById(id);
    }

    @PostMapping("/posts")
    @ResponseStatus(HttpStatus.CREATED)
    public Post create(@RequestBody Post post){
        return postService.save(post);
    }

    @PutMapping("/posts/{id}")
    @ResponseStatus(HttpStatus.CREATED)
    public Post update(@RequestBody Post post, @PathVariable Long id){

        Post postActual = postService.findById(id);

        postActual.setTitle(post.getTitle());
        postActual.setBriefDescription(post.getBriefDescription());
        postActual.setRegion(post.getRegion());
        postActual.setCategory(post.getCategory());
        postActual.setDetailedDescription(post.getDetailedDescription());
        
        return postService.save(postActual);
    }

    @DeleteMapping("/posts/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void delete(@PathVariable Long id){
        postService.delete(id);
    }
}
