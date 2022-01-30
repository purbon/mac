package com.purbon.mac;

import com.purbon.mac.utils.Tuple;

import java.util.BitSet;

public class Division {

    public Division() {

    }

    public int slow(int a, int b) {
        int r = a;
        int q = 0;
        while (r >= b) {
            r = r - b;
            q += 1;
        }
        return q;
    }

    public Tuple<Integer, Integer> div(int n, int d) {
        if (d < 0) {
            var t = div(n, -d);
            return new Tuple<>(-1 * t.getLeft(), t.getRight());
        }
        if (n < 0) {
            var t = div(-n, d);
            if (t.getRight() == 0) {
                return new Tuple<>(t.getLeft(), 0);
            } else {
                return new Tuple<>(-1 * t.getLeft() -1, d - t.getRight());
            }
        }
        int q = 0; int r = n;
        while (r >= d) {
            q += 1;
            r -= d;
        }
        return new Tuple<>(q, r);
    }

    public Tuple<Integer, Integer> nonRestoring(int n, int d) {
        int r = n;
        d = d << 32;
        BitSet bs = new BitSet(32);
        for( int i=32-1; i >= 0; i-- ) {
            if (r >= 0) {
                bs.set(i, false);
                r = 2 * r - d;
            } else {
                bs.set(i, true);
                r = 2 * r + d;
            }
        }
        return new Tuple<>((int)bs.toLongArray()[0], r);
    }
}
