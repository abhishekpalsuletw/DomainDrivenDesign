package com.ddd.workshop.domain;

import java.util.Objects;

public class Item {
    private int quantity;
    private Product product;

    public Item(int quantity, Product product) {
        this.quantity = quantity;
        this.product = product;
    }

    public int getQuantity() {
        return quantity;
    }

    public Product getProduct() {
        return product;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Item item = (Item) o;
        return quantity == item.quantity && Objects.equals(product, item.product);
    }

    @Override
    public int hashCode() {
        return Objects.hash(quantity, product);
    }
}
