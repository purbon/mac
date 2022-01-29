package com.purbon.mac;

public class Tuple<K, V> {
    K left;
    V right;

    public Tuple(K left, V right) {
        this.left = left;
        this.right = right;
    }
}
