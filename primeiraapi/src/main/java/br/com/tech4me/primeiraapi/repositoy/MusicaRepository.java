package br.com.tech4me.primeiraapi.repositoy;

import org.springframework.data.mongodb.repository.MongoRepository;

import br.com.tech4me.primeiraapi.model.Musica;

public interface MusicaRepository  extends MongoRepository<Musica , String>{
    
}
  