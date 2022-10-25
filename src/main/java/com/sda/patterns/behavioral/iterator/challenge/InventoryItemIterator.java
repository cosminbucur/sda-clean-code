package com.sda.patterns.behavioral.iterator.challenge;

import java.util.List;
import java.util.stream.Collectors;

public class InventoryItemIterator implements ItemIterator<Item> {

    private List<Item> items;

    int index;

    public InventoryItemIterator(Inventory inventory, ItemType itemType) {
        items = inventory.getItems().stream()
                .filter(item -> item.getType().equals(itemType))
                .collect(Collectors.toList());
    }

    @Override
    public boolean hasNext() {
        if (index < items.size()) {
            return true;
        }
        return false;
    }

    @Override
    public Item next() {
        if (hasNext()) {
            return items.get(index++);
        }
        return null;
    }
}
