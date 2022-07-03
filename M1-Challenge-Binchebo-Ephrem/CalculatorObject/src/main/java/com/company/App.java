package com.company;

public class App {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
       //Perform the following calculations
        // 1+1=2
        calculator.add(1,1);

        //23-52
        calculator.subtract(23,52);

        //34*2
        calculator.multiply(34,2);

        //12/3
        calculator.divide(12,3);

        //12/7
        calculator.divide(12,3);

        //3.4+2.3
        calculator.add(3.4,2.3);

        //6.7*4.4
        calculator.multiply(6.7,4.4);

        //5.5 - 0.5
        calculator.subtract(5.5,0.5);

        //10.8/2.2
        calculator.divide(88,0);
    }
}
