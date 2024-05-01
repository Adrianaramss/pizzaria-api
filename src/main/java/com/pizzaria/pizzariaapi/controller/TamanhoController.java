package com.pizzaria.pizzariaapi.controller;

import com.pizzaria.pizzariaapi.models.Tamanho;
import com.pizzaria.pizzariaapi.repositories.TamanhoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class TamanhoController {

    @Autowired
    private TamanhoRepository tamanhoRepository;

    @RequestMapping(value = "/criartamanho",method = RequestMethod.POST)
    public Tamanho save(@RequestBody Tamanho tamanho)
    {
        tamanho = this.tamanhoRepository.save(tamanho);
        return tamanho;
    }

    @RequestMapping(value = "/mostrartamanho",method = RequestMethod.GET )
    public List<Tamanho> findAll(){
        List<Tamanho> tamanho = this.tamanhoRepository.findAll();
        return tamanho;
    }


    @RequestMapping(value = "/mostrartamanho/{id}",method = RequestMethod.GET )
    public Tamanho findByid(@PathVariable long id)    {
        Optional<Tamanho> resultado = this.tamanhoRepository.findById(id);
        if (resultado.isEmpty())
        { throw new RuntimeException("Tamanho nao encontrada");}
        else
        { return resultado.get();}
    }

    @RequestMapping(value = "tamanho/excluir/{id}", method = RequestMethod.DELETE)
    public Tamanho deleteById(@PathVariable long id)    {
        Tamanho tamanho =  findByid(id);
        this.tamanhoRepository.deleteById(id);
        return tamanho;
    }

    @RequestMapping(value = "tamanho/editar/{id}", method = RequestMethod.PUT)
    public Tamanho editarById(@PathVariable long id, @RequestBody Tamanho tamanho)    {
        this.findByid(id);
        tamanho.setId_tamanho(id);
        tamanho = this.tamanhoRepository.save(tamanho);
        return tamanho;
    }
}




