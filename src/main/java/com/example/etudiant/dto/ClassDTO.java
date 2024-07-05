package com.example.etudiant.dto;

import jakarta.persistence.Id;
import lombok.*;



@Getter
@Setter
@ToString
@Builder
@AllArgsConstructor
public class ClassDTO {


    @Id
    private String  id;
    private String name;

    public ClassDTO() {

    }

}
