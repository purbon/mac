package com.purbon.mac;

public class Multiplication {

    public Multiplication() {

    }

    public long times(int[] a, int[] b) {
        long total = 0;
        int order = 0;
        for(int i=b.length-1; i>=0; i--) {
            long mVal = 0;
            int carry = 0;
            for(int j=a.length-1; j>=0; j--) {
                int op = b[i] * a[j] + carry;
                mVal  += (op % 10)*(long) Math.pow(10, a.length-1-j);
                carry  = op / 10;
            }
            mVal *= (int) Math.pow(10, order);
            if (carry != 0) {
                mVal += (carry * (long) Math.pow(10, a.length+order));
            }
            total += mVal;
            order += 1;
        }
        return total;
    }
}
