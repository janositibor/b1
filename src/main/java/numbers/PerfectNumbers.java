package numbers;

public class PerfectNumbers {
    public boolean isPerfectNumber(int number) {
        int sumOfDividers = sumOfDividers(number);
        return sumOfDividers == number;
    }

    private int sumOfDividers(int number) {
        int output = 1;
        for (int i = 2; i <= number / 2; i++) {
            if (number % i == 0) {
                output += i;
            }
        }
        return output;
    }
}
