package com.sena.app.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.sena.app.Entity.UserRole;
import com.sena.app.Service.UserRoleService;

@RestController
@RequestMapping("/user-role")
public class UserRoleController {

    @Autowired
    private UserRoleService service;

    @PostMapping
    public UserRole save(@RequestBody UserRole userRole){
        return service.save(userRole);
    }

    @GetMapping
    public List<UserRole> list(){
        return service.All();
    }

}