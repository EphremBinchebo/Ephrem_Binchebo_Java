package com.company;

public class App {
    public static void main(String[] args) {
        Farmer farmerCharacter = new Farmer();
        Constable constableCharacter = new Constable();
        Warrior warriorCharacter = new Warrior();


        //Implementing equals method
        Farmer farmerCharacter1 = new Farmer("Farmer", 75,100,75,10,1,false,false,false,false);
        Farmer farmerCharacter2 = new Farmer("Farmer", 75,100,75,10,1,false,false,false,false);
        Farmer farmerCharacter3 = new Farmer("Farmer", 75,100,75,10,1,true,false,false,false);
        boolean isEquals = farmerCharacter1.equals(farmerCharacter2);
        System.out.println(isEquals); //true
        isEquals = farmerCharacter2.equals(farmerCharacter3);
        System.out.println(isEquals); //false

        //Implementing attack method
        farmerCharacter.setAttackPower(7);
        constableCharacter.setAttackPower(5);
        System.out.println("Health: " + constableCharacter.getHealth());
        farmerCharacter.attack(constableCharacter);
        System.out.println("Health: " + constableCharacter.getHealth());
        System.out.println();
        System.out.println("Health: " + warriorCharacter.getHealth());
        farmerCharacter.attack(warriorCharacter);
        System.out.println("Health: " + warriorCharacter.getHealth());
        System.out.println();
        System.out.println("Health: " + farmerCharacter.getHealth());
        warriorCharacter.attack(farmerCharacter);
        System.out.println("Health: " + farmerCharacter.getHealth());
        System.out.println();
        System.out.println("Health: " + constableCharacter.getHealth());
        warriorCharacter.attack(constableCharacter);
        System.out.println("Health: " + constableCharacter.getHealth());
        System.out.println();

        System.out.println("Health: " + farmerCharacter.getHealth());
        constableCharacter.attack(farmerCharacter);
        System.out.println("Health: " + farmerCharacter.getHealth());
        System.out.println();
        System.out.println("Health: " + warriorCharacter.getHealth());
        constableCharacter.attack(warriorCharacter);
        System.out.println("Health: " + warriorCharacter.getHealth());
        System.out.println();

        // Implementing arrest method
        farmerCharacter.setRunning(true);
        constableCharacter.setRunning(true);
        constableCharacter.setSpeed(100);
        farmerCharacter.setSpeed(200);
        System.out.println(farmerCharacter.isArrested()); // false
        constableCharacter.arrest(farmerCharacter);
        System.out.println(farmerCharacter.isArrested());

        constableCharacter.setSpeed(200);
        farmerCharacter.setSpeed(150);
        System.out.println(farmerCharacter.isArrested()); // false
        constableCharacter.arrest(farmerCharacter);
        System.out.println(farmerCharacter.isArrested());
        System.out.println();
        constableCharacter.setSpeed(150);
        constableCharacter.setRunning(false);
        constableCharacter.arrest(warriorCharacter);

        //Implement toString method
        System.out.println(farmerCharacter.toString());
        System.out.println(warriorCharacter.toString());
        System.out.println(constableCharacter.toString());




//        Warrior warrior = new Warrior();
//        Constable constable = new Constable();
//        farmerCharacter.setAttackPower(10);
//        System.out.println(constable.getHealth());
//        farmerCharacter.attack(constable);
//        System.out.println(constable.getHealth());
//
//        //farm and constable equal
//        farmerCharacter.setAttackPower(8);
//        constable.setAttackPower(10);
//        System.out.println(constable.getHealth());
//        farmerCharacter.attack(constable);
//        System.out.println(constable.getHealth());
//        //farm attack power less than constable
//        farmerCharacter.setAttackPower(0);
//        constable.setAttackPower(15);
//        System.out.println(constable.getHealth());
//        farmerCharacter.attack(constable);
//        System.out.println(constable.getHealth());
    }
}
