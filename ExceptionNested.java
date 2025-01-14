 public class ExceptionNested {

    public static void main(String[] args) {
        try {
            // Outer try block
            System.out.println("Outer try block starts...");
            int outerResult = 10 / 0;  // This will throw ArithmeticException (divide by zero)
            System.out.println("This won't be printed due to outer exception.");
            
            try {
                // Inner try block
                System.out.println("Inner try block starts...");

                if (args.length == 1) {
                    // Throws ArithmeticException if only one argument is passed
                    int innerResult = Integer.parseInt(args[0]) / 0;  // Divide by zero
                } else if (args.length == 2) {
                    // Throws NullPointerException when two arguments are passed
                    String nullString = null;
                    System.out.println(nullString.length());  // NullPointerException
                }

                System.out.println("This won't be printed due to inner exception.");
            } catch (ArithmeticException | NullPointerException e) {
                System.out.println("Caught inner exception: " + e);
            }

        } catch (ArithmeticException e) {
            System.out.println("Caught outer exception: Divide by zero (ArithmeticException) in outer try block");
        }

        System.out.println("Program execution continues...");
    }
}
