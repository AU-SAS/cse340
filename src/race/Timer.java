package race;

import java.util.concurrent.atomic.AtomicInteger;

/**
 * @author Susanta Tewari
 * @version version
 * @history Created in 2025, Oct.
 * @since since
 */
public class Timer {

  public static void main(String[] args) throws InterruptedException {

    long startTime = System.nanoTime();

    Counter.main(args);

    long endTime = System.nanoTime();

    long duration = (endTime - startTime); // Calculate duration in nanoseconds

    System.out.println("Duration: " + duration + " nanoseconds");
    System.out.println("Duration: " + (duration / 1_000_000.0) + " milliseconds");
  }
}
