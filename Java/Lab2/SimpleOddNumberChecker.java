// 自定义异常
class OddNumberException extends Exception {
    public OddNumberException(int number) {
        super("Number " + number + " is odd. Even numbers only.");
    }
}

public class SimpleOddNumberChecker {
    public static void main(String[] args) {
        int[] numbers = {2, 3, 4, 5};

        for (int num : numbers) {
            try {
                checkNumber(num);
            } catch (OddNumberException e) {
                System.out.println("Exception caught: " + e.getMessage());
            }
        }
    }

    public static void checkNumber(int number) throws OddNumberException {
        if (number % 2 != 0) {
            throw new OddNumberException(number);
        }
        System.out.println("Number " + number + " is even.");
    }
}