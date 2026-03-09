package com.sena.app.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.sena.app.Entity.ViewAction;
import com.sena.app.Service.ViewActionService;

@RestController
@RequestMapping("/view-action")
public class ViewActionController {

    @Autowired
    private ViewActionService service;

    @PostMapping
    public ViewAction save(@RequestBody ViewAction viewAction){
        return service.save(viewAction);
    }

    @GetMapping
    public List<ViewAction> list(){
        return service.All();
    }

}