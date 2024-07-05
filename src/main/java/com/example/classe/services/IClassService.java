package com.example.classe.services;

import com.example.classe.entities.Class;

import java.util.List;

public interface IClassService {

    Class addClass (Class c);
    Class updateClass(Class c);
    List<Class> getAllClasses();
    Class getClassById(String id);
    void deleteClassById(String id);
}
