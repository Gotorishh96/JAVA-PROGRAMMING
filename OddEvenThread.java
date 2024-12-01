class OddThread extends Thread {
    @Override
    public void run() {
        for (int i = 1; i <= 20; i += 2) { // Loop to print odd numbers
            System.out.println("Odd: " + i);
            try {
                Thread.sleep(5000); // Pause for 5 seconds
            } catch (InterruptedException e) {
                System.out.println("OddThread interrupted: " + e.getMessage());
            }
        }
    }
}

class EvenThread extends Thread {
    @Override
    public void run() {
        for (int i = 2; i <= 20; i += 2) { // Loop to print even numbers
            System.out.println("Even: " + i);
            try {
                Thread.sleep(5000); // Pause for 5 seconds
            } catch (InterruptedException e) {
                System.out.println("EvenThread interrupted: " + e.getMessage());
            }
        }
    }
}

public class OddEvenThread {
    public static void main(String[] args) {
        OddThread oddThread = new OddThread();
        EvenThread evenThread = new EvenThread();
    
        
        oddThread.start(); // Start the odd number thread
        evenThread.start(); // Start the even number thread
        
    }
}

