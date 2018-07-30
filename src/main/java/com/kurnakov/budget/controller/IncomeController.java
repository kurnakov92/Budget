package com.kurnakov.budget.controller;

import com.kurnakov.budget.service.IncomeService;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("income")
public class IncomeController {

    private IncomeService service;

    public IncomeController(IncomeService service) {
        this.service = service;
    }

    @RequestMapping("create")
    public HttpStatus create(@RequestParam long id, @RequestParam String name,
                             @RequestParam long amount) {
        service.create(id, name, amount);
        return HttpStatus.CREATED;
    }

}
