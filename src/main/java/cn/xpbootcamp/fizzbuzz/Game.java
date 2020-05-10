package cn.xpbootcamp.fizzbuzz;

import java.util.ArrayList;
import java.util.List;

public class Game {

    public String run(int number) {
        String numberStr = String.valueOf(number);

        if (!numberStr.contains("5") && numberStr.contains("3")) {
            return "Fizz";
        }

        List<SpecialNumber> list = new ArrayList<SpecialNumber>() {
            {
                add(new Fizz(number));
                add(new Buzz(number));
                add(new Whizz(number));
            }
        };

        String result = list.stream().reduce("", (res, i) -> res + i.getSpecialWord(), String::concat);

        return result.isEmpty() ? String.valueOf(number) : result;
    }
}
