package com.kurnakov.budget.mock.controller;

import com.kurnakov.budget.mock.testData.InsertTestDataToDB;
import com.kurnakov.budget.model.Expence;
import com.kurnakov.budget.model.Income;
import com.kurnakov.budget.service.ExpenceService;
import com.kurnakov.budget.service.IncomeService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("test")
public class TestDataController {

    private IncomeService incomeService;
    private ExpenceService expenceService;
    private InsertTestDataToDB testDataToDB;

    public TestDataController(IncomeService incomeService, ExpenceService expenceService, InsertTestDataToDB testDataToDB) {
        this.incomeService = incomeService;
        this.expenceService = expenceService;
        this.testDataToDB = testDataToDB;
    }

    @RequestMapping("setTestIncomes")
    public String setTestIncomes() {
        for (Income income : testDataToDB.getIncomeList()) {
            incomeService.create(income);
        }
        return "Test incomes created and saved to DB";
    }

    @RequestMapping("setTestExpences")
    public String setTestExpences() {
        for (Expence expence : testDataToDB.getExpenceList()) {
            expenceService.create(expence);
        }
        return "Test expences created and saved to DB";
    }

}
