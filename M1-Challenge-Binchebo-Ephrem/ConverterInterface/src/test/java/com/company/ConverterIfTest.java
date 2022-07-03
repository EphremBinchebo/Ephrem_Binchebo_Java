package com.company;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ConverterIfTest {
    private Converter converter1;
    @Before
    public void setUp(){
        converter1 = new ConverterIf();
    }
    @Test
    public void shouldConvertAValidNumberToCorrespondingMonth(){
        //Arrange
        String expectedValue = "January";
        //Act
        String actualValue = converter1.convertMonth(1);
        //Assert
        assertEquals(expectedValue, actualValue);

        expectedValue = "March";
        //Act
        actualValue = converter1.convertMonth(3);
        //Assert
        assertEquals(expectedValue, actualValue);

        expectedValue = "May";
        //Act
        actualValue = converter1.convertMonth(5);
        //Assert
        assertEquals(expectedValue, actualValue);

        expectedValue = "November";
        //Act
        actualValue = converter1.convertMonth(11);
        //Assert
        assertEquals(expectedValue, actualValue);
    }
    @Test
    public void shouldConvertAValidNumberToCorrespondingDay(){
        String expectedValue = "Sunday";
        //Act
        String actualValue = converter1.convertDay(1);
        //Assert
        assertEquals(expectedValue, actualValue);

        expectedValue = "Wednesday";
        //Act
         actualValue = converter1.convertDay(4);
        //Assert
        assertEquals(expectedValue, actualValue);

        expectedValue = "Saturday";
        //Act
        actualValue = converter1.convertDay(7);
        //Assert
        assertEquals(expectedValue, actualValue);

        expectedValue = "Monday";
        //Act
        actualValue = converter1.convertDay(2);
        //Assert
        assertEquals(expectedValue, actualValue);
    }

    @Test
    public void shouldReturnNoMonthForInValidNumber(){
        String expectedValue = "No day";
        //Act
        String actualValue = converter1.convertDay(0);
        //Assert
        assertEquals(expectedValue, actualValue);
        expectedValue = "No day";
        //Act
        actualValue = converter1.convertDay(29);
        //Assert
        assertEquals(expectedValue, actualValue);

        expectedValue = "No day";
        //Act
        actualValue = converter1.convertDay(-5);
        //Assert
        assertEquals(expectedValue, actualValue);
    }
    public void shouldReturnNoDayForInValidNumber(){
        String expectedValue = "No day";
        //Act
        String actualValue = converter1.convertMonth(0);
        //Assert
        assertEquals(expectedValue, actualValue);
        expectedValue = "No month";
        //Act
        actualValue = converter1.convertMonth(29);
        //Assert
        assertEquals(expectedValue, actualValue);

        expectedValue = "No month";
        //Act
        actualValue = converter1.convertMonth(-5);
        //Assert
        assertEquals(expectedValue, actualValue);
    }
}