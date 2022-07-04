package com.company;




import com.company.factory.IceCream;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {

        //Instatiating Ice Cream Objects

        com.company.factory.IceCream  factoryIceCream1 = new IceCream("Vanilla","Big",4.50,2.50, new Date(122,7,1),new String[]{"Suger", "Butter", "Cream"});
        com.company.factory.IceCream  factoryIceCream2 = new IceCream("Vanilla","Big",4.50,2.50, new Date(122,7,1),new String[]{"Suger", "Butter", "Cream"});
        com.company.factory.IceCream  factoryIceCream3 = new IceCream("Vanilla","Big",4.50,2.50, new Date(122,7,1),new String[]{"Suger", "Butter", "Cream", "Color"});


        com.company.pointofsale.IceCream pointOfSaleIceCream1 = new com.company.pointofsale.IceCream("Vanilla", 4.50, 10, "Big", false, new Date(122,7,6),0.015,0.01);
        com.company.pointofsale.IceCream pointOfSaleIceCream2 = new com.company.pointofsale.IceCream("Vanilla", 4.50, 10, "Big", false, new Date(122,7,6),0.015,0.01);
        com.company.pointofsale.IceCream pointOfSaleIceCream3 = new com.company.pointofsale.IceCream("Vanilla", 4.50, 10, "Big", false, new Date(122,7,7),0.015,0.01);

        System.out.println(pointOfSaleIceCream1.equals(pointOfSaleIceCream2)); //true
        System.out.println(pointOfSaleIceCream1.equals(pointOfSaleIceCream3)); // false
        System.out.println(factoryIceCream1.equals(factoryIceCream2)); //true
        System.out.println(factoryIceCream1.equals(factoryIceCream3)); // false

        //Implement pointOfSaleIceCream Methods
        //calculate the total price at pont of sale
        System.out.println(pointOfSaleIceCream1.calculateTheTotalPriceAtPointOfSale("OH"));
        System.out.println(pointOfSaleIceCream1.calculateTheTotalPriceAtPointOfSale("DC"));
        System.out.println(pointOfSaleIceCream1.calculateTheTotalPriceAtPointOfSale("MA"));
        System.out.println(pointOfSaleIceCream1.calculateTheTotalPriceAtPointOfSale("TX"));
        //Implement calculateGrossProfitMethods
        System.out.println(pointOfSaleIceCream1.calculateGrossProfitFromSale(factoryIceCream1, "OH"));//3.035
        System.out.println(pointOfSaleIceCream1.calculateGrossProfitFromSale(factoryIceCream1, "DC"));//3.305
        System.out.println(pointOfSaleIceCream1.calculateGrossProfitFromSale(factoryIceCream1, "MA"));//2.855
        System.out.println(pointOfSaleIceCream1.calculateGrossProfitFromSale(factoryIceCream1, "TA"));//2.0

//       //Calculate the expiration date
          System.out.println(pointOfSaleIceCream1.evaluateTheExpirationDateOfIceCream(factoryIceCream1));

        //Implement factoryIceCream Methods
        //Checking two icecream Objects for equality
        System.out.println(factoryIceCream1.equals(factoryIceCream2)); // true
        System.out.println(factoryIceCream1.equals(factoryIceCream3));// false
        // CalculateProfit
        System.out.println(factoryIceCream1.calculateProfit()); // 2.0

        //Implement listAllIngredients method
        //This method recieve flavor name from the user and display Ingridients used to produce
        factoryIceCream1.listAllIngredients(); //Enter Vanilla to the name of a flavor

        // Implement getter and setter methods
        System.out.println(factoryIceCream1.getFlavor());
        System.out.println(factoryIceCream1.getProductionTime());
        //Ingredients
        String[] ingredients = factoryIceCream1.getIngredients();
        System.out.println(ingredients[0] +"," + ingredients[1] + "," + ingredients[2]);
        System.out.println(factoryIceCream1.getSalePrice());
        System.out.println(factoryIceCream1.toString());

        //Implement getter and Setter Methods for pointOfSaleIceCream
        System.out.println(pointOfSaleIceCream1.getSalesTime());
        System.out.println(pointOfSaleIceCream1.isExpired());
        System.out.println(pointOfSaleIceCream1.getFlavor());
        factoryIceCream1.listAllIngredients();

    }


}
