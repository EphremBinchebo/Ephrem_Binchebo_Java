package com.company;

import org.junit.Test;

import static org.junit.Assert.*;

public class ConstableTest {
    @Test
    public void shouldAttackAttackAnotherCharacterAndCrushingHisHealthWhenHisAttackingPowerIsGreater() {
        //Arrange
        Farmer farmerCharacter = new Farmer();
        Constable constableCharacter = new Constable();
        Warrior warriorCharacter = new Warrior();

        int expectedValue = farmerCharacter.getHealth() - 5;
        // Act
        constableCharacter.attack(farmerCharacter);
        int actualValue = farmerCharacter.getHealth();
        //Assert
        assertEquals(expectedValue, actualValue);

        warriorCharacter.setAttackPower(3);
        expectedValue = warriorCharacter.getHealth()-5;
        // Act
        constableCharacter.attack(warriorCharacter);
        actualValue = warriorCharacter.getHealth();
        //Assert
        assertEquals(expectedValue, actualValue);

        constableCharacter.setAttackPower(8);
        farmerCharacter.setAttackPower(5);
        expectedValue = farmerCharacter.getHealth()-5;
        // Act
        constableCharacter.attack(farmerCharacter);
        actualValue = farmerCharacter.getHealth();
        //Assert
        assertEquals(expectedValue, actualValue);

        constableCharacter.setAttackPower(4);
        farmerCharacter.setAttackPower(4);
        expectedValue = farmerCharacter.getHealth();
        // Act
        constableCharacter.attack(farmerCharacter);
        actualValue = farmerCharacter.getHealth();
        //Assert
        assertEquals(expectedValue, actualValue);
    }
    @Test
    public void shouldAttackAnotherCharacterWithOutCrushingHisHealthWhenHisAttackingPowerIsGreaterZero(){
        //Arrange
        Farmer farmerCharacter = new Farmer();
        Constable constableCharacter = new Constable();
        Warrior warriorCharacter = new Warrior();

        warriorCharacter.setAttackPower(8);
        int expectedValue = warriorCharacter.getHealth();
        // Act
        constableCharacter.attack(warriorCharacter);
        int actualValue = warriorCharacter.getHealth();
        //Assert
        assertEquals(expectedValue, actualValue);

        constableCharacter.setAttackPower(4);
        farmerCharacter.setAttackPower(8);
        expectedValue = farmerCharacter.getHealth();
        // Act
        constableCharacter.attack(farmerCharacter);
        actualValue = farmerCharacter.getHealth();
        //Assert
        assertEquals(expectedValue, actualValue);

        warriorCharacter.setAttackPower(7);
        expectedValue = warriorCharacter.getHealth();
        // Act
        constableCharacter.attack(warriorCharacter);
        actualValue = warriorCharacter.getHealth();
        //Assert
        assertEquals(expectedValue, actualValue);
    }
    @Test
    public void shouldNotAttackAnotherCharacterWhenHisAttackingPowerIsNotGreaterThanZero() {
        //Arrange
        Farmer farmerCharacter = new Farmer();
        Constable constableCharacter = new Constable();
        Warrior warriorCharacter = new Warrior();

        constableCharacter.setAttackPower(0);
        warriorCharacter.setAttackPower(7);
        int expectedValue = warriorCharacter.getHealth();
        // Act
        constableCharacter.attack(warriorCharacter);
        int actualValue = warriorCharacter.getHealth();
        //Assert
        assertEquals(expectedValue, actualValue);

        constableCharacter.setAttackPower(-1);
        warriorCharacter.setAttackPower(7);
         expectedValue = warriorCharacter.getHealth();
        // Act
        constableCharacter.attack(warriorCharacter);
        actualValue = warriorCharacter.getHealth();
        //Assert
        assertEquals(expectedValue, actualValue);
    }
}