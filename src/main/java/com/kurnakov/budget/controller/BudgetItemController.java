package com.kurnakov.budget.controller;

import java.util.Optional;

public interface BudgetItemController<T> {

    String create(T item);

    Optional<T> findById(long id);

    String update(T item, String name, long amount);

    String delete(T item);

    String deleteAll();
}
