package org.example.repository;

import org.example.model.Pais;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface PaisRepo extends MongoRepository<Pais, String> {
}
