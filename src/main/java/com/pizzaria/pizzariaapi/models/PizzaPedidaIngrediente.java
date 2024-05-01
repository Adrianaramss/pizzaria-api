package com.pizzaria.pizzariaapi.models;

import jakarta.persistence.*;

@Entity
public class PizzaPedidaIngrediente {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id_pizzaingrediente;

    @ManyToOne
    @JoinColumn( name = "id_pizzapedida")
    private PizzaPedida pizzaPedida;

    @ManyToOne
    @JoinColumn (name = "id_ingrediente")
    private Ingrediente ingrediente;

    public long getId_pizzaingrediente() {
        return id_pizzaingrediente;
    }

    public void setId_pizzaingrediente(long id_pizzaingrediente) {
        this.id_pizzaingrediente = id_pizzaingrediente;
    }

    public PizzaPedida getPizzaPedida() {
        return pizzaPedida;
    }

    public void setPizzaPedida(PizzaPedida pizzaPedida) {
        this.pizzaPedida = pizzaPedida;
    }

    public Ingrediente getIngrediente() {
        return ingrediente;
    }

    public void setIngrediente(Ingrediente ingrediente) {
        this.ingrediente = ingrediente;
    }
}
