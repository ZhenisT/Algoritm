package lesson4;

import java.util.Iterator;

public class MyLinkedList<Item> implements Iterable<Node<Item>> {
    private Node first;
    private Node last;
    private int size = 0;

    public MyLinkedList() {
        first = null;
        last = null;
    }
    @Override
    public Iterator<Node<Item>> iterator() {
        return new Iter();
    }

    private class Iter implements Iterator<Node<Item>>{
        Node current = new Node(null,first);

        @Override
        public boolean hasNext() {
            return current.getNext() != null;
        }

        @Override
        public Node<Item> next() {
            current = current.getNext();
            return current;
        }

        @Override
        public void remove() {

        }
    }

    public void insertFirst(Item item) {
        Node newNode = new Node(item);
        newNode.setNext(first);
        if (isEmpty()) {
            last = newNode;
        } else {
            first.setPrevious(newNode);
        }
        first = newNode;
        size++;
    }

    public void insertLast(Item item) {
        Node newNode = new Node(item);
        if (isEmpty()) {
            first = newNode;
        } else {
            newNode.setPrevious(last);
            last.setNext(newNode);
        }
        last = newNode;
        size++;
    }

    public Item deleteFirst() {
        if (isEmpty()) {
            return null;
        }
        Node oldFirst = first;
        first = first.getNext();
        if (isEmpty()) {
            last = null;
        } else {
            first.setPrevious(null);
        }
        size--;
        return (Item) oldFirst.getValue();
    }

    public Item deleteLast() {
        if (isEmpty()) {
            return null;
        }
        Node oldLast = last;
        if (last.getPrevious() != null) {
            last.getPrevious().setNext(null);
        } else {
            first = null;
        }
        last = last.getPrevious();
        size--;
        return (Item) oldLast.getValue();
    }

    public boolean isEmpty() {
        return first == null;
    }

    public int size() {
        return size;
    }

    public Item getFirst() {
        if (isEmpty()) {
            return null;
        }
        return (Item) first.getValue();
    }

    public Item getLast() {
        if (isEmpty()) {
            return null;
        }
        return (Item) last.getValue();
    }

    public int indexOf(Item item) {
        Node current = first;
        int index = 0;
        while (current != null) {
            if (item.equals(current.getValue())) {
                return index;
            }
            current = current.getNext();
            index++;
        }
        return -1;
    }

    public boolean contains(Item item) {
        return indexOf(item) > -1;
    }

    public void insert(int index, Item item) {
        if (index <= 0) {
            insertFirst(item);
            return;
        }
        if (index >= size) {
            insertLast(item);
            return;
        }

        Node current = first;
        int i = 0;
        while (i < index - 1) {
            current = current.getNext();
            i++;
        }
        Node newNode = new Node(item);
        newNode.setNext(current.getNext());
        newNode.setPrevious(current);
        newNode.getNext().setPrevious(newNode);
        current.setNext(newNode);
        size++;
    }

    public boolean delete(Item item) {
        if (isEmpty()) {
            return false;
        }
        if (first.getValue().equals(item)) {
            deleteFirst();
            return true;
        }
        Node current = first;
        while (current != null &&
                !current.getValue().equals(item)) {
            current = current.getNext();
        }
        if (current == null) {
            return false;
        }
        if (current == last) {
            deleteLast();
            return true;
        }

        current.getPrevious().setNext(current.getNext());
        current.getNext().setPrevious(current.getPrevious());
        size--;
        return true;

    }

    @Override
    public String toString() {
        Node current = first;
        String s = "";
        while (current != null) {
            s += current.getValue() + " ";
            current = current.getNext();
        }
        return s;
    }
}
