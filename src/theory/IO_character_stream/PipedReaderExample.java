package theory.IO_character_stream;

import java.io.IOException;
import java.io.PipedReader;
import java.io.PipedWriter;

public class PipedReaderExample {
    static PipedReader ppr;

    public static void main(String[] args) throws IOException {
        PipedWriter ppw = new PipedWriter();
        try {


            ppr = new PipedReader(ppw);

            new threadReadChar().start();

            char[] charGroup = {'a','b','c','d','e'};

            for (char x : charGroup) {
                ppw.write(x);
                Thread.sleep(2000);
            }


        } catch (Exception e) {
            e.getStackTrace();
        } finally {
            ppw.close();
        }
    }

    static class threadReadChar extends Thread{
        @Override
        public void run() {
            try {
                int data;

                while ((data = ppr.read()) != -1) {
                    System.out.println((char)data);
                }

            } catch (Exception e) {
                e.getStackTrace();
            } finally {
                closeReader(ppr);
            }
        }

        public void closeReader (PipedReader x) {
            try {
                if (x != null) {
                    x.close();
                }
            } catch (Exception e){
                e.getStackTrace();
            }
        }
    }


}
