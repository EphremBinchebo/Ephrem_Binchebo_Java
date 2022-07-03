package com.company;

public class Calculator {
    private int a;
    private int b;

    public int add(int a, int b){
        int result = a + b;
        System.out.println(a + " + " + b + " = " + result );
        return result;
    }
    public double add(double a, double b){

        double result = a + b;
        System.out.println(a + " + " + b + " = " + result);
        return result;
    }

    public int subtract(int a, int b){
        int result = a -b;
        System.out.println(a + " - " + b + " = " + result);
        return result;
    }
    public double subtract(double a, double b){
        double result = a -b;
        System.out.println(a + " - " + b + " = " + result);
        return result;
    }
    public int multiply(int a, int b){
        int result = a*b;
        System.out.println(a + " * " + b + " = " + result);
        return result;
    }
    public double multiply(double a, double b){
        double result = a * b;
        System.out.println(a + " * " + b + " = " + result);
        return result;
    }
    public int divide(int a, int b) {
        int result=0;
        if(b != 0) {
             result = a / b;
            System.out.println(a + "/" + b + " = " + result);
            return result;
        }else{
            System.out.println("Undefined");
        }
        return result;
    }
    public double divide(double a, double b){
        double result = a / b;
        System.out.println(a + "/" + b + " = " + result);
        return result;
    }

}
