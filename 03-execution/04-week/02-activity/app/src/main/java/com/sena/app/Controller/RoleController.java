package com.sena.app.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.sena.app.Entity.Role;
import com.sena.app.Service.RoleService;

@RestController
@RequestMapping("/role")
public class RoleController {

    @Autowired
    private RoleService service;

    @PostMapping
    public Role save(@RequestBody Role role){
        return service.save(role);
    }

    @GetMapping
    public List<Role> list(){
        return service.All();
    }

}