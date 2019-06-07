package lesson3;

public class MyDeq<Item> {
    private Item[] list;
    private int size = 0;
    private final int DEFAULT_CAPASITY = 10;
    private int begin = 0;
    private int end = 0;

    public MyDeq(int capasity) {
        if (capasity <=0){
            throw new IllegalArgumentException("bad capasity " + capasity);
        }
        list = (Item[]) new Object[capasity];
    }

    public MyDeq() {
        list = (Item[]) new Object[DEFAULT_CAPASITY];
    }

    public void insertRight(Item item) {
        if (isFull()) {
            throw new StackOverflowError("stack full");
        }

            list[end] = item;
        end = nextIndex(end);
            size++;


    }

    public void insertLeft(Item item) {
        if (isFull()) {
            throw new StackOverflowError("stack full");
        }



        for (int i = list.length-1; i >0 ; i--) {
            list[i]=list[i-1];
        }
        end = nextIndex(end);
            list[begin] = item;
            size++;
    }

    public void removeRight() {
        size--;
        list[begin] = null;
        begin = nextIndex(begin);

    }

    public void removeLeft() {
        size--;
        list[--end] = null;


    }


    public Item peek(int pos) {
        if (isEmpty()) {
            throw new StackOverflowError("stack empty ");
        }
        return list[pos];
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
