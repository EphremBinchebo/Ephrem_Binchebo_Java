package com.company.challengeTwo.controller;

import com.company.challengeTwo.model.Month;
import com.company.challengeTwo.service.MonthService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@RequestMapping("/month")
@RestController
public class MonthController {
    @Autowired
    private MonthService monthService;
    @GetMapping("/{monthNumber}")
    public Month getMonthByMonthNumber(@PathVariable int monthNumber) {
        if(monthNumber < 1 || monthNumber >= 12){
            throw new IllegalArgumentException("Input must be between 1 and 12");
        }else {
            return monthService.getMonthByMonthNumber(monthNumber);
        }
    }

    @GetMapping("/randomMonth")
    public Month getMonthByRandomNumber() {
        return monthService.getMonthByRandomNumber();
    }
}
