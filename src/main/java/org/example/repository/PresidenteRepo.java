package org.example.repository;

import org.example.model.Presidente;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RequestMapping;

@Repository
public interface PresidenteRepo extends MongoRepository<Presidente, String>{
}
