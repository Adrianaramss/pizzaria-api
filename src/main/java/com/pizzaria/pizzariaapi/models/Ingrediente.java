package com.pizzaria.pizzariaapi.models;


import jakarta.persistence.*;

@Entity
public class Ingrediente {

    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private long  id_ingrediente;


    @Column
    private String nome;

    @Column
    private  String preco;


    public long getId_ingrediente() {
        return id_ingrediente;
    }

    public void setId_ingrediente(long id_ingrediente) {
        this.id_ingrediente = id_ingrediente;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getPreco() {
        return preco;
    }

    public void setPreco(String preco) {
        this.preco = preco;
    }
}
