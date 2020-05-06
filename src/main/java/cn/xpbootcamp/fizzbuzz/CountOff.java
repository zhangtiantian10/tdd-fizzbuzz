package cn.xpbootcamp.fizzbuzz;

import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class CountOff {
    public String result(int count) {
        return IntStream.range(1, count + 1)
                .mapToObj(number -> {
                    return number % 3 == 0 ? "Fizz" : String.valueOf(number);
                })
                .collect(Collectors.joining("\n"));
    }
}
