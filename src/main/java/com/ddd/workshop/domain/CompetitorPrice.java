package com.ddd.workshop.domain;

import java.util.HashMap;
import java.util.Map;

public class CompetitorPrice {

    private Map<String, Price> pricesMap = new HashMap<>();

    public void addPrice(String productName, Price price){
        this.pricesMap.put(productName, price);
    }
}
