package f_8August;

import java.sql.Struct;
import java.util.ArrayList;

public class MyHashMap {
    public static void main(String[] args) {
        boolean[] bols = new boolean[1000];
        System.out.println(bols[1]);//默认为false
    }
    int[] list;
    boolean[] jud;
    /** Initialize your data structure here. */
    public MyHashMap() {
        list = new int[1000000];
        jud = new boolean[1000000];
    }

    /** value will always be non-negative. */
    public void put(int key, int value) {
        list[key] = value;
        jud[key] = true;
    }

    /** Returns the value to which the specified key is mapped, or -1 if this map contains no mapping for the key */
    public int get(int key) {
        if(jud[key] == true)return list[key];
        return -1;
    }

    /** Removes the mapping of the specified value key if this map contains a mapping for the key */
    public void remove(int key) {
        jud[key] = false;
        list[key] = -1;
    }
}
