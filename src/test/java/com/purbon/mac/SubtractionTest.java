package com.purbon.mac;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class SubtractionTest {

    Subtraction s;

    @BeforeEach
    public void before() {
        s = new Subtraction();
    }

    @Test
    public void subtractionOfNumbersShouldGiveCorrectResult() {
        var a = new int[]{4, 7};
        var b = new int[]{1, 5};
        var r = s.minus(a, b);
        assertThat(r).isEqualTo(32);
    }

    @Test
    public void subtractionOfCarryOnNumbersShouldGiveCorrectResult() {
        var a = new int[]{4, 0};
        var b = new int[]{1, 5};
        var r = s.minus(a, b);
        assertThat(r).isEqualTo(25);
    }

    @Test
    public void subtractionOfLongNumbersShouldGiveCorrectResult() {
        var a = new int[]{3, 4, 0};
        var b = new int[]{2, 1, 5};
        var r = s.minus(a, b);
        assertThat(r).isEqualTo(125);
    }

    @Test
    public void subtractionOfOutOfOrderNumbersShouldGiveCorrectResult() {
        var a = new int[]{1, 5};
        var b = new int[]{4, 0};
        var r = s.minus(a, b);
        assertThat(r).isEqualTo(-25);
    }
}
