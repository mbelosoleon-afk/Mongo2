package org.example.controller;

import org.example.model.Pais;
import org.example.service.PaisService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(RestPais.MAPPING)
public class RestPais {

    public static final String MAPPING = "/mongodb/pais";

    @Autowired
    private PaisService paisService;

    public void gardarPais(Pais pais){
        paisService.crearPais(pais);
    }

}
