package com.kurnakov.budget.repository;

import com.kurnakov.budget.model.Expence;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ExpenceRepository  extends MongoRepository<Expence, Long> {

}
