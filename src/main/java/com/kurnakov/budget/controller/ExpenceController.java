package com.kurnakov.budget.controller;

import com.kurnakov.budget.model.Expence;
import com.kurnakov.budget.service.ExpenceService;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.Optional;

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
    @RequestMapping(value = "create", method = RequestMethod.POST)
    public String create(@RequestBody Expence expence) {
        service.create(expence);
        return env.getProperty("ITEM_CREATED");
    }

    @Override
    @RequestMapping("findById")
    public Optional<Expence> findById(@RequestParam long id) {
        return service.findBudgetItem(id);
    }

    @Override
    @RequestMapping(value = "update", method = RequestMethod.PUT)
    public String update(@RequestBody Expence item, @RequestParam String name, @RequestParam long amount) {
        service.update(item, name, amount);
        return env.getProperty("ITEM_UPDATED");
    }

    @Override
    @RequestMapping(value = "delete", method = RequestMethod.DELETE)
    public String delete(@RequestBody Expence item) {
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
