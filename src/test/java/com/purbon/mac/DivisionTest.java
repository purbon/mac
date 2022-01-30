package com.purbon.mac;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class DivisionTest {

    Division div;

    @BeforeEach
    public void before() {
        div = new Division();
    }

    @Test
    public void slowDivisionShouldReturnOk() {
       var r = div.slow(5, 2);
       assertThat(r).isEqualTo(2);

        var r2 = div.slow(4, 2);
        assertThat(r2).isEqualTo(2);

        var r3 = div.slow(7, 3);
        assertThat(r3).isEqualTo(2);
    }

    @Test
    public void longDivisionShouldReturnOk() {
        var r = div.div(5, 2);
        assertThat(r.getLeft()).isEqualTo(2);
        assertThat(r.getRight()).isEqualTo(1);

        var r2 = div.div(4, 2);
        assertThat(r2.getLeft()).isEqualTo(2);
        assertThat(r2.getRight()).isEqualTo(0);

        var r3 = div.div(7, 3);
        assertThat(r3.getLeft()).isEqualTo(2);
        assertThat(r3.getRight()).isEqualTo(1);
    }

    public void nonRestoringDivisionShouldReturnOk() {
        var r = div.nonRestoring(5, 2);
        assertThat(r.getLeft()).isEqualTo(2);
        assertThat(r.getRight()).isEqualTo(1);
    }
}
