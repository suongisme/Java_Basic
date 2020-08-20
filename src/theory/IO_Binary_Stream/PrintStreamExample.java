package theory.IO_Binary_Stream;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class PrintStreamExample {
    private static String getStackStaceString(Exception e) {

        ByteArrayOutputStream baos = new ByteArrayOutputStream();

        // data will write to baos
        PrintStream printStream = new PrintStream(baos);

        // print to printStream
        e.printStackTrace(printStream);

        printStream.close();

        byte[] bt = baos.toByteArray();

        String t = new String(bt);

        return t+baos.size();

    }

    public static void main(String[] args) {
        try {
            int a = 10/0;
        } catch (Exception e) {
            System.out.println("MESSAGE ERROR:" +e.getMessage());
            String s = getStackStaceString(e);
            System.out.println("Stack Trace String "+s);
            System.out.println();

            e.printStackTrace();
        }
    }
}
