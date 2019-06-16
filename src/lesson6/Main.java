package lesson6;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Random rand = new Random();
        BST<Integer, String> bst = new BST<>();

        bst.put(3, "three");
        bst.put(1, "one");
        bst.put(5, "five");
        bst.put(2, "two");
        bst.put(6, "six");

        System.out.println(bst.balance());

        System.out.println(bst.min() + " left");
        System.out.println(bst.max() + " right");



        int bal = 0;
        int disbal = 0;
        for (int i = 0; i < 20; i++) {
            BST<Integer, Integer> bst1 = new BST<>();

            for (int j = 0; j < 63; j++) {
                int k = rand.nextInt(201) - 100;
                bst1.put(k, k);
            }
            if (bst1.balance()) {
                bal++;
            } else {
                disbal++;
            }

//            System.out.println(bst1);
            System.out.println(bal + " bal");
            System.out.println(disbal + " disbal");
        }





    }
}
