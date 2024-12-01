class SumExceededException extends Exception {
    public SumExceededException(String message) {
        super(message);
    }
}
public class ExceptionSum {
            public static void checkSum(int num1, int num2) throws SumExceededException {
        int sum = num1 + num2;
        if (sum > 99) {
            throw new SumExceededException("Sum exceeds 99! The sum is: " + sum);
        } else {
            System.out.println("Sum is within the limit: " + sum);
        }
    }
    public static void main(String[] args) {
        try {
            checkSum(40, 50);  // Sum is 90, valid case
            checkSum(60, 50);  // Sum is 110, exception will be thrown
        } catch (SumExceededException e) {
            System.out.println("Caught an exception: " + e.getMessage());
        }
    }
}
 