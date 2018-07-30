package com.kurnakov.budget.repository;

import com.kurnakov.budget.model.BudgetItem;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BudgetItemRepository extends MongoRepository<BudgetItem, Long> {

}
