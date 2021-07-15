package com.company.java.assignment10;

public class SList<E>
{
    public Link<E> getLink() {
        return link;
    }

    Link<E> link=new Link<E>(null);

    @Override
    public String toString() {
        if (link.next == null) {
            return "[]";
        }
        StringBuilder sb = new StringBuilder("[");
        SListIterator it = new SListIterator(getLink());
        while (it.hasNext()) {
            sb.append(it.next());
            sb.append(", ");
        }
        return sb.delete(sb.length() - 2, sb.length()).append("]").toString();
    }

    public SListIterator iterator(Link<String> link){
        return new SListIterator(getLink());
    }

}
