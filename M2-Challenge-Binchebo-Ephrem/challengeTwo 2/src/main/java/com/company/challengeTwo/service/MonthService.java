package com.company.challengeTwo.service;

import com.company.challengeTwo.model.Month;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class MonthService {

    private List<Month> monthList = new ArrayList<>(Arrays.asList(
            new Month(1, "January"),
            new Month(2, "February"),
            new Month(3, "March"),
            new Month(4, "April"),
            new Month(5, "May"),
            new Month(6, "June"),
            new Month(7, "July"),
            new Month(8, "August"),
            new Month(9, "September"),
            new Month(10, "October"),
            new Month(11, "November"),
            new Month(12, "December")
    ));

    public Month getMonthByMonthNumber( int num) {
        if (num >= 1 || num <= 12) {
            Month month = monthList.stream()
                    .filter(m -> m.getNumber() == (num))
                    .findFirst()
                    .orElse(null);
            return month;
        } else {
            return null;
        }
    }
    public Month getMonthByRandomNumber() {
        int number2 = (int)(Math.random() * 12 + 1);
        Month month2 = monthList.get(1);
        for (int i = 0; i < monthList.size(); i++) {
            if(i==number2) {
                month2 = monthList.get(i);
                return  month2;
            }
        }
        return month2;
    }
}
