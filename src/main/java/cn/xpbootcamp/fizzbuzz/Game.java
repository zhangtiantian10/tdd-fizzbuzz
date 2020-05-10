package cn.xpbootcamp.fizzbuzz;

public class Game {
    public String run(int number) {
        String result = "";
        String numberStr = String.valueOf(number);
        boolean isFizz = number % 3 == 0;
        boolean isBuzz = number % 5 == 0;
        boolean isWhizz = number % 7 == 0;

        if (!numberStr.contains("5")) {
            if (numberStr.contains("3")) {
                return "Fizz";
            }
        }

        if (numberStr.contains("7") || !numberStr.contains("5")) {
            if (isFizz) {
                result += "Fizz";
            }
        }

        if (!numberStr.contains("7") && isBuzz) {
            result += "Buzz";
        }

        if (isWhizz || numberStr.contains("7")) {
            result += "Whizz";
        }

        return result.isEmpty() ? String.valueOf(number) : result;
    }
}
