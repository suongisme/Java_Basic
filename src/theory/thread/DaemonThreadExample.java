package theory.thread;

public class DaemonThreadExample {
    public static void main(String[] args) {
        Thread myThread = new DaemonThread();
        myThread.setDaemon(true);
        myThread.start();

        // java has two type of thread
        // Daemon thread & normal thread
        // Daemon thread: When normal thread stop then daemon auto stop
        // to set daemon thread: setDaemon() method
        // just setDaemon() method when that thread don't run
        // if that thread is running then throw a exception
        for (int i = 1; i < 4; i++) {
            System.out.println(i);
            try {
                Thread.sleep(1000);
            } catch (Exception e) {
            }

        }
    }

    static class DaemonThread extends Thread {
        @Override
        public void run() {
            for (;;) {
                System.out.println("suong");
                try {
                    Thread.sleep(1000);
                } catch (Exception e) {
                }
            }
        }
    }

}
