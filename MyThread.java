class MyThread implements Runnable {
    @Override
    public void run() {
        for (int i = 1; i <= 10; i++) {
            System.out.println("\t Thread mythread : i= "+i);
            try {
                Thread.sleep(5000); // Pause for 5 seconds
            } catch (InterruptedException e) {
                System.out.println("Thread interrupted: " + e.getMessage());
            }
        }
        System.out.println("End of mythread ");
    }
public class TestRunnable{
    public static void main(String args [] ) {
        MyThread ox = new MyThread();
        Thread tr = new Thread(ox);
        tr.start();

        System.out.println("End of mainthread ");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            System.out.println("Mainthread Interupted ");
        }
    }
}
}