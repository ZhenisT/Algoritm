package lesson3;

public class MyQueue<Item> {
    private Item[] list;
    private int size = 0;
    private final int DEFAULT_CAPASITY = 10;
    private int begin = 0;
    private int end = 0;


    public MyQueue(int capasity) {
        if (capasity <=0){
            throw new IllegalArgumentException("bad capasity " + capasity);
        }
        list = (Item[]) new Object[capasity];
    }

    public MyQueue() {
        list = (Item[]) new Object[DEFAULT_CAPASITY];
    }

    public void insert(Item item) {
        if (isFull()){
            resize(1);

        }
        if (isFull()) {
            throw new StackOverflowError("stack full");
        }
        size++;
        list[end] = item;
        end = nextIndex(end);
    }

    public Item remove() {
        Item value = peek();
        size--;
        list[begin] = null;
        begin = nextIndex(begin);
        return value;
    }


    public Item peek() {
        if (isEmpty()) {
            throw new StackOverflowError("stack empty ");
        }
        return list[begin];
    }

    public int size() {
        return size;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public boolean isFull() {
        return size == list.length;
    }

    private void resize(int newSize) {
        newSize += size;
        Item[] tmpArr = (Item[]) new Object[newSize];
        System.arraycopy(list, 0, tmpArr, 0, list.length);

        list = tmpArr;
    }

    private int nextIndex(int index) {
        return (index + 1) % list.length;
    }

    @Override
    public String toString() {
        String s = "";
        for (int i = 0; i < list.length; i++) {
            s += list[i] + " ";
        }
        return s;
    }
}
