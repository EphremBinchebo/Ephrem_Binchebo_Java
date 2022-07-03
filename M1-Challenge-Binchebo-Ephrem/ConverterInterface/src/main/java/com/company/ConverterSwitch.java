package com.company;

public class ConverterSwitch implements Converter {
    @Override
    public String convertMonth(int monthNumber) {
        String val = "No Month";
        switch (monthNumber){
            case 1:
                val = "January";
                 break;
            case 2:
                val = "February";
                break;
            case 3:
                val = "March";
                break;
            case 4:
                val = "April";
                break;
            case 5:
                val= "May";
                break;
            case 6:
                val = "June";
                break;
            case 7:
                val = "July";
                break;
            case 8:
                val = "August";
                break;
            case 9:
                val = "September";
                break;
            case 10:
                val = "October";
                break;
            case 11:
                val = "November";
                break;
            case 12:
                val = "December";
                break;
            default:
                val = val;
        }
        return val;
    }

    @Override
    public String convertDay(int dayNumber) {

        String val = "No day";
        switch (dayNumber){
            case 1:
                val = "Sunday";
                break;
            case 2:
                val = "Monday";
                break;
            case 3:
                val = "Tuesday";
                break;
            case 4:
                val = "Wednesday";
                break;
            case 5:
                val = "Thursday";
                break;
            case 6:
                val = "Friday";
                break;
            case 7:
                val = "Saturday";
                break;
        }
        return val;
    }

}
