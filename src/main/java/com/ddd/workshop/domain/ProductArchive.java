package com.ddd.workshop.domain;

import java.util.ArrayList;
import java.util.List;

public class ProductArchive {
    private List<Item> archivedItems;

    public ProductArchive() {
        archivedItems = new ArrayList<>();
    }

    public void archiveItem(Item item){
        archivedItems.add(item);
    }

    public List<Item> getArchivedItems() {
        return archivedItems;
    }
}
