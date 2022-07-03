package com.company;

import java.util.Objects;

public class Warrior extends Character{
    private int shieldStrength;

    public Warrior(String name, int strength, int health, int stamina, int speed, int attackPower, boolean running, boolean arrested, int shieldStrength) {
        super(name, strength, health, stamina, speed, attackPower, running, arrested);
        this.shieldStrength = shieldStrength;
    }

    public Warrior() {
        super("Warior", 75,100,100,50,10,false,false);
        this.shieldStrength =100;
    }

    public int getShieldStrength() {
        return shieldStrength;
    }

    public void setShieldStrength(int shieldStrength) {
        this.shieldStrength = shieldStrength;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Warrior)) return false;
        if (!super.equals(o)) return false;
        Warrior warrior = (Warrior) o;
        return shieldStrength == warrior.shieldStrength;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), shieldStrength);
    }

    @Override
    public String toString() {
        return "Warrior{"+
                " name='" + this.getName() + '\'' +
                ", strength=" + this.getStrength() +
                ", health=" + this.getHealth() +
                ", stamina=" + this.getStamina() +
                ", speed=" + this.getSpeed() +
                ", attackPower=" + this.getAttackPower() +
                ", running=" + this.isRunning() +
                ", arrested=" + this.isArrested() +
                ", shieldStrength=" + shieldStrength +
                '}';
    }
}
