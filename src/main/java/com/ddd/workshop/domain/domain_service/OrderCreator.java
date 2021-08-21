package com.ddd.workshop.domain.domain_service;

import com.ddd.workshop.domain.Cart;
import com.ddd.workshop.domain.Item;
import com.ddd.workshop.domain.Order;

import java.util.stream.Collectors;

public class OrderCreator {

    public static Order createOrder(Cart cart){
        Order order = new Order(cart.getAllItems().stream().map(Item::getProduct).collect(Collectors.toList()));
        cart.checkout();
        return order;
    }
}
