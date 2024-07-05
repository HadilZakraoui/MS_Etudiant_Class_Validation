package com.example.classe.controllers;

import com.example.classe.entities.Class;
import com.example.classe.services.IClassService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/class")
public class ClassController {
    @Autowired
    private IClassService ics;
    @PostMapping("/addClass")
    public Class ajouterClass(@RequestBody Class c){
        return ics.addClass(c);
    }

    @PostMapping("/updateClass")
    public Class updateClass(@RequestBody Class c){
        return ics.updateClass(c);
    }

    @GetMapping("/getClasses")
    public List<Class> getAllClasses(){return ics.getAllClasses();}

    @DeleteMapping("/delete/{id}")
    public void deleteClassById(@PathVariable("id") String id){
        ics.deleteClassById(id);

    }

    @GetMapping("/getbyid/{id}")
    public Class getClassById(@PathVariable("id") String id) {
        return ics.getClassById(id);


    }
}
