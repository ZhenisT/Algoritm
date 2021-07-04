package lesson3;

import java.util.Deque;

public class Main {
    public static void main(String[] args) {
        Myctack<Integer> myctack = new Myctack(8);
        myctack.push(1);
        myctack.push(2);
        myctack.push(3);
        myctack.push(4);
        myctack.push(5);
        myctack.push(6);
        myctack.push(7);
        myctack.push(8);
        myctack.push(9);

        for (int i = 0; i < 9; i++) {
            System.out.print(myctack.pop()+" ");
        }
//
//
//
        System.out.println();
//        String str = "!роза ,рим";
//        System.out.println("Печатаем стоку " + str + " в обратном порядке");
//
//        Myctack<Character> strundo = new Myctack<>(str.length());
//        for (int i = 0; i < str.length(); i++) {
//            strundo.push(str.charAt(i));
//        }
//        for (int i = 0; i < str.length(); i++) {
//            System.out.print(strundo.pop());
//        }

//        MyQueue<Integer> myQueue = new MyQueue<>(5);
//        myQueue.insert(1);
//        myQueue.insert(2);
//        myQueue.insert(3);
//        System.out.println(myQueue);
//
//        System.out.println(myQueue.remove());
//        System.out.println(myQueue.remove());
//        System.out.println(myQueue);
//
//        myQueue.insert(11);
//        myQueue.insert(12);
//        myQueue.insert(13);
//
//        System.out.println(myQueue);

        MyDeq myDeq = new MyDeq(10);
        myDeq.insertRight(1);
        myDeq.insertRight(2);

        myDeq.insertRight(3);
        System.out.println(myDeq);
        myDeq.insertLeft(5);
        myDeq.insertLeft(4);
        System.out.println(myDeq);
        myDeq.insertRight(6);
        System.out.println(myDeq);
        myDeq.removeRight();
        myDeq.removeRight();
        myDeq.removeLeft();
        myDeq.insertLeft(4);
        myDeq.insertLeft(10);
        myDeq.insertLeft(5);
        System.out.println(myDeq);
        myDeq.insertRight(14);


        System.out.println(myDeq);


    }

}
