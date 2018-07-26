package com.kurnakov.budget.controller;

import com.kurnakov.budget.repository.IncomeRepository;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("income")
public class IncomeController {

    private IncomeRepository repository;

    public IncomeController(IncomeRepository repository) {
        this.repository = repository;
    }

}
