package com.purbon.mac;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class NumberUtilsTest {

    @Test
    public void shouldBreakTheNumberSuccessfully() {
       int a = 1234;
       assertThat(NumberUtils.asIntArray(a)).isEqualTo(new int[]{1,2,3,4});
    }
}
