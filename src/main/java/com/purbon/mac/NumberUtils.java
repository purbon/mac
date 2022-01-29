package com.purbon.mac;

public class NumberUtils {

    public static int asInt(int[] a) {
        int r = 0;
        for(int i=a.length-1; i>=0; i--) {
            r += a[i]*(int)Math.pow(10, a.length-1-i);
        }
        return r;
    }

}
