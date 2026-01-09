package org.example.service;

import org.example.model.Presidente;
import org.example.repository.PresidenteRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PresidenteService {

    private final PresidenteRepo presidenteRepo;

    @Autowired
    public PresidenteService(PresidenteRepo presidenteRepository){
        this.presidenteRepo = presidenteRepository;
    }

    public void crearPresi(Presidente p){
        presidenteRepo.save(p);
    }

    public List<Presidente> buscarPresi(){
        return presidenteRepo.findAll();
    }

}
