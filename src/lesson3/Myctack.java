package lesson3;

public class Myctack<Item> {
    private Item[] list;
    private int size = 0;
    private final int DEFAULT_CAPASITY = 10;

    public Myctack(int capasity){
        if (capasity <=0){
            throw new IllegalArgumentException("bad capasity " + capasity);
        }
        list = (Item[]) new  Object[capasity];
    }

    public Myctack(){
        list = (Item[]) new  Object[DEFAULT_CAPASITY];
    }

    public void push(Item item){
        if (isFull()){
            resize(1);
        }
        if (isFull()){
            throw new StackOverflowError("stack full");
        }
        list[size] = item;
        size++;
    }

    public Item pop(){
        Item tmp = peek();
        size--;
        list[size] = null;
        return tmp;
    }


    public Item peek(){
        if (isEmpty()){
            throw new StackOverflowError("stack empty ");
        }
        return list[size-1];
    }

    public int size(){
        return size;
    }

    public boolean isEmpty(){
        return size == 0;
    }

    public boolean isFull(){
        return size == list.length;
    }

    private void resize(int newSize){
        newSize +=size;
        Item[] tmpArr = (Item[]) new  Object[newSize];
        System.arraycopy(list,0,tmpArr,0,list.length);
        list = tmpArr;
    }

}
