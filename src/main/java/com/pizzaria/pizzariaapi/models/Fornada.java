package com.pizzaria.pizzariaapi.models;

import jakarta.persistence.*;

@Entity
public class Fornada {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id_fornada;

    @Column
    private  int numfornada;
    @Column
    private int qtdpizzas;

    public Fornada() {
    }

    public long getId_fornada() {
        return id_fornada;
    }

    public void setId_fornada(long id_fornada) {
        this.id_fornada = id_fornada;
    }

    public int getNumfornada() {
        return numfornada;
    }

    public void setNumfornada(int numfornada) {
        this.numfornada = numfornada;
    }

    public int getQtdpizzas() {
        return qtdpizzas;
    }

    public void setQtdpizzas(int qtdpizzas) {
        this.qtdpizzas = qtdpizzas;
    }
}
