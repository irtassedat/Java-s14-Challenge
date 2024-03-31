package org.example;

import org.example.enums.BreadRollType;
import org.example.enums.CipsType;
import org.example.enums.DrinkType;
import org.example.model.*;

public class Main {
    public static void main(String[] args) {
        Hamburger hamburger = new Hamburger("Basic", "Normal", 3.56, BreadRollType.WRAP);

        hamburger.addAddition("Tomato", 0.27);

        hamburger.addAddition("Lettuce", 0.75);

        hamburger.addAddition("Cheese", 1.13);

        hamburger.itemizeHamburger();

        HealtyBurger healthyBurger = new HealtyBurger("Vegan Burger", 5.67, BreadRollType.SANDWICH);

        healthyBurger.addAddition("Egg", 5.43);

        healthyBurger.addAddition("Lentils", 3.41);

        healthyBurger.itemizeHamburger();

        DeluxeBurger db = new DeluxeBurger(new Drink(DrinkType.FANTA) , new Cips(CipsType.CURLY));

        db.addAddition("Should not do this", 50.53);

        db.itemizeHamburger();
    }
}