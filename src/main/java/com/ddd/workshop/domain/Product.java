package com.ddd.workshop.domain;

import java.util.Currency;
import java.util.Objects;

public class Product {
    private String name;
    private Price price;

    public Product(String name, Currency curr, Price price) {
        this.name = name;
        this.price = price;
    }

    public Product(String name, Price price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public Price getPrice() {
        return price;
    }

    public void setPrice(Price price) {
        this.price = price;
    }

    public static Price getDiscountedPrice(Price price,int discount){
        return new Price(price.getPrice() - (price.get*discount/100));
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


}
