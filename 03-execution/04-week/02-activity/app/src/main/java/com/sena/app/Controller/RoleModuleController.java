package com.sena.app.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.sena.app.Entity.RoleModule;
import com.sena.app.Service.RoleModuleService;

@RestController
@RequestMapping("/role-module")
public class RoleModuleController {

    @Autowired
    private RoleModuleService service;

    @PostMapping
    public RoleModule save(@RequestBody RoleModule roleModule){
        return service.save(roleModule);
    }

    @GetMapping
    public List<RoleModule> list(){
        return service.All();
    }

}