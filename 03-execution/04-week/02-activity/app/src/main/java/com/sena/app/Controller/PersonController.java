package com.sena.app.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.sena.app.Entity.Person;
import com.sena.app.Service.PersonService;

@RestController
@RequestMapping("/person")
public class PersonController {

    @Autowired
    private PersonService service;

    @PostMapping
    public Person save(@RequestBody Person person){
        return service.save(person);
    }

    @GetMapping
    public List<Person> list(){
        return service.All();
    }

}
