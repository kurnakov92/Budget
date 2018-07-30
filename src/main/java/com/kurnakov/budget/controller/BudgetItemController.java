package com.kurnakov.budget.controller;

import com.kurnakov.budget.model.Expence;

import java.util.Optional;

public interface BudgetItemController<T> {

    String create(long id, String name, long amount);

    Optional<T> findById(long id);

    String update(T item, String name, long amount);

    String delete(T item);

    String deleteAll();
}
