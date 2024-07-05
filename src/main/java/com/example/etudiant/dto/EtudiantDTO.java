package com.example.etudiant.dto;


import lombok.*;

@Getter
@Setter
@ToString
@Builder
@AllArgsConstructor
public class EtudiantDTO {

    private Long id;

    private String name;

    private String surname;

    private String id_Class;

    private ClassDTO classDTO;


}
