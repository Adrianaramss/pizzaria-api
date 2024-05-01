package com.pizzaria.pizzariaapi.models;

import jakarta.persistence.*;

@Entity
public class BebidaPedido {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id_bebidapedido;

    @ManyToOne
    @JoinColumn (name = "id_bebida")
    private Bebida bebida;

    @ManyToOne
    @JoinColumn (name = "id_pedido")
    private Pedido pedido;

    @Column
    private  int quantidade;

    public BebidaPedido() {
    }

    public long getId_bebidapedido() {
        return id_bebidapedido;
    }

    public void setId_bebidapedido(long id_bebidapedido) {
        this.id_bebidapedido = id_bebidapedido;
    }

    public Bebida getBebida() {
        return bebida;
    }

    public void setBebida(Bebida bebida) {
        this.bebida = bebida;
    }

    public Pedido getPedido() {
        return pedido;
    }

    public void setPedido(Pedido pedido) {
        this.pedido = pedido;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }
}
