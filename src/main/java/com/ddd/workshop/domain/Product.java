package com.ddd.workshop.domain;

import java.util.Currency;
import java.util.Objects;

public class Product {
    private String name;

    private Double price;
    private Currency currency;

    public String getName() {
        return name;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Currency getCurrency() {
        return currency;
    }

    public void setCurrency(Currency currency) {
        this.currency = currency;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Product product = (Product) o;
        return Objects.equals(name, product.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }

    public Product(String name, Currency curr, Double price) {
        this.name = name;
        this.currency = curr;
        this.price = price;
    }

    public Product(String name, Double price) {
        this.name = name;
        this.currency = Currency.getInstance("INR");
        this.price = price;
    }
}
