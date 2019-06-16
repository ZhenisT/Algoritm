package lesson4;

public class Node<Item> {
    private Item value;
    private Node next;
    private Node previous;

    public Node(Item value) {
        this.value = value;
    }
    public Node(Item value, Node next) {
        this.value = value;
        this.next = next;
    }

    public Node getPrevious() {
        return previous;
    }

    public void setPrevious(Node previous) {
        this.previous = previous;
    }

    public Item getValue() {
        return value;
    }

    public void setValue(Item value) {
        this.value = value;
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }
}
