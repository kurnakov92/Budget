package com.kurnakov.budget.service.impl;

import com.kurnakov.budget.model.Income;
import com.kurnakov.budget.repository.IncomeRepository;
import com.kurnakov.budget.service.IncomeService;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.Optional;

@Service
public class IncomeServiceImpl implements IncomeService {

    private IncomeRepository repository;

    public IncomeServiceImpl(IncomeRepository repository) {
        this.repository = repository;
    }

    @Override
    public void create(long id, String name, long amount) {
        repository.save(new Income(id, name, amount, LocalDateTime.now()));
    }

    @Override
    public Optional<Income> findBudgetItemById(long id) {
        return repository.findById(id);
    }

    @Override
    public void update(Income income, String name, long amount) {
        income.setName(name);
        income.setAmount(amount);
        repository.save(income);
    }

    @Override
    public void delete(Income income) {
        repository.delete(income);
    }

    @Override
    public void deleteAll() {
        repository.deleteAll();
    }


}
