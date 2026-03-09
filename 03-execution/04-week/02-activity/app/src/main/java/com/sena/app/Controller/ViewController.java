package com.sena.app.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.sena.app.Entity.View;
import com.sena.app.Service.ViewService;

@RestController
@RequestMapping("/view")
public class ViewController {

    @Autowired
    private ViewService service;

    @PostMapping
    public View save(@RequestBody View view){
        return service.save(view);
    }

    @GetMapping
    public List<View> list(){
        return service.All();
    }

}