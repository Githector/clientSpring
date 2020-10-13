package com.clientdaw.clientdaw.entities;


import java.util.ArrayList;
import java.util.List;


public class MP {

    private int idMp;
    private int numMp;
    private String nomMp;
    private List<UF> llistaUf = new ArrayList<>();;

    public int getIdMp() {
        return idMp;
    }

    public void setIdMp(int idMp) {
        this.idMp = idMp;
    }

    public int getNumMp() {
        return numMp;
    }

    public void setNumMp(int numMp) {
        this.numMp = numMp;
    }

    public String getNomMp() {
        return nomMp;
    }

    public void setNomMp(String nomMp) {
        this.nomMp = nomMp;
    }

    public List<UF> getLlistaUf() {
        return llistaUf;
    }

    public void setLlistaUf(List<UF> llistaUf) {
        this.llistaUf = llistaUf;
    }

    public void addUf(UF uf){
        this.llistaUf.add(uf);
    }
}
