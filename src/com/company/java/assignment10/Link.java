package com.company.java.assignment10;

public class Link<E> {
    E e;
    Link<E> next;

    Link(E e) {
        this(e, null);
    }

    Link(E e, Link<E> next) {
        this.e = e;
        this.next = next;
    }

    @Override
    public String toString() {
        if (e == null) {
            return "null";
        } else {
            return e.toString();
        }
    }

}
