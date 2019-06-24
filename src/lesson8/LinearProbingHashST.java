package lesson8;

public class LinearProbingHashST<Key, Value> {
    private int capacity;
    private int size = 0;

    private Key DELETED;

    private Key[] keys;
    private Value[] values;

    public LinearProbingHashST(int capacity,Key DELETED) {
        this.capacity = capacity;
        this.DELETED = DELETED;
        keys = (Key[])new Object[capacity];
        values =(Value[]) new Object[capacity];
    }

    public int size() {
        return size;
    }

    public boolean isEmpty(){
        return size == 0;
    }

    public boolean contains(Key key){
        return get(key) != null;//
    }

    private int hash(Key key){
        return (key.hashCode() & 0x7fffffff) % capacity;
    }

    public void put(Key key, Value value) {
        if (key == null) {
            throw new IllegalArgumentException("null key");
        }
        int i = hash(key);
        while(keys[i] !=null && !keys[i].equals(DELETED)){
            if(keys[i].equals(key)){
                values[i] = value;
                return;
            }
            i =(i + 1) % capacity;
        }
        keys[i] = key;
        values[i] = value;
        size++;
    }

    public Value get(Key key) {
        if (key == null) {
            throw new IllegalArgumentException("null key");
        }
        int i = hash(key);
//        int step = 5 - (key.hashCode() & 0x7fffffff) % 5 ;
        int step = 1;
        while (keys[i] != null) {
            if (keys[i].equals(key)) {
                return values[i];
            }
            i = (i + step) % capacity;
        }
        return null;
    }

    public void delete(Key key){
        if (key == null) {
            throw new IllegalArgumentException("null key");
        }
        int i = hash(key);
        int step = 1;
        while (keys[i] != null) {
            if (keys[i].equals(key)) {
                keys[i] = DELETED;
                size--;
                return;
            }
            i = (i + step) % capacity;
        }

    }

    @Override
    public String toString() {
        String s="";
        for (int i = 0; i <capacity ; i++) {
            s+= keys[i]+" " + values[i]+" ";
        }

        return "LinearProbingHashST{" +
                "keys=" + s +
                '}';
    }
}
