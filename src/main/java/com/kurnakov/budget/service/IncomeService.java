package com.kurnakov.budget.service;

import com.kurnakov.budget.model.Income;

import java.time.LocalDateTime;

public interface IncomeService {

    void create(long id, String name, long amount, LocalDateTime dateTime);
    void update(Income income, long id, String name, long amount, LocalDateTime dateTime);
    void delete(Income income);
    void deleteAll();

}
