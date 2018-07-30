package com.kurnakov.budget.service;

import com.kurnakov.budget.model.Income;

import java.util.Optional;

public interface IncomeService {

    void create(long id, String name, long amount);

    Optional<Income> findBudgetItemById(long id);

    void update(Income income, String name, long amount);

    void delete(Income income);

    void deleteAll();

}
