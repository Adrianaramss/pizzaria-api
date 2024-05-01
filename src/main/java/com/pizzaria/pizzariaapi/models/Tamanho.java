package com.pizzaria.pizzariaapi.models;


import jakarta.persistence.*;

@Entity
public class Tamanho {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id_tamanho;

    @Column
    private String nome;

    @Column
    private float desconto;

    public long getId_tamanho() {
        return id_tamanho;
    }

    public void setId_tamanho(long id_tamanho) {
        this.id_tamanho = id_tamanho;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public float getDesconto() {
        return desconto;
    }

    public void setDesconto(float desconto) {
        this.desconto = desconto;
    }
}
