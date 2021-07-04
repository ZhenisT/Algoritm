package lesson5;

public class Knapsack {
    private Item[] items;

    public Knapsack(Item[] items) {
        this.items = items;
    }

    int knapsack(int i, int W) {
        if (i < 0) {
            return 0;
        }
        if (items[i].weight > W) {
            return knapsack(i - 1, W);
        } else {
            return Math.max(knapsack(i - 1, W), knapsack(i - 1, (W - items[i].weight)) + items[i].price);
        }
    }
}
