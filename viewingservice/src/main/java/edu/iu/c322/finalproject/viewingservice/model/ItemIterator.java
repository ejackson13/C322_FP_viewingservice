package edu.iu.c322.finalproject.viewingservice.model;

import java.util.Iterator;
import java.util.List;

public class ItemIterator implements Iterator {

    List<SellerItem> items;
    int position;

    public ItemIterator(List<SellerItem> items) {
        this.items = items;
        position = 0;
    }

    @Override
    public boolean hasNext() {
        return position < items.size();
    }

    @Override
    public Object next() {
        return items.get(position++);
    }
}
