interface MathOperations {
   int add(int a, int b);
   int sub(int a, int b);
   int mul(int a, int b);
   int div(int a, int b);
}

class Calculator implements MathOperations {
   @Override
   public int add(int a, int b) {
       return a + b;
   }

   @Override
   public int sub(int a, int b) {
       return a - b;
   }

   @Override
   public int mul(int a, int b) {
       return a * b;
   }

   @Override
   public int div(int a, int b) {
       if (b == 0) {
           throw new ArithmeticException("Division by zero");
       }
       return a / b;
   }
}

public class Intercalc1 {
   public static void main(String[] args) {
       Calculator calc = new Calculator();

       int r = 10;
       int s = 5;

       System.out.println("Addition: " + calc.add(r,s));
       System.out.println("Subtraction: " + calc.sub(r,s));
       System.out.println("Multiplication: " + calc.mul(r,s));
       System.out.println("Division: " + calc.div(r,s));
   }
}