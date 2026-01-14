package org.example;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.google.gson.Gson;
import io.micrometer.observation.transport.SenderContext;
import io.swagger.v3.core.util.Json;
import org.example.controller.RestPais;
import org.example.controller.RestPresidente;
import org.example.model.Pais;
import org.example.model.Presidente;
import org.example.service.PresidenteService;
import org.springframework.stereotype.Service;

import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.Map;

@Service
public class Secuencia {
    private final RestPresidente restPresidente;
    private final RestPais restPais;
    private final ObjectMapper mapper;
    private final PresidenteService presidenteService;

    public Secuencia(RestPresidente restPresidente, RestPais restPais, PresidenteService presidenteService){
        this.restPresidente = restPresidente;
        this.restPais = restPais;
        this.presidenteService = presidenteService;
        this.mapper = new ObjectMapper();
    }

    public void exameSolucion() {

        // 1
        System.out.println("Execución Exercicio 1");

        //Insertamos el presidente del archivo JsonPresi.json
        /*try{
            Presidente presidenteJson = mapper.readValue(new File("JsonPresi.json"), Presidente.class);
            restPresidente.gardarPresi(presidenteJson);
        }catch (IOException e){
            e.printStackTrace();
        }

        //Insertamos el pais del archivo JsonPais.json
        try{
            Pais paisJson = mapper.readValue(new File("JsonPais.json"), Pais.class);
            restPais.gardarPais(paisJson);
        }catch (IOException e){
            e.printStackTrace();
        }*/

        System.out.println("FIN Exercicio 1");

        // 2
        System.out.println("Execución Exercicio 2");

        System.out.println(restPresidente.listarPresi());
        System.out.println(restPais.listarPais());

        System.out.println("FIN Exercicio 2");

        // 3
        System.out.println("Execución Exercicio 3");

        System.out.println("Modificanco presi...");
        /*Presidente presidente = presidenteService.buscarPresi("1");
        presidente.setNome("Pepe");
        presidenteService.crearOActualizarPresi(presidente);*/

        System.out.println("FIN Exercicio 3");

        // 4
        System.out.println("Execución Exercicio 4");

        System.out.println("Borrando...");
        //restPresidente.borrarPresis();
        //restPais.borrarPaises();

        System.out.println("FIN Exercicio 4");
    }
}