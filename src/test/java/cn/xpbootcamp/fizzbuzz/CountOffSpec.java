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

    @Test
    void should_return_12fizz4Buzz() {
        CountOff countOff = new CountOff();
        assertThat("1\n" +
                "2\n" +
                "Fizz\n" +
                "4\n" +
                "Buzz").isEqualTo(countOff.result(5));
    }

    @Test
    void should_return_12fizz4BuzzfizzWhizz() {
        CountOff countOff = new CountOff();
        assertThat("1\n" +
                "2\n" +
                "Fizz\n" +
                "4\n" +
                "Buzz\n" +
                "Fizz\n" +
                "Whizz").isEqualTo(countOff.result(7));
    }
}
