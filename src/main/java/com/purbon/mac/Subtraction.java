package com.purbon.mac;

public class Subtraction {

    public Subtraction() {

    }

    public static int minus(int[] a, int[] b) {

        if (a.length != b.length) {
            throw new IllegalArgumentException("A should be of same length than B");
        }
        int result = 0;
        int carry = 0;

        for(int i=a.length-1; i >= 0; i--)  {
            int diff = 0;
            if (a[i] <= b[i]) {
                diff = (a[i]+10)-b[i]+carry;
                carry = -1;
            } else {
                diff = a[i]-b[i]+carry;
                carry = 0;
            }
            result += diff * (int)Math.pow(10, a.length-1-i);
        }
        return result;
    }
}
