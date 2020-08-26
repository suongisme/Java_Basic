package theory.IO_character_stream;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.PipedReader;
import java.io.PipedWriter;

public class PipedReaderExample2 {
    BufferedReader bfr;
    public static void main(String[] args) throws IOException, InterruptedException {
        new PipedReaderExample2().test();
    }

    public void test() throws IOException, InterruptedException {
            PipedWriter ppw = new PipedWriter();

            PipedReader ppr = new PipedReader(ppw);

            bfr = new BufferedReader(ppr);

            new ThreadRead().start();

            String[] nameArray = {"name1","name2","\n","name3","name4"};

            for (String x : nameArray) {
                ppw.write(x);
                Thread.sleep(500);
            }

            ppw.close();

    }

    class ThreadRead extends Thread {

        @Override
        public void run() {
            try {
                String line = null;
                while ((line = bfr.readLine()) != null) {
                    System.out.println(line);
                }
            } catch (Exception e) {
                e.printStackTrace();
            } finally {
                try {
                    bfr.close();
                } catch (Exception e) {
                    e.getStackTrace();
                }
            }
        }
    }
}
