package com.example.etudiant.services;

import com.example.etudiant.dto.ClassDTO;
import com.example.etudiant.dto.EtudiantDTO;
import com.example.etudiant.entities.Etudiant;
import com.example.etudiant.mappers.EtudiantMapper;
import com.example.etudiant.repositories.EtudiantRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.List;
import java.util.stream.Collectors;

@Slf4j
@RequiredArgsConstructor
@Service
public class EtudiantService implements  IEtudiantService{

    private final EtudiantRepository etudiantRepository;

    private final ClassClient classClient;

    @Override
    public EtudiantDTO addEtudiant(EtudiantDTO e) {
        Etudiant etudiant = etudiantRepository.save(EtudiantMapper.mapToEntity(e));
        return e;    }

    @Override
    public Etudiant updateEtudiant(Etudiant a) {
        return  etudiantRepository.save(a);
    }

    @Override
    public List<EtudiantDTO> getAllEtudiants() {
        return etudiantRepository.findAll()
                .stream()
                .map(etudiant -> EtudiantMapper.mapToDto(etudiant)).
                collect(Collectors.toList()) ;    }

    @Override
    public EtudiantDTO getEtudiantById(long id) {
        Etudiant etudiant = etudiantRepository.findById(id).get() ;
        ClassDTO classDTO= classClient.getClassById(etudiant.getId_Class());
      // ClassDTO classDTO =getById(etudiant.getId_Class());
        return EtudiantMapper.mapToDto(etudiant,classDTO);    }

    @Override
    public void deleteEtudiantById(long id) {
        etudiantRepository.deleteById(id);

    }

    @Override
    public void deleteEtudiant(Etudiant e) {
        etudiantRepository.delete(e);

    }


//    public ClassDTO getById(String id) {
//        String url = "http://localhost:8085/class/getbyid/" + id;
//        RestTemplate restTemplate = new RestTemplate();
//        return restTemplate.getForObject(url, ClassDTO.class);
//    }
}
