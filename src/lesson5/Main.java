package lesson5;

public class Main {
    public static void main(String[] args) {

        System.out.println(power(5, 1));


        Item[] item = {new Item(3, 5),
                new Item(5, 10),
                new Item(4, 6),
                new Item(3, 5)};

        Knapsack knapsack = new Knapsack(item);
        int W = 14;


        System.out.println(knapsack.knapsack(item.length - 1, W));

    }


    static int power(int x, int n) {
        if (n == 1) return x;
        if (n == 0) return 1;
        return power(x, n - 1) * x;
    }


}
