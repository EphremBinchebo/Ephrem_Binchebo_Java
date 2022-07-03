package com.company;

import org.junit.Before;
import org.junit.Test;

import static jdk.nashorn.internal.objects.Global.Infinity;
import static org.junit.Assert.*;

public class CalculatorTest {
   private Calculator calculator;
   @Before
   public void setUp(){
       calculator = new Calculator();
   }

   @Test
    public void shouldAddTwoPositiveIntegers(){

       //Arrange
       int expectedOutput = 13;
       //Act
       int actualOutput = calculator.add(5, 8);
       //Assert
       assertEquals(expectedOutput,actualOutput);

       expectedOutput = 560;
       //Act
        actualOutput = calculator.add(280, 280);
       //Assert
       assertEquals(expectedOutput,actualOutput);
   }

    @Test
    public void shouldAddTwoNegativeIntegers(){

        //Arrange
        int expectedOutput = -13;
        //Act
        int actualOutput = calculator.add(-5, -8);
        //Assert
        assertEquals(expectedOutput,actualOutput);

        expectedOutput = -86;
        //Act
        actualOutput = calculator.add(-40, -46);
        //Assert
        assertEquals(expectedOutput,actualOutput);
    }

    @Test
    public void shouldAddTwoPositiveDoubles(){

        //Arrange
        double expectedOutput = 0.58;
        //Act
        double actualOutput = calculator.add(0.23, 0.35);
        //Assert
        assertEquals(expectedOutput,actualOutput,0.001);

        expectedOutput = 24.08;
        //Act
        actualOutput = calculator.add(12.00, 12.08);
        //Assert
        assertEquals(expectedOutput,actualOutput,0.001);
    }

    @Test
    public void shouldAddTwoNegativeDoubles(){

        //Arrange
        double expectedOutput = -5.55;
        //Act
        double actualOutput = calculator.add(-3.05, -2.50);
        //Assert
        assertEquals(expectedOutput,actualOutput,0.001);

        expectedOutput = -540.08;
        //Act
        actualOutput = calculator.add(-270.04, -270.04);
        //Assert
        assertEquals(expectedOutput,actualOutput,0.001);
    }

    @Test
    public void shouldSubtractTwoPositiveIntegers(){

        //Arrange
        int expectedOutput = -3;
        //Act
        int actualOutput = calculator.subtract(5, 8);
        //Assert
        assertEquals(expectedOutput,actualOutput);

        expectedOutput = 0;
        //Act
        actualOutput = calculator.subtract(280, 280);
        //Assert
        assertEquals(expectedOutput,actualOutput);
    }

    @Test
    public void shouldSubtractTwoNegativeIntegers(){

        //Arrange
        int expectedOutput = 3;
        //Act
        int actualOutput = calculator.subtract(-25, -28);
        //Assert
        assertEquals(expectedOutput,actualOutput);

        expectedOutput = 140;
        //Act
        actualOutput = calculator.subtract(-200, -340);
        //Assert
        assertEquals(expectedOutput,actualOutput);
    }

    @Test
    public void shouldSubtractTwoPositiveDoubles(){

        //Arrange
        double expectedOutput = 1.44;
        //Act
        double actualOutput = calculator.subtract(3.88, 2.44);
        //Assert
        assertEquals(expectedOutput,actualOutput,0.001);

        expectedOutput = 50.02;
        //Act
        actualOutput = calculator.subtract(100.06, 50.04);
        //Assert
        assertEquals(expectedOutput,actualOutput, 0.001);
    }

    @Test
    public void shouldSubtractTwoNegativeDoubles(){

        double expectedOutput = 1.8;
        //Act
        double actualOutput = calculator.subtract(-3.0, -4.8);
        //Assert
        assertEquals(expectedOutput,actualOutput,0.001);

        expectedOutput = 200.00;
        //Act
        actualOutput = calculator.subtract(-280.05, -480.05);
        //Assert
        assertEquals(expectedOutput,actualOutput, 0.001);
    }

