package br.com.alura.programming.languages;

import org.springframework.data.mongodb.repository.MongoRepository;

public interface LinguagemRepository extends MongoRepository <Linguagem, String> {
    
}
