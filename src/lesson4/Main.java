package lesson4;

import java.util.Iterator;

public class Main {
    public static void main(String[] args) {
        MyLinkedList<String> mll = new MyLinkedList<>();

        mll.insertFirst("Katia");
        mll.insertFirst("Petia");
        mll.insertFirst("Sania");
        System.out.println(mll);

        mll.insert(2, "Maria");
        System.out.println(mll);

        System.out.println(mll.delete("Maria"));
        System.out.println(mll);

        System.out.println();
        for (Node node: mll) {
            System.out.println(node.getValue()+", ");
        }

        System.out.println();

        Iterator<Node<String>> iterator = mll.iterator();
        while(iterator.hasNext()){
            System.out.print(iterator.next().getValue()+", ");
            iterator.remove();
        }

        System.out.println();
        System.out.println(mll);






        MyStack<Integer> myStack = new MyStack<>();
        for (int i = 0; i <10 ; i++) {
            myStack.push(i);
        }
        for (int i = 0; i < 10; i++) {
            System.out.print(myStack.pop()+" ");
        }


        System.out.println("\nmyQueue");

        MyQueue<Integer> myQueue = new MyQueue<>();
        for (int i = 0; i <10 ; i++) {
            myQueue.enqueue(i);
        }
        for (int i = 0; i < 10; i++) {
            System.out.print(myQueue.dequeue()+" ");
        }



    }
}
