package com.company;

public interface MyQueue<E> {
    boolean add(Object o);

    boolean offer(Object o);

    Object remove();

    Object pool();

    Object element();

    Object peek();
}
