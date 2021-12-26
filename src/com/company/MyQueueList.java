package com.company;

import java.util.LinkedList;

public class MyQueueList implements MyQueue {
    private LinkedList<Object> linkedList = new LinkedList<>();

    @Override
    public boolean add(Object o) {
        linkedList.add(o);
        return true;
    }

    @Override
    public boolean offer(Object o) {
        return false;
    }

    @Override
    public Object remove() {
        if (linkedList.size() == 0) {
            throw new IndexOutOfBoundsException("List is empty: ");
        }
        Object removed = linkedList.removeFirst();
        return removed;
    }

    @Override
    public Object pool() {
        if (linkedList.size() != 0) {
             linkedList.removeFirst();
             return linkedList.size();

        } else {
            return null;
        }
    }

    @Override
    public Object element() {
        if (linkedList.size() == 0){
            throw new IndexOutOfBoundsException("List is empty: ");
        }
        return linkedList.getFirst();
    }

    @Override
    public Object peek() {
        return null;
    }

    @Override
    public String toString() {
        return "MyQueueList{" +
                "linkedList=" + linkedList +
                '}';
    }
}
