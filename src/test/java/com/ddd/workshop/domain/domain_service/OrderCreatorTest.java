package com.ddd.workshop.domain.domain_service;

import com.ddd.workshop.domain.*;
import org.junit.jupiter.api.Test;

class OrderCreatorTest {

    @Test
    void shouldCreateOrder(){
        Cart c = new Cart();
        c.addItem(new Item(1,new Product("Bat",new Price(30.0))));
        Order order = OrderCreator.createOrder(c);
        assert c.isCheckedOut();
        assert order.getProducts().size() == 1;
    }

}