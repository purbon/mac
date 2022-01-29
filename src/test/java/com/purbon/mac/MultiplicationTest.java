package com.purbon.mac;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class MultiplicationTest {

    private Multiplication multi;

    @BeforeEach
    public void before() {
        multi = new Multiplication();
    }

    @Test
    public void singleDigitShouldReturnOk() {
       int[] a = new int[]{5};
       int[] b = new int[]{4};

       var r = multi.times(a, b);
       assertThat(r).isEqualTo(20);
    }

    @Test
    public void twoDigitsShouldReturnOk() {
       int[] a = new int[]{2, 0};
       int[] b = new int[]{5, 4};

       var r = multi.times(a, b);
       assertThat(r).isEqualTo(1080);
    }

    @Test
    public void multiDigitsShouldReturnOk() {
        int[] a = new int[]{2, 3, 9, 5, 8, 2, 3, 3};
        int[] b = new int[]{5, 8, 3, 0};

        var r = multi.times(a, b);
        assertThat(r).isEqualTo(139676498390L);
    }
}