    @Test
    public void shouldMultiplyTwoPositiveIntegers(){

        //Arrange
        int expectedOutput = 180;
        //Act
        int actualOutput = calculator.multiply(90, 2);
        //Assert
        assertEquals(expectedOutput,actualOutput);

        expectedOutput = 6;
        //Act
        actualOutput = calculator.multiply(3, 2);
        //Assert
        assertEquals(expectedOutput,actualOutput);
    }

    @Test
    public void shouldMultiplyTwoNegativeIntegers(){

        //Arrange
        int expectedOutput = 460;
        //Act
        int actualOutput = calculator.multiply(-23, -20);
        //Assert
        assertEquals(expectedOutput,actualOutput);

        expectedOutput = 560;
        //Act
        actualOutput = calculator.multiply(-280, -2);
        //Assert
        assertEquals(expectedOutput,actualOutput);
    }

    @Test
    public void shouldMultiplyTwoPositiveDoubles(){

        //Arrange
        double expectedOutput = 800.00;
        //Act
        double actualOutput = calculator.multiply(40.00, 20.0);
        //Assert
        assertEquals(expectedOutput,actualOutput,0.001);

        expectedOutput = 0.008;
        //Act
        actualOutput = calculator.multiply(0.002, 4.0);
        //Assert
        assertEquals(expectedOutput,actualOutput, 0.001);
    }

    @Test
    public void shouldSMultiplyTwoNegativeDoubles(){

        //Arrange
        double expectedOutput = 36.00;
        //Act
        double actualOutput = calculator.multiply(-4.0, -9.0);
        //Assert
        assertEquals(expectedOutput,actualOutput,0.001);

        expectedOutput = 360.00;
        //Act
        actualOutput = calculator.multiply(-40.0, -9.0);
        //Assert
        assertEquals(expectedOutput,actualOutput,0.001);
    }

    @Test
    public void shouldDivideTwoPositiveIntegers(){

        //Arrange
        int expectedOutput = 12;
        //Act
        int actualOutput = calculator.divide(144, 12);
        //Assert
        assertEquals(expectedOutput,actualOutput);

        expectedOutput = 4;
        //Act
        actualOutput = calculator.divide(36, 9);
        //Assert
        assertEquals(expectedOutput,actualOutput);
    }

    @Test
    public void shouldDivideTwoNegativeIntegers(){

        //Arrange
        int expectedOutput = 20;
        //Act
        int actualOutput = calculator.divide(-400, -20);
        //Assert
        assertEquals(expectedOutput,actualOutput);

        expectedOutput = 10;
        //Act
        actualOutput = calculator.divide(-530, -53);
        //Assert
        assertEquals(expectedOutput,actualOutput);
    }

    @Test
    public void shouldDivideTwoPositiveDoubles(){

        //Arrange
        double expectedOutput = 12.0066;
        //Act
        double actualOutput = calculator.divide(144.08, 12.00);
        //Assert
        assertEquals(expectedOutput,actualOutput,0.001);

        expectedOutput = 4.0044;
        //Act
        actualOutput = calculator.divide(36.04, 9.00);
        //Assert
        assertEquals(expectedOutput,actualOutput,0.001);

    }

    @Test
    public void shouldDivideTwoNegativeDoubles(){

        //Arrange
        double expectedOutput = 24.00;
        //Act
        double actualOutput = calculator.divide(-48.00, -2.00);
        //Assert
        assertEquals(expectedOutput,actualOutput,0.01);

        expectedOutput = 8.0;
        //Act
        actualOutput = calculator.divide(-800.00, -100.0);
        //Assert
        assertEquals(expectedOutput,actualOutput,0.001);
    }
    @Test
    public void shouldDivideAPositiveIntegerToZero(){
        //Arrange
        int expectedOutput = 0;
         //Act
        int  actualOutput = calculator.divide(280, 0);
          //Assert
        assertEquals(expectedOutput,actualOutput);
    }

    @Test
    public void shouldDivideAPositiveDoubleToZero(){
        //Arrange
        Double expectedOutput = Infinity;
        //Act
        double  actualOutput = calculator.divide(280.0, 0.0);
        //Assert
        assertEquals(expectedOutput,actualOutput, 0.001);
    }
}