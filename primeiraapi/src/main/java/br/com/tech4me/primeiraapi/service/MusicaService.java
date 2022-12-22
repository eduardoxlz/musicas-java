package br.com.tech4me.primeiraapi.service;

import java.util.List;


import br.com.tech4me.primeiraapi.model.Musica;

public interface MusicaService {
    
    List<Musica>obtermusicas();
    Musica cadastrarmusica(Musica musica);
    void excluirMusica(String id);
    Musica alterarMusica(String id,Musica musica);





}
