package com.purbon.mac;

public class NumberUtils {

    public static int asInt(int[] a) {
        int r = 0;
        for(int i=a.length-1; i>=0; i--) {
            r += a[i]*(int)Math.pow(10, a.length-1-i);
        }
        return r;
    }

    public static int[] asIntArray(int a) {
        int size = (int)Math.log10(a)+1;
        int[] r = new int[size];
        for(int i=1; i <= size; i++) {
            r[size-i] = a % 10;
            a = a / 10;
        }
        return r;
    };

}
