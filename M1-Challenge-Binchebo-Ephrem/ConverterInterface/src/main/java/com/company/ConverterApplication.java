package com.company;

public class ConverterApplication {
    public static void main(String[] args) {

        Converter converter1 = new ConverterIf();
        Converter converter2 = new ConverterSwitch();

        //Implement Converter methods
        //ConverterIf convertMonth Method
        String monthNumber1 = converter1.convertMonth(1);
        System.out.println("Month No 1: " + monthNumber1);
        String monthNumber5 = converter1.convertMonth(5);
        System.out.println("Month No 5: " + monthNumber5);
        String monthNumber10 = converter1.convertMonth(10);
        System.out.println("Month No 10: " + monthNumber10);
        String monthNumber12 = converter1.convertMonth(12);
        System.out.println("Month No 12: " + monthNumber12);
        String monthNumber0 = converter1.convertMonth(0);
        System.out.println("N0 month for no 0: " + monthNumber0);
        String monthNumber30 = converter1.convertMonth(30);
        System.out.println("No month for no 30: " + monthNumber30);
        System.out.println();
        //ConverterIf convertDay Method
        String dayNumber1 = converter1.convertDay(1);
        System.out.println("Day No 1: " + dayNumber1);
        String dayNumber3 = converter1.convertDay(3);
        System.out.println("Day No 3: " + dayNumber3);
        String dayNumber5 = converter1.convertDay(5);
        System.out.println("Day No 5: " + dayNumber5);
        String dayNumber7 = converter1.convertDay(7);
        System.out.println("Day No 7: " + dayNumber7);
        String dayNumber0 = converter1.convertDay(0);
        System.out.println("N0 day for no 0: " + dayNumber0);
        String dayNumber12 = converter1.convertDay(0);
        System.out.println("No day for no 12: " + dayNumber12);
        System.out.println();
        System.out.println();
        //Implement ConverterSwitch Methods
        //ConverterSwitch convertMonth Method
         monthNumber1 = converter2.convertMonth(1);
        System.out.println("Month No 1: " + monthNumber1);
         monthNumber5 = converter2.convertMonth(5);
        System.out.println("Month No 5: " + monthNumber5);
        monthNumber10 = converter2.convertMonth(10);
        System.out.println("Month No 10: " + monthNumber10);
        monthNumber12 = converter2.convertMonth(12);
        System.out.println("Month No 12: " + monthNumber12);
        monthNumber0 = converter2.convertMonth(0);
        System.out.println("N0 month for no 0: " + monthNumber0);
        monthNumber30 = converter2.convertMonth(30);
        System.out.println("No month for no 30: " + monthNumber30);
        System.out.println();
        //ConverterIf convertDay Method
        dayNumber1 = converter2.convertDay(1);
        System.out.println("Day No 1: " + dayNumber1);
         dayNumber3 = converter2.convertDay(3);
        System.out.println("Day No 3: " + dayNumber3);
        dayNumber5 = converter2.convertDay(5);
        System.out.println("Day No 5: " + dayNumber5);
        dayNumber7 = converter2.convertDay(7);
        System.out.println("Day No 7: " + dayNumber7);

        dayNumber0 = converter2.convertDay(0);
        System.out.println("No day for no 0: " + dayNumber0);
        dayNumber12 = converter2.convertDay(0);
        System.out.println("No day for no 12: " + dayNumber12);
    }
}
