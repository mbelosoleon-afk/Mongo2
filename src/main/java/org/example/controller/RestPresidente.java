package org.example.controller;

import org.example.model.Presidente;
import org.example.service.PresidenteService;
import org.springframework.beans.factory.annotation.Autowired;
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
        presidenteService.crearPresi(presidente);
    }

}
