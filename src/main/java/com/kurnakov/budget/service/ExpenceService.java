package com.kurnakov.budget.service;

import com.kurnakov.budget.model.Expence;

import java.util.Optional;

public interface ExpenceService {

    void create(Expence expence);

    Optional<Expence> findBudgetItem(long id);

    void update(Expence expence, String name, long amount);

    void delete(Expence expence);

    void deleteAll();

}
