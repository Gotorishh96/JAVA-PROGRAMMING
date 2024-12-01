class AgeRestrictionException extends Exception {
    public AgeRestrictionException(String message) {
        super(message);
    }
}
public class ExceptionAge {
        // Method that checks if age is less than 18
    public static void checkAge(int age) throws AgeRestrictionException {
        if (age < 18) {
            throw new AgeRestrictionException("Age is less than 18. Access denied!");
        } else {
            System.out.println("Age is valid. Access granted.");
        }
    }
    public static void main(String[] args) {
        try {
            checkAge(20);  // Valid case
            checkAge(15);  // This will throw an exception
        } catch (AgeRestrictionException e) {
            System.out.println("Caught an exception: " + e.getMessage());
        }
    }
}
