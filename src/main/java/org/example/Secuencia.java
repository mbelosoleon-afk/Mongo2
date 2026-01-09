package org.example;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.google.gson.Gson;
import io.swagger.v3.core.util.Json;
import org.example.controller.RestPresidente;
import org.example.model.Pais;
import org.example.model.Presidente;
import org.springframework.stereotype.Service;

import java.io.File;
import java.io.IOException;
import java.util.List;

@Service
public class Secuencia {


    public void exameSolucion() {

        RestPresidente restPresidente = new RestPresidente();
        ObjectMapper mapper = new ObjectMapper();

        // 1
        System.out.println("Execución Exercicio 1");

        try{
            Presidente presidenteJson = mapper.readValue(new File("JsonPresi.json"), Presidente.class);
            restPresidente.gardarPresi(presidenteJson);
        }catch (IOException e){
            e.printStackTrace();
        }

        System.out.println("FIN Exercicio 1");

        // 2
        System.out.println("Execución Exercicio 2");

        System.out.println("FIN Exercicio 2");

        // 3
        System.out.println("Execución Exercicio 3");

        System.out.println("FIN Exercicio 3");

        // 4
        System.out.println("Execución Exercicio 4");

        System.out.println("FIN Exercicio 4");

        // 5
        System.out.println("Execución Exercicio 5");

        System.out.println("FIN Exercicio 5");

        // 6
        System.out.println("Execución Exercicio 6");

        System.out.println("FIN Exercicio 6");

        // 7
        System.out.println("Execución Exercicio 7");

        System.out.println("FIN Exercicio 7");
    }
}