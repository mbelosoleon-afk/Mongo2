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

    public void crearOActualizarPresi(Presidente presidente){
        presidenteRepo.save(presidente);
    }

    public List<Presidente> buscarTodosPresi(){
        return presidenteRepo.findAll();
    }

    public Presidente buscarPresi(String id) {
        return presidenteRepo.findById(id).orElse(null);
    }

    public void borrarPresis(){
        presidenteRepo.deleteAll();;
    }

}
