package com.ddd.workshop.domain;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class CartTest {

    @Test
    void shouldInitializeAnEmptyCart(){
        Cart c = new Cart();
        assert c.getAllItems().size() == 0;
    }
    @Test
    void shouldAddItemsToCart() {
        Price price10 = new Price(10d);
        Price price30 = new Price(30d);
        Cart c = new Cart();
        c.addItem(new Item(1, new Product("IpadPro", price10)));
        c.addItem(new Item(1, new Product("Hero ink Pen", price30)));
        assert c.getAllItems().size() == 2;
        assert c.getAllItems().get(0).getProduct().getName().equals("IpadPro");
        assert c.getAllItems().get(1).getProduct().getName().equals("Hero ink Pen");
    }
    @Test
    void shouldAdd2GMCricketBatItemsToCart() {
        Cart c = new Cart();
        Price price10 = new Price(10d);
        c.addItem(new Item(2,new Product("GM Cricket bat", price10)));

        assert c.getAllItems().size() == 1;
        assert c.getAllItems().get(0).getProduct().getName().equals("GM Cricket bat");
        assert c.getAllItems().get(0).getQuantity() == 2;
    }

    @Test
    void shouldRemoveIpadProFromCart() {
        Price price10 = new Price(10d);
        Cart c = new Cart();
        c.addItem(new Item(2,new Product("IPadPro", price10)));
        assert c.getAllItems().size() == 1;
        assert c.getAllItems().get(0).getQuantity() == 2;
        c.removeItem(new Item(2,new Product("IPadPro", price10)));
        assert c.getAllItems().size() == 0;
    }

    @Test
    void shouldDifferentiateBetween2Carts(){
        Price price10 = new Price(10d);
        Cart c1 = new Cart();
        c1.addItem(new Item(2,new Product("GM Cricket bat", price10)));
        Cart c2 = new Cart();
        c2.addItem(new Item(2,new Product("GM Cricket bat", price10)));
        Assertions.assertNotEquals(c1, c2);
        Assertions.assertEquals(c1.getAllItems(), c2.getAllItems());
        Assertions.assertNotEquals(c1.getCardId(), c2.getCardId());
    }



}