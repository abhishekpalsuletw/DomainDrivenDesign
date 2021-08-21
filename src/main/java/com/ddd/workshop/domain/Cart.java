package com.ddd.workshop.domain;

import java.util.*;

public class Cart {
    private List<Item> items;
    private UUID cardId;

    private boolean checkedOut;

    public boolean isCheckedOut() {
        return checkedOut;
    }

    public Cart() {
        this.cardId = UUID.randomUUID();
        this.items = new ArrayList<>();
        this.checkedOut = false;
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
    public UUID getCardId() {
        return cardId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Cart cart = (Cart) o;
        return Objects.equals(cardId, cart.cardId);
    }

    public void checkout() {
        this.checkedOut = true;
    }

    @Override
    public int hashCode() {
        return Objects.hash(cardId);
    }
}
