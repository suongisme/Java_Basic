package theory.thread;

public class MainThreadExample {
    public static void main(String[] args) {
        int ide = 1;

        // begin, loops twice

        for (int i=0; i<2; i++) {
            System.out.println("up");
            System.out.println("MainThread is running: "+ide++);
            try {
                Thread.sleep(2010);
            } catch (Exception e) {
                System.out.println(e);
            }
        }

        // active HelloThread thread
        new HelloThread().start();

        // this loops will run parallel with HelloThread thread
        for (int i=0; i<2; i++) {
            System.out.println("Down");
            System.out.println("MainThread is running: "+ide++);
            try {
                Thread.sleep(2010);
            } catch (Exception e) {
                System.out.println(e);
            }

        }
    }

    static class HelloThread extends Thread {
        @Override
        public void run() {
            for (int i=1; i<11; i++) {
                System.out.println("--HelloThread is running: "+i);
                try {
                    Thread.sleep(1030);
                } catch (Exception e) {
                }
            }
        }
    }

}
