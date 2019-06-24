package lesson8;

import java.util.LinkedList;

public class ChainingHashST<Key, Value> {
    private int capacity;
    private int size = 0;

    private Key DELETED;

    private LinkedList<Node>[] st;

    public ChainingHashST(int capacity, Key DELETED) {
        this.capacity = capacity;
        this.DELETED = DELETED;
        st = new LinkedList[capacity];
        for (int i = 0; i < st.length; i++) {
            st[i] = new LinkedList<>();
        }
    }

    private class Node{
        private Key key;
        private Value value;

        public Node(Key key, Value value) {
            this.key = key;
            this.value = value;
        }
    }



    public void put(Key key, Value value){
        if (key == null){
            throw new IllegalArgumentException("null key");
        }
        int i = hash(key);

        for (Node node:st[i]) {
            if (key.equals(node.key)){
                node.value = value;
                return;
            }
            if (node.key.equals(DELETED)){
                node.key = key;
                node.value = value;
                return;
            }
        }
        st[i].addLast(new Node(key,value));
        size++;
    }

    public void delete(Key key){
        if (key == null) {
            throw new IllegalArgumentException("null key");
        }
        int i = hash(key);
        for (Node node:st[i]) {
            if (key.equals(node.key)){
                node.key = DELETED;
//                node.value = null;
                size--;
                return;
            }
        }

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

    public int hash(Key key){
//        return (key.hashCode() & 0x7fffffff) % capacity;
        return (capacity-1)-(key.hashCode() & 0x7fffffff) % (capacity-1) ;
    }

    public Value get(Key key){
        if (key == null){
            throw new IllegalArgumentException("null key");
        }
        int i = hash(key);
        for (Node node:st[i]) {
            if(node.key.equals(key)){
                return node.value;
            }
        }
        return null;
    }
   

    @Override
    public String toString() {
        String s="";
        for (int i = 0; i <capacity ; i++) {
            for (Node node:st[i]) {
                s+=node.key +" "+node.value;
            }
            s+="\n";
        }

        return "ChainingHashST{\n" +
                s +
                '}';
    }
}
