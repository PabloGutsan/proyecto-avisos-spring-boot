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
import com.pangusa.avisosspringboot.models.entity.Category;
import com.pangusa.avisosspringboot.models.services.ICategoryService;

@CrossOrigin(origins = { "http://localhost:4200" })
@RestController
@RequestMapping("/api")
public class CategoryRestController {

    @Autowired
    private ICategoryService categoryService;

    @GetMapping("/categories")
    public List<Category> index() {
        return categoryService.findAll();
    }

    @GetMapping("/categories/{id}")
    public Category show(@PathVariable Long id) {
        return categoryService.findById(id);
    }

    @PostMapping("/categories")
    @ResponseStatus(HttpStatus.CREATED)
    public Category create(@RequestBody Category category) {
        return categoryService.save(category);
    }

    @PutMapping("/categories/{id}")
    @ResponseStatus(HttpStatus.CREATED)
    public Category update(@RequestBody Category category, @PathVariable Long id) {

        Category categoryActual = categoryService.findById(id);

        categoryActual.setName(category.getName());

        return categoryService.save(categoryActual);
    }

    @DeleteMapping("/categories/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void delete(@PathVariable Long id) {
        categoryService.delete(id);
    }
}
