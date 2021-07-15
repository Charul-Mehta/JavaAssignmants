package com.company.java.assignment10;

public class SListIterator<E> {
    Link<E> current;

    public SListIterator(Link<E> current) {
        this.current = current;
    }

    boolean hasNext() {
        return current.next != null;
    }

    E next() {
        current = current.next;
        return current.e;
    }

    public void insert(E e) {
        current.next = new Link<E>(e, current.next);
    }

    void remove() {
        current.next = current.next.next;
    }
}
