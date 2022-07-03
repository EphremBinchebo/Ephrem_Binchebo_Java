package com.company;

import java.util.Objects;

public class Farmer extends Character{
    private boolean plowing;
    private boolean harvesting;

    public Farmer(String name, int strength, int health, int stamina, int speed, int attackPower, boolean running, boolean arrested, boolean plowing, boolean harvesting) {
        super(name, strength, health, stamina, speed, attackPower, running, arrested);
        this.plowing = plowing;
        this.harvesting = harvesting;
    }

    public Farmer() {
        super("Farmer", 75,100,75,10,1,false,false);
        this.plowing = false;
        this.harvesting = false;
    }

    public boolean isPlowing() {
        return plowing;
    }

    public void setPlowing(boolean plowing) {
        this.plowing = plowing;
    }

    public boolean isHarvesting() {
        return harvesting;
    }

    public void setHarvesting(boolean harvesting) {
        this.harvesting = harvesting;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Farmer)) return false;
        if (!super.equals(o)) return false;
        Farmer farmer = (Farmer) o;
        return plowing == farmer.plowing && harvesting == farmer.harvesting;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), plowing, harvesting);
    }

    @Override
    public String toString() {
        return "Farmer{ " +
                " name='" + this.getName() + '\'' +
                ", strength=" + this.getStrength() +
                ", health=" + this.getHealth() +
                ", stamina=" + this.getStamina() +
                ", speed=" + this.getSpeed() +
                ", attackPower=" + this.getAttackPower() +
                ", running=" + this.isRunning() +
                ", arrested=" + this.isArrested() +
                ", plowing=" + plowing +
                ", harvesting=" + harvesting +
                '}';
    }
}
