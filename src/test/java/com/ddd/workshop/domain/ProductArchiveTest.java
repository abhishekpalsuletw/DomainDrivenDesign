package com.ddd.workshop.domain;

import org.junit.jupiter.api.Test;

import java.util.stream.Collectors;

import static org.junit.jupiter.api.Assertions.*;

class ProductArchiveTest {

    @Test
    void shouldShowAllTheRemovedItems() {
        ProductArchive productArchive = new ProductArchive();
        Cart c = new Cart();
        Item item = new Item(1,new Product("IpadPro"));
        Item item2 = new Item(1,new Product("Bat"));
        c.addItem(item);
        c.addItem(item2);
        c.removeItem(item,productArchive);
        c.removeItem(item2,productArchive);
        System.out.println(productArchive.getArchivedItems().stream().map(item1->item1.getProduct().getName()).collect(Collectors.joining(",")));
        assert productArchive.getArchivedItems().size() == 2;
    }
}