package com.isaax.demo.persistence.respositories;

import java.util.Optional;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

import com.isaax.demo.persistence.documents.DepartamentosDocuments;

public interface DepartamentoRepository extends MongoRepository<DepartamentosDocuments, Integer> {

    @Query("{_id: ?0}")
    Optional<DepartamentosDocuments> findById(String id);
}
