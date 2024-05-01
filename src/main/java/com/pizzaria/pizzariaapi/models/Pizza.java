package com.pizzaria.pizzariaapi.models;

import jakarta.persistence.*;

@Entity
public class Pizza {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id_pizza;

    @Column
    private String nome;

    @Column
    private Float precobase;

    @Column
    private boolean personalizada;

    public Pizza() {
    }

    public long getId_pizza() {
        return id_pizza;
    }

    public void setId_pizza(long id_pizza) {
        this.id_pizza = id_pizza;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Float getPrecobase() {
        return precobase;
    }

    public void setPrecobase(Float precobase) {
        this.precobase = precobase;
    }

    public boolean isPersonalizada() {
        return personalizada;
    }

    public void setPersonalizada(boolean personalizada) {
        this.personalizada = personalizada;
    }
}
