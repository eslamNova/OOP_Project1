package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Burger burger = new Burger("basic","cold",4.35,"brown");
        double price = burger.itemizeBurger();
        burger.addBurgerAdd1("catcheb",.36);
        burger.addBurgerAdd2("cheese",1.5);
        System.out.println("total price :"+burger.itemizeBurger());

        healthyBurger hbur = new healthyBurger("beacon",5.25);
        hbur.addHealthyAdd1("eggs",2.25);
        hbur.addHealthyAdd2("lentils",3.14);

        System.out.println("total price healthy = "+hbur.itemizeBurger());
        deluxe dbur = new deluxe();

        dbur.addBurgerAdd3("test",55);

        System.out.println("total price deluxe is : "+dbur.itemizeBurger());
    }
}
