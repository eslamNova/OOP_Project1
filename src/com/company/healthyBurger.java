package com.company;

public class healthyBurger extends Burger {
    private String healthyExtra1Name;
    private double healthyExtra1price;

    private String healthyExtra2Name;
    private double healthyExtra2price;

    public healthyBurger( String meat, double price) {
        super("healthy", meat, price, "brown rye");

    }

    public void addHealthyAdd1(String name , double price){
        this.healthyExtra1Name = name;
        this.healthyExtra1price=price;
    }
    public void addHealthyAdd2(String name , double price){
        this.healthyExtra2Name= name;
        this.healthyExtra2price=price;
    }

    @Override
    public double itemizeBurger() {
       double burgerPrice =super.itemizeBurger();
       if(this.healthyExtra1Name!=null){
           burgerPrice+=this.healthyExtra1price;
           System.out.println("added" + this.healthyExtra1Name + "for an extra "+this.healthyExtra1price);
       }
        if(this.healthyExtra2Name!=null){
            burgerPrice+=this.healthyExtra2price;
            System.out.println("added" + this.healthyExtra2Name + "for an extra "+this.healthyExtra2price);
        }
        return burgerPrice;
    }
}
