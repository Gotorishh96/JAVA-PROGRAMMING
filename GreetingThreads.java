class GoodMorningRunnable implements Runnable {
    @Override
    public void run() {
        for (int i = 0; i < 5; i++) { // Print 5 times
            System.out.println("GOOD MORNING");
            try {
                Thread.sleep(1000); // Pause for 1 second
            } catch (InterruptedException e) {
                System.out.println("GoodMorningRunnable interrupted: " + e.getMessage());
            }
        }
    }
}

class GoodAfternoonRunnable implements Runnable {
    @Override
    public void run() {
        for (int i = 0; i < 5; i++) { // Print 5 times
            System.out.println("GOOD AFTERNOON");
            try {
                Thread.sleep ( 3000); // Pause for 3 seconds
            } catch (InterruptedException e) {
                System.out.println("GoodAfternoonRunnable interrupted: " + e.getMessage());
            }
        }
    }
}

public class GreetingThreads {
    public static void main(String[] args) {
        Thread morningThread = new Thread(new GoodMorningRunnable());
        Thread afternoonThread = new Thread(new GoodAfternoonRunnable());

        morningThread.start(); // Start the "GOOD MORNING" thread
        afternoonThread.start(); // Start the "GOOD AFTERNOON" thread
    }
}

