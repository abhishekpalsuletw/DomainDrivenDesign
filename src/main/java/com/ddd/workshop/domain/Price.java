package com.ddd.workshop.domain;

import java.util.Currency;
import java.util.Objects;

public class Price {
    private Currency currency;
    private Double price;

    public Price(Currency currency, Double price) {
        this.currency = currency;
        this.price = price;
    }

    public Price(Double price) {
        this.currency = Currency.getInstance("INR");
        this.price = price;
    }

    public Currency getCurrency() {
        return currency;
    }

    public Double getPrice() {
        return price;
    }



}
