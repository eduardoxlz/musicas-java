package br.com.tech4me.primeiraapi.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.tech4me.primeiraapi.model.Musica;
import br.com.tech4me.primeiraapi.repositoy.MusicaRepository;


@Service
public class MusicaServiceimpl  implements MusicaService{
    @Autowired
    private MusicaRepository repositorio;

    @Override
    public List<Musica> obtermusicas() {
    
        return repositorio.findAll();
    }

    @Override
    public Musica cadastrarmusica(Musica musica) {
        
        return repositorio.save(musica);
    }

    @Override
    public void excluirMusica(String id) {
        repositorio.deleteById(id);
        
    }

    @Override
    public Musica alterarMusica(String id, Musica musica) {
        musica.setId(id);
        return repositorio.save(musica);
        
    }
    
}
