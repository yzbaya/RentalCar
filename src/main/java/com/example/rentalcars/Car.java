package com.example.rentalcars;

public class Car {
    private String name;
    private String info1;
    private String info2;
    private int prix;

    public Car(String name, String info1, String info2,int prix) {
        this.name = name;
        this.info1 = info1;
        this.info2 = info2;
        this.prix = prix;
    }

    public String getName() {
        return name;
    }

    public String getInfo1() {
        return info1;
    }
    public String getInfo2() {
        return info2;
    }
    public int getPrix() {
        return prix;
    }
}
