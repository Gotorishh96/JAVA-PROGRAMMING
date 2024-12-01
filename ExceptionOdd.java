public class ExceptionOdd {
   public static void checkNumber(int num) throws Exception {
        if (num < 0) {
            throw new Exception("Number is negative!");
        } else {
            System.out.println("Number is valid: " + num);
        }
    }

    public static void main(String[] args) {
        try {
            checkNumber(10); 
            checkNumber(-5);  
        } catch (Exception e) {
            System.out.println("Caught an exception: " + e.getMessage());
        }
    }
}
