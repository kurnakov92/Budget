package com.kurnakov.budget.service.impl;

import com.kurnakov.budget.model.Income;
import com.kurnakov.budget.repository.IncomeRepository;
import com.kurnakov.budget.service.IncomeService;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;

@Service
public class IncomeServiceImpl implements IncomeService {

    private IncomeRepository repository;

    public IncomeServiceImpl(IncomeRepository repository) {
        this.repository = repository;
    }

    @Override
    public void create(long id, String name, long amount, LocalDateTime dateTime) {
        repository.save(new Income(id, name, amount, dateTime));
    }

    @Override
    public void update(Income income, long id, String name, long amount, LocalDateTime dateTime) {
        Income updatedIncome = income;
        updatedIncome.setId(id);
        updatedIncome.setName(name);
        updatedIncome.setAmount(amount);
        updatedIncome.setDateTime(dateTime);
        repository.save(updatedIncome);
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
