package com.gdn.training;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Date;

import static org.junit.jupiter.api.Assertions.*;

class DateFormatterTest {
    @Test
    public void getFormattedYearMonthTest() {
        Date date = new Date();
        Assertions.assertThrows(IllegalArgumentException.class, () -> {
            DateFormatter.getFormattedYearMonth(null);
        });
    }
}