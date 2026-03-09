package com.sena.app.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.sena.app.Entity.User;
import com.sena.app.Service.UserService;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService service;

    @PostMapping
    public User save(@RequestBody User user){
        return service.save(user);
    }

    @GetMapping
    public List<User> list(){
        return service.All();
    }

}