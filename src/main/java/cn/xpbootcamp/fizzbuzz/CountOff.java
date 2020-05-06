package cn.xpbootcamp.fizzbuzz;

import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class CountOff {
    public String result(int count) {
        return IntStream.range(1, count + 1)
                .mapToObj(number -> {
                    boolean isFizz = number % 3 == 0;
                    boolean isBuzz = number % 5 == 0;
                    boolean isWhizz = number % 7 == 0;

                    if (isFizz && isBuzz && isWhizz) {
                        return "FizzBuzzWhizz";
                    }

                    if (isFizz && isBuzz) {
                        return "FizzBuzz";
                    }

                    if (isFizz && isWhizz) {
                        return "FizzWhizz";
                    }

                    if (isBuzz && isWhizz) {
                        return "BuzzWhizz";
                    }

                    if (isFizz) {
                        return "Fizz";
                    }

                    if (isBuzz) {
                        return "Buzz";
                    }

                    if (isWhizz) {
                        return "Whizz";
                    }

                    return String.valueOf(number);
                })
                .collect(Collectors.joining("\n"));
    }
}
