package org.example;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.example.model.Pais;
import org.example.model.Presidente;
import org.example.service.PaisService;
import org.example.service.PresidenteService;
import org.springframework.stereotype.Service;

import java.io.File;
import java.io.IOException;

@Service
public class Secuencia {
    private final ObjectMapper mapper;
    private final PresidenteService presidenteService;
    private final PaisService paisService;

    public Secuencia(PresidenteService presidenteService, PaisService paisService){
        this.paisService = paisService;
        this.presidenteService = presidenteService;
        this.mapper = new ObjectMapper();
    }

    public void exameSolucion() {

        // 1
        System.out.println("Execución Exercicio 1");

        //Insertamos el presidente del archivo JsonPresi.json
        try{
            Presidente presidenteJson = mapper.readValue(new File("JsonPresi.json"), Presidente.class);
            presidenteService.crearOActualizarPresi(presidenteJson);
        }catch (IOException e){
            e.printStackTrace();
        }

        //Insertamos el pais del archivo JsonPais.json
        try{
            Pais paisJson = mapper.readValue(new File("JsonPais.json"), Pais.class);
            paisService.crearPais(paisJson);
        }catch (IOException e){
            e.printStackTrace();
        }

        System.out.println("FIN Exercicio 1");

        // 2
        System.out.println("Execución Exercicio 2");

        System.out.println("Listando presidentes y paises");
        System.out.println(presidenteService.buscarTodosPresi());
        System.out.println(paisService.buscarPais());

        System.out.println("FIN Exercicio 2");

        // 3
        System.out.println("Execución Exercicio 3");

        System.out.println("Modificanco presi...");
        Presidente presidente = presidenteService.buscarPresi("1");
        presidente.setNome("Pepe");
        presidenteService.crearOActualizarPresi(presidente);

        System.out.println("FIN Exercicio 3");

        // 4
        System.out.println("Execución Exercicio 4");

        System.out.println("Borrando...");
        presidenteService.borrarPresis();
        paisService.borrarPaises();

        System.out.println("FIN Exercicio 4");
    }
}