package com.pizzaria.pizzariaapi.models;

import jakarta.persistence.*;

@Entity
public class Bebida {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_bebida;


    @Column
    private String nome;


    @Column
    private float preco;

    public Long getId_bebida() {
        return id_bebida;
    }

    public void setId_bebida(Long id_bebida) {
        this.id_bebida = id_bebida;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public float getPreco() {
        return preco;
    }

    public void setPreco(float preco) {
        this.preco = preco;
    }
}
