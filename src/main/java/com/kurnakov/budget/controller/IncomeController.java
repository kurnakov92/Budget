package com.kurnakov.budget.controller;

import com.kurnakov.budget.model.Income;
import com.kurnakov.budget.service.IncomeService;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

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
    @RequestMapping("create")
    public String create(@RequestParam long id, @RequestParam String name,
                         @RequestParam long amount) {
        service.create(id, name, amount);
        return env.getProperty("ITEM_CREATED");
    }

    @Override
    @RequestMapping("findById")
    public Optional<Income> findById(@RequestParam long id) {
        return service.findBudgetItemById(id);
    }

    @Override
    @RequestMapping(value = "update", method = RequestMethod.PUT)
    public String update(@RequestParam Income item, @RequestParam String name, @RequestParam long amount) {
        service.update(item, name, amount);
        return env.getProperty("ITEM_UPDATED");
    }

    @Override
    @RequestMapping(value = "delete", method = RequestMethod.DELETE)
    public String delete(@RequestParam Income item) {
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
