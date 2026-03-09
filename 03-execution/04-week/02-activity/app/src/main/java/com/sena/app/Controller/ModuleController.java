package com.sena.app.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.sena.app.Entity.Module;
import com.sena.app.Service.ModuleService;

@RestController
@RequestMapping("/module")
public class ModuleController {

    @Autowired
    private ModuleService service;

    @PostMapping
    public Module save(@RequestBody Module module){
        return service.save(module);
    }

    @GetMapping
    public List<Module> list(){
        return service.All();
    }

}