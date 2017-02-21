package com.acquisio.basic.java.question05;


import java.util.ArrayList;
import java.util.List;

//generic class (any object T that extends Item)
class Inventory<T extends Item> {

	//generic array list (takes any type T that extends item)
    private List<T> items = new ArrayList<>();

    
    //all methods have been modified to return a generic type T that extends item
    public void add(T item) {
        items.add(item);
    }

    public T getFirst() {
        if (items.size() > 0) {
            return items.get(0);
        }
        return null;
    }

    public T getLast() {
        int size = items.size();
        if (size > 0) {
            return items.get(size - 1);
        }
        return null;
    }


    public boolean remove(T item) {
        return items.remove(item);
    }

    public T findFirst(String name) {
        for (T item : items) {
            if (item.getName().equals(name)) {
                return item;
            }
        }
        return null;
    }
}
