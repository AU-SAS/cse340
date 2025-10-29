package race;

public class Counter_Synchronized {
    private int count = 0;

    public synchronized void increment() {
        count++; // This is not an atomic operation
    }

    public int getCount() {
        return count;
    }

    public static void main(String[] args) throws InterruptedException {
        Counter_Synchronized counter = new Counter_Synchronized();
        Runnable task = () -> {
            for (int i = 0; i < 1000; i++) {
                counter.increment();
            }
        };

        Thread t1 = new Thread(task);
        Thread t2 = new Thread(task);

        t1.start();
        t2.start();

        t1.join(); // Wait for t1 to finish
        t2.join(); // Wait for t2 to finish

        System.out.println("Final count: " + counter.getCount());
    }
}