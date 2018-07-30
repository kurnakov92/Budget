package com.kurnakov.budget.controller;

import com.kurnakov.budget.model.Expence;
import com.kurnakov.budget.service.ExpenceService;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
@RequestMapping("expence")
@PropertySource("classpath:controllers.properties")
public class ExpenceController implements BudgetItemController<Expence> {

    private ExpenceService service;

    @Resource
    private Environment env;

    public ExpenceController(ExpenceService service) {
        this.service = service;
    }

    @Override
    public String create(long id, String name, long amount) {
        return env.getProperty("ITEM_CREATED");
    }

    @Override
    public Expence findBudetIntemById(long id) {
        return null;
    }

    @Override
    public String update(Expence budgetItem, String name, long amount) {
        return env.getProperty("ITEM_UPDATED");
    }

    @Override
    public String delete(Expence budgetItem) {
        return env.getProperty("ITEM_DELETED");
    }

    @Override
    public String deleteAll(Expence budgetItem) {
        return env.getProperty("ITEMS_DELETED_ALL");
    }
}
