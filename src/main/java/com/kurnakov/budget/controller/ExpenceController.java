package com.kurnakov.budget.controller;

import com.kurnakov.budget.service.ExpenceService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("expence")
public class ExpenceController {

    private ExpenceService service;

    public ExpenceController(ExpenceService service) {
        this.service = service;
    }

}
