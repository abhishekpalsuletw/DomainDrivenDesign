package com.ddd.workshop.domain;

public class Pricer {

    public static Price applyDiscount (Price competitor,int discount){
        return new Price(competitor.getPrice() - (competitor.getPrice()*discount/100));
    }
}
