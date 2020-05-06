package cn.xpbootcamp.fizzbuzz;

import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class CountOff {
    public String result(int count) {
        return IntStream.range(1, count + 1)
                .mapToObj(number -> {
                    if (number % 3 == 0) {
                        return "Fizz";
                    }

                    if (number % 5 == 0) {
                        return "Buzz";
                    }

                    return String.valueOf(number);
                })
                .collect(Collectors.joining("\n"));
    }
}
