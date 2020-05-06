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

    @Test
    void should_return_12fizz4BuzzfizzWhizz8fizzBuzz11fizz13whizzfizzbuzz() {
        CountOff countOff = new CountOff();
        assertThat("1\n" +
                "2\n" +
                "Fizz\n" +
                "4\n" +
                "Buzz\n" +
                "Fizz\n" +
                "Whizz\n" +
                "8\n" +
                "Fizz\n" +
                "Buzz\n" +
                "11\n" +
                "Fizz\n" +
                "13\n" +
                "Whizz\n" +
                "FizzBuzz").isEqualTo(countOff.result(15));
    }

    @Test
    void should_return_12fizz4BuzzfizzWhizz8fizzBuzz11fizz13whizzfizzbuzz1617fizz19buzzfizzwhizz() {
        CountOff countOff = new CountOff();
        assertThat("1\n" +
                "2\n" +
                "Fizz\n" +
                "4\n" +
                "Buzz\n" +
                "Fizz\n" +
                "Whizz\n" +
                "8\n" +
                "Fizz\n" +
                "Buzz\n" +
                "11\n" +
                "Fizz\n" +
                "13\n" +
                "Whizz\n" +
                "FizzBuzz\n" +
                "16\n" +
                "17\n" +
                "Fizz\n" +
                "19\n" +
                "Buzz\n" +
                "FizzWhizz").isEqualTo(countOff.result(21));
    }

    @Test
    void should_return_correct_value_from_1to35() {
        CountOff countOff = new CountOff();
        assertThat("1\n" +
                "2\n" +
                "Fizz\n" +
                "4\n" +
                "Buzz\n" +
                "Fizz\n" +
                "Whizz\n" +
                "8\n" +
                "Fizz\n" +
                "Buzz\n" +
                "11\n" +
                "Fizz\n" +
                "13\n" +
                "Whizz\n" +
                "FizzBuzz\n" +
                "16\n" +
                "17\n" +
                "Fizz\n" +
                "19\n" +
                "Buzz\n" +
                "FizzWhizz\n" +
                "22\n" +
                "23\n" +
                "Fizz\n" +
                "Buzz\n" +
                "26\n" +
                "Fizz\n" +
                "Whizz\n" +
                "29\n" +
                "FizzBuzz\n" +
                "31\n" +
                "32\n" +
                "Fizz\n" +
                "34\n" +
                "BuzzWhizz").isEqualTo(countOff.result(35));
    }

    @Test
    void should_return_correct_value_for_105_with_FizzBuzzWhizz() {
        CountOff countOff = new CountOff();
        assertThat(countOff.result(105).endsWith("FizzBuzzWhizz")).isEqualTo(true);
    }
}
