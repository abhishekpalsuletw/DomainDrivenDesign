package com.ddd.workshop.domain;

import java.util.List;

public class Order {
    private List<Product> products;

    public Order(List<Product> items) {
        this.products = items;
    }

    public List<Product> getProducts() {
        return products;
    }
}
