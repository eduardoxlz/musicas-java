package br.com.tech4me.primeiraapi.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;



import br.com.tech4me.primeiraapi.model.Musica;
import br.com.tech4me.primeiraapi.service.MusicaService;

@RestController
@RequestMapping("/musicas")
public class Musicacontroller{
    @Autowired
    private MusicaService servico;


    @GetMapping
    public List<Musica> obtermusicas(){
        return servico.obtermusicas();

    }


    @PostMapping
    public Musica cadastrarmusica(@RequestBody Musica musica){
        return servico.cadastrarmusica(musica);

    }

    @DeleteMapping("/{id}")
    public void excluirMusica(@PathVariable String id){
    servico.excluirMusica(id);


    }

    @PutMapping("/{id}")
    public Musica alterarMusica(@PathVariable String id, @RequestBody Musica musica){
        return servico.alterarMusica(id, musica);
        

        }

        }

        

    
 
