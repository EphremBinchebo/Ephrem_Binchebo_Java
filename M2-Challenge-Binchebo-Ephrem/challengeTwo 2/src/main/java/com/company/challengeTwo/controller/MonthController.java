package com.company.challengeTwo.controller;

import com.company.challengeTwo.model.Month;
import com.company.challengeTwo.model.Response;
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
        return monthService.getMonthByMonthNumber(monthNumber);
    }
    //Another Method for testing purpose
//    @GetMapping("/{monthNumber}")
//    public Response getMonthByMonthNumberTest(@PathVariable int monthNumber) {
//        Month month = monthService.getMonthByMonthNumber(monthNumber);
//        return new Response("record counts :", Boolean.TRUE);
//    }
    @GetMapping("/randomNumber")
    public Month getMonthByRandomNumber() {
        return monthService.getMonthByRandomNumber();
    }
}
