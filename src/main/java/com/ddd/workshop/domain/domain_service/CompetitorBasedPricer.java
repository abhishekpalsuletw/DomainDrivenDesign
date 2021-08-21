package com.ddd.workshop.domain.domain_service;

import com.ddd.workshop.domain.Price;

import java.util.HashMap;

public class CompetitorBasedPricer {
    static HashMap<String, Price> pricesMap = new HashMap<>();

    static {
        pricesMap.put("Bat",new Price(10.0));
        pricesMap.put("Ball",new Price(10.0));
    }

    public CompetitorBasedPricer() {

    }
    public static Price applyDiscount (String competitorPrice, int discount){
        return new Price(pricesMap.get(competitorPrice).getPrice() - (pricesMap.get(competitorPrice).getPrice() * discount/100));
    }
}
