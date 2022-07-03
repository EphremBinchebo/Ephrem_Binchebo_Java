package com.company;

import org.junit.Test;

import static org.junit.Assert.*;

public class WarriorTest {

    @Test
    public void shouldAttackAttackAnotherCharacterAndCrushingHisHealthWhenHisAttackingPowerIsGreater() {
        //Arrange
        Farmer farmerCharacter = new Farmer();
        Constable constableCharacter = new Constable();
        Warrior warriorCharacter = new Warrior();
    }
    @Test
    public void shouldAttackAnotherCharacterWithOutCrushingHisHealthWhenHisAttackingPowerIsGreaterZero() {
        //Arrange
        Farmer farmerCharacter = new Farmer();
        Constable constableCharacter = new Constable();
        Warrior warriorCharacter = new Warrior();
    }
    @Test
    public void shouldNotAttackAnotherCharacterWhenHisAttackingPowerIsNotGreaterThanZero() {
        //Arrange
        Farmer farmerCharacter = new Farmer();
        Constable constableCharacter = new Constable();
        Warrior warriorCharacter = new Warrior();
    }
}