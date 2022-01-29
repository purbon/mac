package com.purbon.mac;

import static com.purbon.mac.NumberUtils.asLong;

public class Multiplication {

    public Multiplication() {

    }

    public long times(int[] a, int[] b) {
        long total = 0;
        for(int i=b.length-1; i>=0; i--) {
            long mVal = 0;
            int carry = 0;
            for(int j=a.length-1; j>=0; j--) {
                int op = b[i] * a[j] + carry;
                mVal  += (op % 10)*(long) Math.pow(10, a.length-1-j);
                carry  = op / 10;
            }
            mVal *= (long) Math.pow(10, b.length-1-i);
            if (carry != 0) {
                mVal += (carry * (long) Math.pow(10, a.length+b.length-1-i));
            }
            total += mVal;
        }
        return total;
    }

    public long times2(int[] a, int[] b) {
        int[] total = new int[a.length+b.length];
        for(int i=b.length-1; i>=0; i--) {
            int carry = 0;
            for(int j=a.length-1; j>=0; j--) {
                total[ i + j + 1] += a[j] * b[i] + carry;
                carry = total[ i + j + 1 ] / 10;
                total[ i + j + 1] = total[i + j + 1] % 10;
            }
            total[ i ] = carry;
        }
        return asLong(total);
    }
}
