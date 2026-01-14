package org.example.service;

import org.example.model.Pais;
import org.example.model.Presidente;
import org.example.repository.PaisRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PaisService {

    private final PaisRepo paisRepo;

    @Autowired
    public PaisService(PaisRepo paisRepo) {
        this.paisRepo = paisRepo;
    }

    public void crearPais(Pais pais){
        paisRepo.save(pais);
    }

    public List<Pais> buscarPais(){
        return paisRepo.findAll();
    }

    public Pais buscarPais(String id) {
        return paisRepo.findById(id).orElse(null);
    }

    public void borrarPaises(){
        paisRepo.deleteAll();;
    }

}
