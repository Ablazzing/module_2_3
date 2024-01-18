package com.javaacademy.lessons.homework.homework1.ex3;

import java.util.ArrayList;
import java.util.List;

public class Storage {
    private ArrayList<Item> items = new ArrayList<>();

    public void addItems(List<Item> itemsList) {
        items.addAll(itemsList);
    }

    public void getAllItem() {
        for (int i = 0; i < items.size(); i++) {
            if (i % 2 == 0) {
                System.out.println(items.get(i));
            }
        }
    }

    public Item getItemIndex(int index) throws Exception {
        if (index < items.size()) {
            Item itemIndex = items.get(index);
            items.remove(itemIndex);
            return itemIndex;
        } else if (index > items.size()) {
                throw new Exception();
            }
            return null;
    }

    public void removeAllItem() {
        if (items.size() > 1) {
            items.subList(0, items.size() - 1).clear();
        }
    }

    @Override
    public String toString() {
        return "Storage{" +
                "items=" + items +
                '}';
    }
}
