package com.example.classe.repositories;

import com.example.classe.entities.Class;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ClassRepository extends MongoRepository<Class, String> {
}
