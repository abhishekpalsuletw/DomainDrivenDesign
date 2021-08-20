package com.ddd.workshop.domain;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Cart {
    private List<Item> items;

    public Cart() {
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


}
