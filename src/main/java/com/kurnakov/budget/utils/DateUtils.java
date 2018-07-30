package com.kurnakov.budget.utils;

import java.time.LocalDateTime;
import java.time.ZoneOffset;
import java.time.format.DateTimeFormatter;

public class DateUtils {

    public static long getMilisFromStringDate(String date) {
        LocalDateTime localDateTime = LocalDateTime.parse(date, DateTimeFormatter.ISO_LOCAL_DATE_TIME);
        return localDateTime.toEpochSecond(ZoneOffset.UTC);
    }

    public static LocalDateTime getLocalDateTimeFromString(String date){
        LocalDateTime localDateTime = LocalDateTime.parse(date, DateTimeFormatter.ISO_LOCAL_DATE_TIME);
        return localDateTime;
    }

}
