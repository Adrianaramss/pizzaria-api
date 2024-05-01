package com.pizzaria.pizzariaapi.controller;


import com.pizzaria.pizzariaapi.models.Fornada;
import com.pizzaria.pizzariaapi.repositories.FornadaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class FornadaController {

    @Autowired
    private FornadaRepository fornadaRepository;

    @RequestMapping(value = "/criarfornada",method = RequestMethod.POST)
    public Fornada save(@RequestBody Fornada fornada)
    {
        fornada = this.fornadaRepository.save(fornada);
        return fornada;
    }

    @RequestMapping(value = "/mostrarfornada",method = RequestMethod.GET )
    public List<Fornada> findAll(){
        List<Fornada> fornada = this.fornadaRepository.findAll();
        return fornada;
    }


    @RequestMapping(value = "/mostrarfornada/{id}",method = RequestMethod.GET )
    public Fornada findByid(@PathVariable long id)    {
        Optional<Fornada> resultado = this.fornadaRepository.findById(id);
        if (resultado.isEmpty())
        { throw new RuntimeException("Fornada nao encontrada");}
        else
        { return resultado.get();}
    }

    @RequestMapping(value = "fornada/excluir/{id}", method = RequestMethod.DELETE)
    public Fornada deleteById(@PathVariable long id)    {
        Fornada fornada =  findByid(id);
        this.fornadaRepository.deleteById(id);
        return fornada;
    }

    @RequestMapping(value = "fornada/editar/{id}", method = RequestMethod.PUT)
    public Fornada editarById(@PathVariable long id, @RequestBody Fornada fornada)    {
        this.findByid(id);
        fornada.setId_fornada(id);
        fornada = this.fornadaRepository.save(fornada);
        return fornada;
    }
}



