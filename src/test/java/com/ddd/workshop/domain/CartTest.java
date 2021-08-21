package com.ddd.workshop.domain;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class CartTest {

    @Test
    void shouldInitializeAnEmptyCart(){
        Cart c = new Cart(1L);
        assert c.getAllItems().size() == 0;
    }
    @Test
    void shouldAddItemsToCart() {
        Cart c = new Cart(1L);
        c.addItem(new Item(1, new Product("IpadPro")));
        c.addItem(new Item(1, new Product("Hero ink Pen")));
        assert c.getAllItems().size() == 2;
        assert c.getAllItems().get(0).getProduct().getName().equals("IpadPro");
        assert c.getAllItems().get(1).getProduct().getName().equals("Hero ink Pen");
    }
    @Test
    void shouldAdd2GMCricketBatItemsToCart() {
        Cart c = new Cart(1L);
        c.addItem(new Item(2,new Product("GM Cricket bat")));

        assert c.getAllItems().size() == 1;
        assert c.getAllItems().get(0).getProduct().getName().equals("GM Cricket bat");
        assert c.getAllItems().get(0).getQuantity() == 2;
    }

    @Test
    void shouldRemoveIpadProFromCart() {
        Cart c = new Cart(1L);
        c.addItem(new Item(2,new Product("IPadPro")));
        assert c.getAllItems().size() == 1;
        assert c.getAllItems().get(0).getQuantity() == 2;
        c.removeItem(new Item(2,new Product("IPadPro")));
        assert c.getAllItems().size() == 0;
    }

    @Test
    void shouldDifferentiateBetween2Carts(){
        Cart c1 = new Cart(1L);
        c1.addItem(new Item(2,new Product("GM Cricket bat")));
        Cart c2 = new Cart(2L);
        c2.addItem(new Item(2,new Product("GM Cricket bat")));
        Assertions.assertNotEquals(c1, c2);
        Assertions.assertEquals(c1.getAllItems(), c2.getAllItems());
        Assertions.assertEquals(c1.getCardId(), c2.getCardId());
    }



}