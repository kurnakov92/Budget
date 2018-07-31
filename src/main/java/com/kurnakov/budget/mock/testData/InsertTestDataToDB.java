package com.kurnakov.budget.mock.testData;

import com.kurnakov.budget.model.Expence;
import com.kurnakov.budget.model.Income;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Component
public class InsertTestDataToDB {

    private List<Income> incomeList = new ArrayList<>();
    private List<Expence> expenceList = new ArrayList<>();

    private void setIncomes() {
        incomeList.add(new Income(
                1,
                "Зарплата",
                20000,
                LocalDateTime.now().minusDays(4).toString()
        ));
        incomeList.add(new Income(
                2,
                "Пенсия",
                8000,
                LocalDateTime.now().minusDays(2).toString()
        ));
        incomeList.add(new Income(
                3,
                "Премия",
                4000,
                LocalDateTime.now().toString()
        ));
    }

    private void setExpences() {
        expenceList.add(new Expence(
                1,
                "Услуги ЖКХ",
                4000,
                LocalDateTime.now().minusDays(2).toString()
        ));
        expenceList.add(new Expence(
                2,
                "проезд",
                230,
                LocalDateTime.now().minusDays(1).toString()
        ));
        expenceList.add(new Expence(
                3,
                "Еда",
                1500,
                LocalDateTime.now().minusDays(1).toString()
        ));
        expenceList.add(new Expence(
                4,
                "Проезд",
                230,
                LocalDateTime.now().minusDays(0).toString()
        ));
        expenceList.add(new Expence(
                5,
                "Еда",
                1000,
                LocalDateTime.now().minusDays(0).toString()
        ));

    }

    public List<Income> getIncomeList() {
        setIncomes();
        return incomeList;
    }

    public List<Expence> getExpenceList() {
        setExpences();
        return expenceList;
    }
}
