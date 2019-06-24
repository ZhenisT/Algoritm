package lesson8;

public class Main {
    public static void main(String[] args) {
        ChainingHashST<Integer,String> chhs = new ChainingHashST<>(19, -1);
//
        chhs.put(0,"Один");
        chhs.put(2,"Два");
        chhs.put(3,"Три");
        chhs.put(4,"Четыре");
        chhs.put(5,"Пять");
        chhs.put(6,"Три");
        chhs.put(7,"Два");
        chhs.put(8,"Two");
        chhs.put(9,"Two");
        chhs.put(17,"Two");
//
//        for (int i = 0; i < 90; i++) {
//            chhs.put(i," Цифра "+i+"  ");
//        }
//
////        for (int i = 0; i < 99; i++) {
////            chhs.put((int)(Math.random()*1000),"Цифра");
////        }
        System.out.println(chhs);
//        chhs.delete(1);
//        System.out.println(chhs.get(48));
//        chhs.put(1," new    ");
        System.out.println(chhs.get(1));

//        LinearProbingHashST<Integer, String> lpst = new LinearProbingHashST<>(97,-1);
//        for (int i = 0; i < 90; i++) {
//            lpst.put(i,"Цифра "+i);
//        }
//        for (int i = 0; i < 90; i++) {
//            lpst.put((int)(Math.random()*1000),"Цифра");
//        }

//        lpst.put(1,"One");
//        lpst.put(2,"Two");
//        lpst.put(6,"Five");
//        lpst.put(3,"Three");
//        lpst.put(4,"Four");
//
//
//        System.out.println(lpst);
//        lpst.put(6,"Seven");
//lpst.delete(2);
//        System.out.println(lpst);
//        lpst.put(2,"del");
//        System.out.println(lpst.get(2));

    }
}
