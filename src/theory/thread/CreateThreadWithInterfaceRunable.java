package theory.thread;

import java.util.concurrent.TimeUnit;

public class CreateThreadWithInterfaceRunable {
    public static void main(String[] args) {
        Thread firstThread = new Thread(new CreateThreadWithInterfaceRunable.ThreadRunable());
        firstThread.start();

        for (int i=1; i<11; i++) {
            System.out.println("MAIN :Main Thread is running: "+i);
            try {
                Thread.sleep(1000);
            } catch (Exception e) {
                System.out.println(e);
            }
        }


    }

    static class ThreadRunable implements Runnable{
        @Override
        public void run() {
            for (int i=1; i<11; i++) {
                try {
                    System.out.println("THREADRUNABLE :Thread is running: "+i);
                    Thread.sleep(TimeUnit.SECONDS.toMillis(1));
                } catch (Exception e) {
                    System.out.println(e);
                }
            }
        }
    }
}
