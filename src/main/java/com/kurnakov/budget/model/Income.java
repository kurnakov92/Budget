package com.kurnakov.budget.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Income {

    private long id;

    private String name;

    private long amount;

    private String dateTime;

}
