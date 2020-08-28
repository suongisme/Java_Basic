package theory.thread;
import java.util.Date;
public class UsingYield {
    static Date date1;
    static Date date2;
    public static void main(String[] args) {
        Thread importantThread = new ImportantThread();
        importantThread.setPriority(10);

        Thread unimportantThread = new UnimportantThread();
        unimportantThread.setPriority(1);

        unimportantThread.start();
        importantThread.start();

        /*RESULT*/
        // unimportantThread end faster than importantThread because of yield() method
    }

    static class ImportantThread extends Thread {
        @Override
        public void run() {
            for (int i = 0; i < 100000; i++) {
                System.out.println("\n Important work " + i);

                // this is notifying system operate this thread gives priority for other thread
                Thread.yield();
            }
        }
    }

    static class UnimportantThread extends Thread {
        @Override
        public void run() {
            for (int a = 0; a < 100000; a++) {
                System.out.println("\n  -- UnImportant work " + a);
            }
        }

    }

}
