package com.company;

public class Burger {
    private String name ;
    private String meat ;
    private double price ;
    private String BreadRoleType;

    private String addName1;
    private double addPrice1;

    private String addName2;
    private double addPrice2;

    private String addName3;
    private double addPrice3;

    private String addName4;
    private double addPrice4;

    public Burger(String name, String meat, double price, String breadRoleType) {
        this.name = name;
        this.meat = meat;
        this.price = price;
        BreadRoleType = breadRoleType;
    }

    public void addBurgerAdd1(String name , double price ){
        this.addName1=name;
        this.addPrice1=price;
    }
    public void addBurgerAdd2(String name , double price ){
        this.addName2=name;
        this.addPrice2=price;
    }
    public void addBurgerAdd3(String name , double price ){
        this.addName3=name;
        this.addPrice3=price;
    }
    public void addBurgerAdd4(String name , double price ){
        this.addName4=name;
        this.addPrice4=price;
    }
    public double itemizeBurger(){
        double burgerPrice= this.price;
        System.out.println(this.name + " Burger with " + this.meat +" Meat On a " +this.BreadRoleType + " Roll is for "+this.price);
        if (this.addName1 != null){
            burgerPrice+= addPrice1;
            System.out.println(this.addName1 + " is added for extra "+this.addPrice1);
        }
        if (this.addName2 != null){
            burgerPrice+= addPrice2;
            System.out.println(this.addName2 + " is added for extra "+this.addPrice2);
        }
        if (this.addName3 != null){
            burgerPrice= addPrice3;
            System.out.println(this.addName3 + " is added for extra "+this.addPrice3);
        }
        if (this.addName4 != null){
            burgerPrice= addPrice4;
            System.out.println(this.addName4 + " is added for extra "+this.addPrice4);
        }
        return burgerPrice;

    }
}
