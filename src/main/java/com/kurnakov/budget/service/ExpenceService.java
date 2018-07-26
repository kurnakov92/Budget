package com.kurnakov.budget.service;

import com.kurnakov.budget.model.Expence;

import java.time.LocalDateTime;

public interface ExpenceService {

    void create(long id, String name, long amount, LocalDateTime dateTime);

    void update(Expence expence, long id, String name, long amount, LocalDateTime dateTime);

    void delete(Expence expence);

    void deleteAll();

}
