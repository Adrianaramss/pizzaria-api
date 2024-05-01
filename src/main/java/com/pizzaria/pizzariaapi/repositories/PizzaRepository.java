package com.pizzaria.pizzariaapi.repositories;
import com.pizzaria.pizzariaapi.models.Pizza;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PizzaRepository extends JpaRepository<Pizza,Long> {
}


