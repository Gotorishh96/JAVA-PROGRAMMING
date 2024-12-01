interface BasicOperations {
    int add(int a, int b);
    int sub(int a, int b);
}
interface AdvancedOperations {
    int mul(int a, int b);
    int div(int a, int b);
}
class Calculator implements BasicOperations, AdvancedOperations {
    
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
        return  a / b;
    }
}
public class Intercalc2 {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        int r=20;
        int m=5;
        System.out.println("Addition: " + calculator.add(r,m)); 
        System.out.println("Subtraction: " + calculator.sub(r,m)); 
        System.out.println("Multiplication: " + calculator.mul(r,m)); 
        System.out.println("Division: " + calculator.div(r,m));
    }
}