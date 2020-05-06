package cn.xpbootcamp.fizzbuzz;

import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class CountOff {
    public String result(int count) {
        return IntStream.range(1, count + 1)
                .mapToObj(number -> {
                    if (number % 3 == 0 && number % 5 == 0) {
                        return "FizzBuzz";
                    }

                    if (number % 3 == 0 && number % 7 == 0) {
                        return "FizzWhizz";
                    }

                    if (number % 5 == 0 && number % 7 == 0) {
                        return "BuzzWhizz";
                    }

                    if (number % 3 == 0) {
                        return "Fizz";
                    }

                    if (number % 5 == 0) {
                        return "Buzz";
                    }

                    if (number % 7 == 0) {
                        return "Whizz";
                    }

                    return String.valueOf(number);
                })
                .collect(Collectors.joining("\n"));
    }
}
