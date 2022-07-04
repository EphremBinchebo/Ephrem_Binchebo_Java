package com.company.pointofsale;

import org.junit.Before;
import org.junit.Test;

import java.util.Date;

import static org.junit.Assert.*;

public class IceCreamTest {
    private com.company.pointofsale.IceCream iceCreamAtPointOfSale;
    com.company.factory.IceCream iceCreamAtFactory;
    @Before
    public void setUp(){
        iceCreamAtPointOfSale = new IceCream();
        iceCreamAtFactory = new com.company.factory.IceCream();
    }
    @Test
    public void shouldCalculateTheTotalPriceOfIceCreamAtPointOfSaleIncludingServiceFeeAndTax(){
        //Arrange
        iceCreamAtPointOfSale.setPrice(4.0);
        double expectedValue = 4.92;
        //Act
        double actualValue = iceCreamAtPointOfSale.calculateTheTotalPriceAtPointOfSale("OH");
       //Assert
        assertEquals(expectedValue, actualValue, 0.001);

        iceCreamAtPointOfSale.setPrice(5.50);
         expectedValue = 6.545;
        //Act
        actualValue = iceCreamAtPointOfSale.calculateTheTotalPriceAtPointOfSale("MA");
        //Assert
        assertEquals(expectedValue, actualValue, 0.001);

        iceCreamAtPointOfSale.setPrice(3.50);
        expectedValue = 4.515;
        //Act
        actualValue = iceCreamAtPointOfSale.calculateTheTotalPriceAtPointOfSale("DC");
        //Assert
        assertEquals(expectedValue, actualValue, 0.001);
    }
    @Test
    public void shouldReturnZeroTotalPriceAtPointOfSaleForNonPricedIceCream(){
        //Arrange
        double expectedValue = 0.0;
        //Act
        double actualValue = iceCreamAtPointOfSale.calculateTheTotalPriceAtPointOfSale("CA");
        //Assert

        assertEquals(expectedValue, actualValue,0.001);
         expectedValue = 0.0;
        //Act
         actualValue = iceCreamAtPointOfSale.calculateTheTotalPriceAtPointOfSale("TX");
        //Assert
        assertEquals(expectedValue, actualValue,0.001);
    }

    @Test
    public void shouldCalculateTheTotalPriceOfIceCreamAtPointOfSaleWhenServiceFeeAndTAXZero(){
        iceCreamAtPointOfSale.setPrice(4.0);
        double expectedValue = 4.0;
        //Act
        double actualValue = iceCreamAtPointOfSale.calculateTheTotalPriceAtPointOfSale("TX");
        //Assert
        assertEquals(expectedValue, actualValue, 0.001);
    }
    @Test
    public void shouldReturnTrueIfTheIceCreamAtPointOfSaleDateExpired(){
        //Arrange
        iceCreamAtPointOfSale.setFlavor("Chockolate");
        iceCreamAtFactory.setProductionTime(new Date(122,07,01));
        iceCreamAtPointOfSale.setSalesTime(new Date(122,07,8));
        boolean expectedValue = true;
         //Act
        boolean actualValue = iceCreamAtPointOfSale.evaluateTheExpirationDateOfIceCream(iceCreamAtFactory);
        //Assert
        assertEquals(expectedValue, actualValue);

        iceCreamAtFactory.setProductionTime(new Date(122,04,01));
        iceCreamAtPointOfSale.setSalesTime(new Date(122,06,6));
         expectedValue = true;
        //Act
         actualValue = iceCreamAtPointOfSale.evaluateTheExpirationDateOfIceCream(iceCreamAtFactory);
        //Assert
        assertEquals(expectedValue, actualValue);
    }
    @Test
    public void shouldReturnFalseIfTheIceCreamAtPointOfSaleDateNotExpired(){
        //Arrange
        iceCreamAtPointOfSale.setFlavor("Vanilla");
        iceCreamAtFactory.setProductionTime(new Date(122,07,01));
        iceCreamAtPointOfSale.setSalesTime(new Date(122,07,4));
        boolean expectedValue = false;
        //Act
        boolean actualValue = iceCreamAtPointOfSale.evaluateTheExpirationDateOfIceCream(iceCreamAtFactory);
        //Assert
        assertEquals(expectedValue, actualValue);

        //Arrange
        iceCreamAtFactory.setProductionTime(new Date(122,06,29));
        iceCreamAtPointOfSale.setSalesTime(new Date(122,07,3));
         expectedValue = false;
        //Act
        actualValue = iceCreamAtPointOfSale.evaluateTheExpirationDateOfIceCream(iceCreamAtFactory);
        //Assert
        assertEquals(expectedValue, actualValue);
    }

      @Test
      public void shouldCalculateGrossProfitFromSaleOfIceCreamAtPointOfSale(){
        //Arrange
          iceCreamAtFactory.setProductionCost(3.0);
          iceCreamAtPointOfSale.setPrice(5.0);
          double expectedValue = 3.45;
          //Act
          double actualValue = iceCreamAtPointOfSale.calculateGrossProfitFromSale(iceCreamAtFactory,"CA");
          //Assert
          assertEquals(expectedValue, actualValue, 0.001);

          iceCreamAtFactory.setProductionCost(2.68);
          iceCreamAtPointOfSale.setPrice(4.56);
          expectedValue = 3.202;
          //Act
          actualValue = iceCreamAtPointOfSale.calculateGrossProfitFromSale(iceCreamAtFactory,"DC");
          //Assert
          assertEquals(expectedValue, actualValue, 0.001);

          iceCreamAtFactory.setProductionCost(3.68);
          iceCreamAtPointOfSale.setPrice(5.36);
          expectedValue = 1.68;
          //Act
          actualValue = iceCreamAtPointOfSale.calculateGrossProfitFromSale(iceCreamAtFactory,"TX");
          //Assert
          assertEquals(expectedValue, actualValue, 0.001);

      }

      @Test
      public void shouldCalculateGrossProfitForIceCreamAtPontOfSaleAndReturnZeroForNonPricedIceCream(){
          //Arrange
          iceCreamAtFactory.setProductionCost(3.0);
          double expectedValue = 0.00;

          //Act
          double actualValue = iceCreamAtPointOfSale.calculateGrossProfitFromSale(iceCreamAtFactory,"CA");
          //Assert
          assertEquals(expectedValue, actualValue, 0.001);

          iceCreamAtFactory.setProductionCost(2.0);
          iceCreamAtPointOfSale.setPrice(-2.0);
           expectedValue = 0.00;

          //Act
          actualValue = iceCreamAtPointOfSale.calculateGrossProfitFromSale(iceCreamAtFactory,"CA");
          //Assert
          assertEquals(expectedValue, actualValue, 0.001);
      }
}