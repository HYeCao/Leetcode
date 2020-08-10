package f_8August;

public class MyHashSet {
    boolean[] jud;
    /** Initialize your data structure here. */
    public MyHashSet() {
        jud = new boolean[1000000];
    }

    public void add(int key) {
        jud[key] = true;
    }

    public void remove(int key) {
        jud[key] = false;
    }

    /** Returns true if this set contains the specified element */
    public boolean contains(int key) {
        return jud[key];
    }
}