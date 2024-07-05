package com.example.etudiant.mappers;

import com.example.etudiant.dto.ClassDTO;
import com.example.etudiant.dto.EtudiantDTO;
import com.example.etudiant.entities.Etudiant;
import org.springframework.stereotype.Service;

@Service
public class EtudiantMapper {

    public static EtudiantDTO mapToDto(Etudiant etudiant) {

        EtudiantDTO etudiantDTO = EtudiantDTO.builder()
                .id(etudiant.getId())
                .name(etudiant.getName())
                .surname(etudiant.getSurname())
                .id_Class(etudiant.getId_Class())
                .build();

        return etudiantDTO;
    }

    public static EtudiantDTO mapToDto(Etudiant etudiant , ClassDTO classDTO) {

        EtudiantDTO etudiantDTO = EtudiantDTO.builder()
                .id(etudiant.getId())
                .name(etudiant.getName())
                .surname(etudiant.getSurname())
                .id_Class(etudiant.getId_Class())
                .classDTO(classDTO)
                .build();
        return etudiantDTO;
    }

    public static Etudiant mapToEntity(EtudiantDTO etudiantDTO) {


        Etudiant etudiant = Etudiant.builder()
                .id(etudiantDTO.getId())
                .name(etudiantDTO.getName())
                .surname(etudiantDTO.getSurname())
                .id_Class(etudiantDTO.getId_Class())
                .build();

        return etudiant;

    }
}
