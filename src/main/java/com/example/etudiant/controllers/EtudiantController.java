package com.example.etudiant.controllers;

import com.example.etudiant.dto.EtudiantDTO;
import com.example.etudiant.entities.Etudiant;
import com.example.etudiant.services.IEtudiantService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/etudiant")
public class EtudiantController {

    @Autowired
    private IEtudiantService ies;
    @PostMapping("/addEtudiant")
    public EtudiantDTO ajouterEtudiant(@RequestBody EtudiantDTO e){
        return ies.addEtudiant(e);
    }


    @GetMapping("/getEtudiants")
    public List<EtudiantDTO> getAllEtudiant(){return ies.getAllEtudiants();}


    @GetMapping("/getbyid/{id}")
    public EtudiantDTO GetById(@PathVariable("id") Long id) {
        return ies.getEtudiantById(id);
    }

    @PostMapping("/updateEtudiant")
    public Etudiant updateEtudiant(Etudiant e){
        return ies.updateEtudiant(e);
    }

    @DeleteMapping("/delete/{id}")
    public void deleteEtudiantById(@PathVariable("id") Long id) {
        ies.deleteEtudiantById(id);
    }

}
