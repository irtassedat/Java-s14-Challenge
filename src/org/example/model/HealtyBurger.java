package org.example.model;

import org.example.enums.BreadRollType;

public class HealtyBurger extends Hamburger {
    private Addition healtyAddition1;
    private Addition healtyAddition2;

    public HealtyBurger(String name, double price, BreadRollType breadRollType) {
        super(name, "Tofu", price, breadRollType);
    }

    public Addition getHealtyAddition1() {
        return healtyAddition1;
    }

    public Addition getHealtyAddition2() {
        return healtyAddition2;
    }

    @Override
    public void addAddition(String name, double price) {
        if(healtyAddition1 == null) {
            healtyAddition1 = new Addition(name, price);
        }
        else if(healtyAddition2 == null) {
            healtyAddition2 = new Addition(name,price);
        }
        else {
            System.out.println("ekstra malzeme 2 taneden fazla eklenemez!");
        }
    }

    @Override
    public void itemizeHamburger() {
        StringBuilder healthyBurgerStringBuilder = new StringBuilder();
        if(healtyAddition1 == null) {
            healthyBurgerStringBuilder.append("HealtyAddition1: "+getHealtyAddition1().getName() + "\n");
            setPrice(getPrice()+getHealtyAddition1().getPrice());
        }

        if(healtyAddition2 == null) {
            healthyBurgerStringBuilder.append("HealtyAddition1: "+getHealtyAddition1().getName() + "\n");
            setPrice(getPrice()+getHealtyAddition1().getPrice());
        }
        System.out.println(healthyBurgerStringBuilder);
        super.itemizeHamburger();
    }
}
