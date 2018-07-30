package com.kurnakov.budget.controller;

import com.kurnakov.budget.model.Income;
import com.kurnakov.budget.service.IncomeService;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
@RequestMapping("income")
@PropertySource("classpath:controllers.properties")
public class IncomeController implements BudgetItemController<Income>{

    private IncomeService service;

    @Resource
    private Environment env;

    public IncomeController(IncomeService service) {
        this.service = service;
    }

    @RequestMapping("create")
    public String create(@RequestParam long id, @RequestParam String name,
                             @RequestParam long amount) {
        service.create(id, name, amount);
        return env.getProperty("ITEM_CREATED");
    }

    @Override
    public Income findBudetIntemById(long id) {
        return null;
    }

    @Override
    public String update(Income budgetItem, String name, long amount) {
        return env.getProperty("ITEM_UPDATED");
    }

    @Override
    public String delete(Income budgetItem) {
        return env.getProperty("ITEM_DELETED");
    }

    @Override
    public String deleteAll(Income budgetItem) {
        return env.getProperty("ITEMS_DELETED_ALL");
    }
}
