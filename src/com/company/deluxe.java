package com.company;

public class deluxe extends Burger {
    public deluxe() {
        super("deluxe", "sausage", 14.3, "white");
        super.addBurgerAdd1("chips",3);
        super.addBurgerAdd2("cola",7);
    }

    @Override
    public void addBurgerAdd1(String name, double price) {
        System.out.println("cannot add adds to deluxe");
    }

    @Override
    public void addBurgerAdd2(String name, double price) {
        System.out.println("cannot add adds to deluxe");
    }

    @Override
    public void addBurgerAdd3(String name, double price) {
        System.out.println("cannot add adds to deluxe");
    }

    @Override
    public void addBurgerAdd4(String name, double price) {
        System.out.println("cannot add adds to deluxe");
    }
}
