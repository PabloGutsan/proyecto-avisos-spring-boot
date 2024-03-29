package com.pangusa.avisosspringboot.controllers;

import org.springframework.web.bind.annotation.RestController;
import com.pangusa.avisosspringboot.models.entity.User;
import com.pangusa.avisosspringboot.models.services.IUserService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

@CrossOrigin(origins = { "http://localhost:4200" })
@RestController
@RequestMapping("/api")
public class UserRestController {

    @Autowired
    private IUserService userService;

    @GetMapping("/users")
    public List<User> index() {
        return userService.findAll();
    }

    @GetMapping("/users/{id}")
    public User show(@PathVariable Long id) {
        return userService.findById(id);
    }

    @PostMapping("/users")
    @ResponseStatus(HttpStatus.CREATED)
    public User create(@RequestBody User user) {
        return userService.save(user);
    }

    @PutMapping("/users/{id}")
    @ResponseStatus(HttpStatus.CREATED)
    public User update(@RequestBody User user, @PathVariable Long id) {

        User userActual = userService.findById(id);

        userActual.setNames(user.getNames());
        userActual.setPaternalSurname(user.getPaternalSurname());
        userActual.setMaternalSurname(user.getMaternalSurname());
        userActual.setPhone(user.getPhone());
        userActual.setBirthdate(user.getBirthdate());
        userActual.setRegion(user.getRegion());
        userActual.setUsername(user.getUsername());
        userActual.setPassword(user.getPassword());

        return userService.save(userActual);
    }

    @DeleteMapping("/users/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void delete(@PathVariable Long id) {
        userService.delete(id);
    }
}
