package com.ddd.workshop.domain;

import java.util.HashMap;
import java.util.Map;

public class CompetitorPrice {

    private Map<String, Price> pricesMap;

    public CompetitorPrice() {
        this.pricesMap = new HashMap<>();
        pricesMap.put("Bat",new Price(10.0));
        pricesMap.put("Ball",new Price(10.0));
    }
    public Price getPrice(String product){
        return this.pricesMap.get(product);
    }
}
