package com.kurnakov.budget.controller;

import com.kurnakov.budget.model.Income;
import com.kurnakov.budget.service.IncomeService;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.Optional;

@RestController
@RequestMapping("income")
@PropertySource("classpath:controllers.properties")
public class IncomeController implements BudgetItemController<Income> {

    private IncomeService service;

    @Resource
    private Environment env;

    public IncomeController(IncomeService service) {
        this.service = service;
    }

    @Override
    @RequestMapping(value = "create", method = RequestMethod.POST)
    public String create(@RequestBody Income income) {
        service.create(income);
        return env.getProperty("ITEM_CREATED");
    }

    @Override
    @RequestMapping("findById")
    public Optional<Income> findById(@RequestParam long id) {
        return service.findBudgetItemById(id);
    }

    @Override
    @RequestMapping(value = "update", method = RequestMethod.PUT)
    public String update(@RequestBody Income item, @RequestParam String name, @RequestParam long amount) {
        service.update(item, name, amount);
        return env.getProperty("ITEM_UPDATED");
    }

    @Override
    @RequestMapping(value = "delete", method = RequestMethod.DELETE)
    public String delete(@RequestBody Income item) {
        service.delete(item);
        return env.getProperty("ITEM_DELETED");
    }

    @Override
    @RequestMapping(value = "deleteAll", method = RequestMethod.DELETE)
    public String deleteAll() {
        service.deleteAll();
        return env.getProperty("ITEMS_DELETED_ALL");
    }
}
