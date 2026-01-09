package org.example.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.ArrayList;

@Document(collection = "pais")
public class Pais {

    @Id
    private String id;

    private String nome;
    private String organizacion;
    private ArrayList<String> partido;
    private String idPresi;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getOrganizacion() {
        return organizacion;
    }

    public void setOrganizacion(String organizacion) {
        this.organizacion = organizacion;
    }

    public ArrayList<String> getPartido() {
        return partido;
    }

    public void setPartido(ArrayList<String> partido) {
        this.partido = partido;
    }

    public String getIdPresi() {
        return idPresi;
    }

    public void setIdPresi(String idPresi) {
        this.idPresi = idPresi;
    }
}
