package org.example.controller;

import org.example.model.Presidente;
import org.example.service.PresidenteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping(RestPresidente.MAPPING)
public class RestPresidente {

    public static final String MAPPING = "/mongodb/presidente";

    @Autowired
    private PresidenteService presidenteService;

    public void gardarPresi(Presidente presidente){
        presidenteService.crearOActualizarPresi(presidente);
    }

    public List<Presidente> listarPresi() {
        List <Presidente> presidentes = presidenteService.buscarTodosPresi();
        return presidentes;
    }

    public void borrarPresis() {
        presidenteService.borrarPresis();
    }
}