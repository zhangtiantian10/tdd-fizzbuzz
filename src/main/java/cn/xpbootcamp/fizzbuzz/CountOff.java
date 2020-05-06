package cn.xpbootcamp.fizzbuzz;

import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class CountOff {
    public String result(int count) {
        return IntStream.range(1, count + 1)
                .mapToObj(number -> {
                    String result = "";
                    boolean isFizz = number % 3 == 0;
                    boolean isBuzz = number % 5 == 0;
                    boolean isWhizz = number % 7 == 0;

                    if (isFizz) {
                        result += "Fizz";
                    }

                    if (isBuzz) {
                        result += "Buzz";
                    }

                    if (isWhizz) {
                        result += "Whizz";
                    }

                    return result.isEmpty() ? String.valueOf(number) : result;
                })
                .collect(Collectors.joining("\n"));
    }
}
