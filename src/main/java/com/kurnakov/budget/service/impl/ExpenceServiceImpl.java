package com.kurnakov.budget.service.impl;

import com.kurnakov.budget.model.Expence;
import com.kurnakov.budget.repository.ExpenceRepository;
import com.kurnakov.budget.service.ExpenceService;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.Optional;

@Service
public class ExpenceServiceImpl implements ExpenceService {

    private ExpenceRepository repository;

    public ExpenceServiceImpl(ExpenceRepository repository) {
        this.repository = repository;
    }

    @Override
    public void create(long id, String name, long amount) {
        repository.save(new Expence(id, name, amount, LocalDateTime.now()));
    }

    @Override
    public Optional<Expence> findBudgetItem(long id) {
        return repository.findById(id);
    }

    @Override
    public void update(Expence expence, String name, long amount) {
        expence.setName(name);
        expence.setAmount(amount);
        repository.save(expence);
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
