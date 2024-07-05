package com.example.etudiant.services;

import com.example.etudiant.dto.EtudiantDTO;
import com.example.etudiant.entities.Etudiant;

import java.util.List;

public interface IEtudiantService {

    EtudiantDTO addEtudiant(EtudiantDTO e);
    Etudiant updateEtudiant(Etudiant e);
    List<EtudiantDTO> getAllEtudiants();
    EtudiantDTO getEtudiantById(long id);
    void deleteEtudiantById(long id);
    void deleteEtudiant(Etudiant e);
}
