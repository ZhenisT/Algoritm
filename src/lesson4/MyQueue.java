package lesson4;

public class MyQueue<Item> {
    private MyLinkedList<Item> queue = new MyLinkedList<>();

    public void enqueue(Item value){
        queue.insertFirst(value);
    }

    public Item dequeue(){
        return queue.deleteLast();
    }

    public Item peek(){
        return queue.getFirst();
    }

    public int size(){
        return queue.size();
    }

    public boolean isEmpty(){
        return queue.isEmpty();
    }
}
