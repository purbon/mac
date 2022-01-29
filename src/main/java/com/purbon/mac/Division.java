package com.purbon.mac;

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
            return new Tuple<>(-1 * t.left, t.right);
        }
        if (n < 0) {
            var t = div(-n, d);
            if (t.right == 0) {
                return new Tuple<>(t.left, 0);
            } else {
                return new Tuple<>(-1 * t.left -1, d - t.right);
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
