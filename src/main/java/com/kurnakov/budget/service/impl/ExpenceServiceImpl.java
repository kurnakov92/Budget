package com.kurnakov.budget.service.impl;

import com.kurnakov.budget.model.Expence;
import com.kurnakov.budget.repository.ExpenceRepository;
import com.kurnakov.budget.service.ExpenceService;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;

@Service
public class ExpenceServiceImpl implements ExpenceService {

    private ExpenceRepository repository;

    public ExpenceServiceImpl(ExpenceRepository repository) {
        this.repository = repository;
    }

    @Override
    public void create(long id, String name, long amount, LocalDateTime dateTime) {
        repository.save(new Expence(id, name, amount, dateTime));
    }

    @Override
    public void update(Expence expence, long id, String name, long amount, LocalDateTime dateTime) {
        Expence updatedExpence = expence;
        updatedExpence.setId(id);
        updatedExpence.setName(name);
        updatedExpence.setAmount(amount);
        updatedExpence.setDateTime(dateTime);
        repository.save(updatedExpence);
    }

    @Override
    public void delete(Expence expence) {
        repository.delete(expence);
    }

    @Override
    public void deleteAll() {
        repository.deleteAll();
    }
}
