package cn.xpbootcamp.fizzbuzz;

public class Game {
    public String run(int number) {
        String result = "";
        String numberStr = String.valueOf(number);
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

        if (numberStr.contains("3")) {
            return "Fizz";
        }

        return result.isEmpty() ? String.valueOf(number) : result;
    }
}
