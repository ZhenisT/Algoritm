package lesson2;

import java.util.Random;

public class Main {


    public static void main(String[] args) {

        Random random =new Random();

        int n = 1000;
        MyArrayList<Integer> mal = new MyArrayList<>(n);


        for (int i = 0; i < n; i++) {
            mal.add(random.nextInt(10));
        }

        System.out.println(mal);
        double timeBegin = System.nanoTime();
        mal.selectionSort();
        double endtime = System.nanoTime();
        System.out.println(mal);
        System.out.println("Отсортированно за " + (endtime - timeBegin));

        System.out.println("Массив mal1: ");
        System.out.println();


        MyArrayList<Integer> mal1 = new MyArrayList<>(1000000);
        mal1.add(100);
        mal1.add(30);
        mal1.add(5);
        mal1.add(190);


        System.out.println(mal1);
        mal1.add(1,55);
        System.out.println("Добавлен элемент "+mal1);

        mal1.find(55);
        System.out.println("Найден элемент "+mal1);

        mal1.delete(55);
        System.out.println("Удален элемент "+mal1);










    }


}
