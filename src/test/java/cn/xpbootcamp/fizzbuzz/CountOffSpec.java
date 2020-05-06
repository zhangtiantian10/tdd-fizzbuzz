package cn.xpbootcamp.fizzbuzz;


import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class CountOffSpec {
    @Test
    void should_return_12() {
        CountOff countOff = new CountOff();
        assertThat("1\n2").isEqualTo(countOff.result(2));
    }

    @Test
    void should_return_12fizz() {
        CountOff countOff = new CountOff();
        assertThat("1\n" +
                "2\n" +
                "Fizz").isEqualTo(countOff.result(3));
    }
}
