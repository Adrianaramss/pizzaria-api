package com.pizzaria.pizzariaapi.repositories;

import com.pizzaria.pizzariaapi.models.Bebida;
import com.pizzaria.pizzariaapi.models.Fornada;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FornadaRepository  extends JpaRepository<Fornada,Long> {
}
