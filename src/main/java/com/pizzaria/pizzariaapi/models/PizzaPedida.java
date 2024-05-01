package com.pizzaria.pizzariaapi.models;

import jakarta.persistence.*;

@Entity
public class PizzaPedida {

    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private long id_pizzapedida;

    @ManyToOne
    @JoinColumn(name = "id_pizza")
    private Pizza pizza;

    @ManyToOne
    @JoinColumn(name = "id_pedido")
    private Pedido pedido;

    @ManyToOne
    @JoinColumn (name = "id_tamanho")
    private  Tamanho tamanho;

    @Column
    private int quantidade;

    public PizzaPedida() {
    }

    public long getId_pizzapedida() {
        return id_pizzapedida;
    }

    public void setId_pizzapedida(long id_pizzapedida) {
        this.id_pizzapedida = id_pizzapedida;
    }

    public Pizza getPizza() {
        return pizza;
    }

    public void setPizza(Pizza pizza) {
        this.pizza = pizza;
    }

    public Pedido getPedido() {
        return pedido;
    }

    public void setPedido(Pedido pedido) {
        this.pedido = pedido;
    }

    public Tamanho getTamanho() {
        return tamanho;
    }

    public void setTamanho(Tamanho tamanho) {
        this.tamanho = tamanho;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }
}