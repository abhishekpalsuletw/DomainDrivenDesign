package com.ddd.workshop.domain;

import java.util.*;

public class Cart {
    private List<Item> items;
    private Long cardId;

    public Cart(long id) {
        this.cardId = id;
        this.items = new ArrayList<>();
    }
    public void addItem(Item item){
        this.items.add(item);
    }
    public List<Item> getAllItems(){
        return Collections.unmodifiableList(items);
    }

    public void removeItem(Item item) {
        items.remove(item);
    }
    public void removeItem(Item item,ProductArchive productArchive) {
        productArchive.archiveItem(item);
        items.remove(item);
    }

    public Long getCardId() {
        return cardId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Cart cart = (Cart) o;
        return Objects.equals(cardId, cart.cardId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(cardId);
    }
}
