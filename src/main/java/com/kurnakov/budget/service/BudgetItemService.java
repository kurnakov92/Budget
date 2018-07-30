package com.kurnakov.budget.service;

import java.util.Optional;

public interface BudgetItemService<T> {

    void create(long id, String name, long amount);
    Optional<T> findBudgetItem(long id);
    void update(T item, long id, String name, long amount);
    void delete(T item);
    void deleteAll();

}
