package com.sena.app.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.sena.app.Entity.ViewModule;
import com.sena.app.Service.ViewModuleService;

@RestController
@RequestMapping("/view-module")
public class ViewModuleController {

    @Autowired
    private ViewModuleService service;

    @PostMapping
    public ViewModule save(@RequestBody ViewModule viewModule){
        return service.save(viewModule);
    }

    @GetMapping
    public List<ViewModule> list(){
        return service.All();
    }

}