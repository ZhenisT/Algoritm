package lesson4;

public class MyStack<Item> {
    private MyLinkedList<Item> stack = new MyLinkedList<>();

    public void push(Item value){
        stack.insertFirst(value);
    }

    public Item pop(){
        return stack.deleteFirst();
    }

    public Item peek(){
        return stack.getFirst();
    }

    public int size(){
        return stack.size();
    }

    public boolean isEmpty(){
        return stack.isEmpty();
    }
}
