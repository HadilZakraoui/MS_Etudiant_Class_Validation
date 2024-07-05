package com.example.etudiant.services;

import com.example.etudiant.dto.ClassDTO;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient( name = "class" , url = "http://localhost:8085")
public interface ClassClient {
    @GetMapping("/class/getbyid/{id}")
    ClassDTO getClassById(@PathVariable("id") String id);
}
