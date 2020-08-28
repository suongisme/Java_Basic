package theory.thread;

public class UsingJoin {

    public static void main(String[] args) {
        Thread joinThread = new CreateThread("A",2);
        Thread noJoinThread = new CreateThread("B",3);

        joinThread.start();
        noJoinThread.start();


        try {
            // this thing mean when joinThread thread then run down
            joinThread.join();
            // this thing mean after two second then run donw
            noJoinThread.join(2000);
        } catch (Exception e) {
            System.out.println(e);
        }

        System.out.println("-Hello, Welcome to Main Thread-");
    }

    static class CreateThread extends Thread {
        private String threadName;
        private int count;
        public CreateThread(String threadName, int count) {
            this.threadName = threadName;
            this.count = count;
        }
        @Override
        public void run() {
            try {
                for (int i = 1; i < this.count; i++) {
                    System.out.println(this.threadName+" is running: " +i);
                    Thread.sleep(1000);
                }
                System.out.println("==>"+this.threadName+" ended");
            } catch (Exception e) {
            }

        }
    }

}
