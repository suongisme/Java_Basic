package theory.thread;

public class HandingException {
    public static void main(String[] args) {
        Thread myThread = new ExceptionThread();
        // when thread has exception then this method active
        myThread.setUncaughtExceptionHandler( (Thread t, Throwable e) -> {
            System.out.println("#Thread: "+t);
            System.out.println("#Problem: "+e.getMessage());
        });
        myThread.start();
    }

    static class ExceptionThread extends Thread {
        @Override
        public void run() {
            for (;;) {
                int getRandomNumber = (int) (Math.random() * 10);

                System.out.println("Random Number: "+getRandomNumber);
                if (getRandomNumber == 5)  throw new RuntimeException("Random Number equals 5");
                try {
                    Thread.sleep(1500);
                } catch (Exception e) {
                    System.out.println(e);
                }
            }
        }
    }

}
