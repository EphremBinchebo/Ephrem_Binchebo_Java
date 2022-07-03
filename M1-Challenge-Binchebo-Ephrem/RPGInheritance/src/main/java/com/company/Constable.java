package com.company;

import java.util.Objects;

public class Constable extends Character{
    private String jurisdiction;

    public Constable(String name, int strength, int health, int stamina, int speed, int attackPower, boolean running, boolean arrested, String jurisdiction) {
        super(name, strength, health, stamina, speed, attackPower, running, arrested);
        this.jurisdiction = jurisdiction;
    }

    public Constable() {
        super("Constable", 60,100,60,20,5,false,false);

    }

    public void arrest(Character character){
        if(this.isRunning() && character.isRunning()) {
            if (this.getSpeed() >= character.getSpeed()) {
                System.out.println("Hey " + character.getName() + " You are Busted!!!");
                character.setArrested(true);
            }else {
                System.out.println("The " + character.getName() + " Running Away!!");
            }
        }else if(character.isRunning()){
            System.out.println("The " + character.getName() + " Running Away!!");
        }else if (this.isRunning()) {
            System.out.println("Hey " + character.getName() + " You are Busted!!!");
            character.setArrested(true);
        }
    }
    public String getJurisdiction() {
        return jurisdiction;
    }

    public void setJurisdiction(String jurisdiction) {
        this.jurisdiction = jurisdiction;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Constable)) return false;
        if (!super.equals(o)) return false;
        Constable constable = (Constable) o;
        return jurisdiction.equals(constable.jurisdiction);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), jurisdiction);
    }

    @Override
    public String toString() {
        return "Constable{" +
                " name='" + this.getName() + '\'' +
                ", strength=" + this.getStrength() +
                ", health=" + this.getHealth() +
                ", stamina=" + this.getStamina() +
                ", speed=" + this.getSpeed() +
                ", attackPower=" + this.getAttackPower() +
                ", running=" + this.isRunning() +
                ", arrested=" + this.isArrested() +
                ", jurisdiction='" + jurisdiction + '\'' +
                '}';
    }
}
