package lesson4;

import java.util.Iterator;
import java.util.ListIterator;

public class Main {
    public static void main(String[] args) {
        MyLinkedList<String> mll = new MyLinkedList<>();

        mll.insertFirst("Katia");
        mll.insertFirst("Petia");
        mll.insertFirst("Sania");

//        for (String node: mll) {
//            System.out.println(node +", ");
//        }

        System.out.println();

//        Iterator<String> iterator = mll.iterator();
//        while(iterator.hasNext()){
//            System.out.print(iterator.next()+", ");
//
//        }

        ListIterator<String> listIterator = mll.listIter();
        while(listIterator.hasNext()){
            System.out.print(listIterator.next()+", ");

        }

        System.out.println(listIterator.previous());

//        System.out.println();
//        System.out.println(mll);





    }
}
