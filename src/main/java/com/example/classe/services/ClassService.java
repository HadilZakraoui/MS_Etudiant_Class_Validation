package com.example.classe.services;

import com.example.classe.entities.Class;
import com.example.classe.repositories.ClassRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClassService implements IClassService {

    @Autowired
    private ClassRepository cr;
    @Override
    public Class addClass(Class c) {
        cr.save(c);
        return c;
    }

    @Override
    public Class updateClass(Class c) {
        return cr.save(c);
    }

    @Override
    public List<Class> getAllClasses() {
        return cr.findAll();
    }

    @Override
    public Class getClassById(String id) {
        return cr.findById(id).get();
    }


    @Override
    public void deleteClassById(String id) {
        cr.deleteById(id);


    }
}
