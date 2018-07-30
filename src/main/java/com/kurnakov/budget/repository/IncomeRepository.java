package com.kurnakov.budget.repository;

import com.kurnakov.budget.model.Income;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IncomeRepository extends MongoRepository<Income, Long> {
}
