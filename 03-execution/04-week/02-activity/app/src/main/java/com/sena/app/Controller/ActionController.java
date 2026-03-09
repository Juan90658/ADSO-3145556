package com.sena.app.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.sena.app.Entity.Action;
import com.sena.app.Service.ActionService;

@RestController
@RequestMapping("/action")
public class ActionController {

    @Autowired
    private ActionService service;

    @PostMapping
    public Action save(@RequestBody Action action){
        return service.save(action);
    }

    @GetMapping
    public List<Action> list(){
        return service.All();
    }

}