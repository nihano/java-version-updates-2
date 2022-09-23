package com.cydeo.java9;

import java.time.LocalDate;

public interface PrivateMethodInterface {

    boolean isHoliday(LocalDate date);

    default boolean isBusinessHoliday(LocalDate date) {
        validate(date);
        LocalDate nextDate = date.plusDays(1);
        return !isHoliday(date);
    }

    default LocalDate nextDay(LocalDate date) {
        validate(date);
        LocalDate nextDate = date.plusDays(1);
        return isHoliday(nextDate) ? nextDay(nextDate) : nextDate;
    }

    private void validate(LocalDate date) {
        if (date.isBefore(LocalDate.of(2001, 1, 1))) {
            throw new IllegalArgumentException();
        }
    }

    /*
    we have repetitive code in the above methods,
    so we can create a private method instead
    writing the same code over again. this came after java 8.
    We will use validate just in this interface, so it is private.
     */


}
