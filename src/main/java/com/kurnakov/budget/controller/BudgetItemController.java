package com.kurnakov.budget.controller;

public interface BudgetItemController<T> {

    String create(long id, String name, long amount);

    T findBudetIntemById(long id);

    String update(T budgetItem, String name, long amount);

    String delete(T budgetItem);

    String deleteAll(T budgetItem);
}
