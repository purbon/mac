package com.purbon.mac.utils;

public class Tuple<K, V> {
    K left;
    V right;

    public Tuple(K left, V right) {
        this.left = left;
        this.right = right;
    }

    public K getLeft() {
        return left;
    }

    public V getRight() {
        return right;
    }
}
