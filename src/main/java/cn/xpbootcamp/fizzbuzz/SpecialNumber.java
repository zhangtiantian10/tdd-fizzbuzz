package cn.xpbootcamp.fizzbuzz;

class SpecialNumber {
    protected int number;

    public SpecialNumber(int number) {
        this.number = number;
    }

    String getSpecialWord() {
        return "";
    }
}

class Fizz extends SpecialNumber {
    boolean isFizz = number % 3 == 0;

    public Fizz(int number) {
        super(number);
    }

    @Override
    String getSpecialWord() {
        String numberStr = String.valueOf(this.number);
        if (numberStr.contains("7") || !numberStr.contains("5")) {
            if (isFizz) {
                return "Fizz";
            }
        }

        return "";
    }
}

class Buzz extends SpecialNumber {
    boolean isBuzz = number % 5 == 0;

    public Buzz(int number) {
        super(number);
    }

    @Override
    String getSpecialWord() {
        String numberStr = String.valueOf(this.number);
        if (!numberStr.contains("7") && isBuzz) {
            return "Buzz";
        }

        return "";
    }
}

class Whizz extends SpecialNumber {
    boolean isWhizz = number % 7 == 0;

    public Whizz(int number) {
        super(number);
    }

    @Override
    String getSpecialWord() {
        String numberStr = String.valueOf(this.number);
        if (isWhizz || numberStr.contains("7")) {
            return "Whizz";
        }

        return "";
    }
}
