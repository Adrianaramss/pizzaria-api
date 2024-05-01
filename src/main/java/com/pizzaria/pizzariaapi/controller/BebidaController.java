package com.pizzaria.pizzariaapi.controller;


import com.pizzaria.pizzariaapi.models.Bebida;
import com.pizzaria.pizzariaapi.repositories.BebidaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class BebidaController {

    @Autowired
    private BebidaRepository bebidaRepository;

    @RequestMapping(value = "/criarbebida", method = RequestMethod.POST)
    public Bebida save(@RequestBody Bebida bebida) {
        bebida = this.bebidaRepository.save(bebida);
        return bebida;
    }

    @RequestMapping(value = "/mostrarbebida",method = RequestMethod.GET )
    public List<Bebida> findAll(){
        List<Bebida> bebidas = this.bebidaRepository.findAll();
        return bebidas;
    }

    @RequestMapping(value = "/mostrarbebida/{id}",method = RequestMethod.GET )
    public Bebida findByid(@PathVariable long id)    {
        Optional<Bebida> resultado = this.bebidaRepository.findById(id);
        if (resultado.isEmpty())
        { throw new RuntimeException("Bebida não encontrada");}
        else
        { return resultado.get();}
    }

    @RequestMapping(value = "bebida/excluir/{id}", method = RequestMethod.DELETE)
    public Bebida deleteById(@PathVariable long id)    {
        Bebida bebida =  findByid(id);
        this.bebidaRepository.deleteById(id);
        return bebida;
    }
    @RequestMapping(value = "bebida/editar/{id}", method = RequestMethod.PUT)
    public Bebida editarById(@PathVariable long id, @RequestBody Bebida bebida)    {
        this.findByid(id);
        bebida.setId_bebida(id);
        bebida = this.bebidaRepository.save(bebida);
        return bebida;
    }

}