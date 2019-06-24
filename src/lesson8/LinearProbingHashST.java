package lesson8;

public class LinearProbingHashST<Key, Value> {
    private int capacity;
    private int size = 0;
    private Key DELETED;
    private Key[] keys;
    private Value[] values;

    public LinearProbingHashST(int capacity, Key DELETED) {
        this.capacity = capacity;
        this.DELETED = DELETED;
        keys = (Key[]) new Object[capacity];
        values = (Value[]) new Object[capacity];
    }

    public void put(Key key, Value value) {
        keyNullException(key);
        int i = hash(key);
        while (keys[i] != null && !keys[i].equals(DELETED)) {
            if (keys[i].equals(key)) {
                values[i] = value;
                return;
            }
            i = (i + 1) % capacity;
        }
        keys[i] = key;
        values[i] = value;
        size++;
    }

    public Value get(Key key) {
        keyNullException(key);
        int i = hash(key);
        int step = 1;
        while (keys[i] != null) {
            if (keys[i].equals(key)) {
                return values[i];
            }
            i = (i + step) % capacity;
        }
        return null;
    }

    public void delete(Key key) {
        keyNullException(key);
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

    private int hash(Key key) {
        return (key.hashCode() & 0x7fffffff) % capacity;
    }

    private void keyNullException(Key key) {
        if (key == null) {
            throw new IllegalArgumentException("null key");
        }
    }

    public int size() {
        return size;
    }

    private boolean isEmpty() {
        return size == 0;
    }

    public boolean contains(Key key) {
        return get(key) != null;//
    }

    @Override
    public String toString() {
        String s = "";
        for (int i = 0; i < capacity; i++) {
            s += keys[i] + " " + values[i] + " ";
        }

        return "LinearProbingHashST{" +
                "keys=" + s +
                '}';
    }
}
