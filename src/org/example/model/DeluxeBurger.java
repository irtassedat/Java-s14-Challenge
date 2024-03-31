package org.example.model;

import org.example.enums.BreadRollType;
import org.example.enums.DrinkType;

public class DeluxeBurger extends Hamburger {
    private Drink drink;
    private Cips cips;

    public DeluxeBurger(Drink drink, Cips cips) {
        super("DELUXE BURGER", "DOUBLE", 19.10, BreadRollType.DOUBLE_BURGER );
        this.drink = drink;
        this.cips = cips;
    }

    @Override
    public void addAddition(String name, double price) {
        System.out.println("\nDeluxe Burger için yeni malzeme Eklenemez.");
    }

    @Override
    public void itemizeHamburger() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("DRINK: "+ drink.getDrinkType()+ "\n");
        stringBuilder.append("CIPS: "+ cips.getCipsType() + "\n");
        System.out.println(stringBuilder);
        super.itemizeHamburger();
    }
}
