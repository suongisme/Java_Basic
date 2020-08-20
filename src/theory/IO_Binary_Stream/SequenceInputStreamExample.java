package theory.IO_Binary_Stream;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.SequenceInputStream;
import java.util.Vector;

public class SequenceInputStreamExample {
    public static void main(String[] args) throws IOException {
        FileInputStream fis1 = null;
        FileInputStream fis2 = null;
        FileInputStream fis3 = null;
        SequenceInputStream sit = null;

        try {

            fis1 = new FileInputStream("D:\\Intellij\\java_basic\\src\\theory\\IO_Binary_Stream\\DataRead.txt");
            fis2 = new FileInputStream("D:\\Intellij\\java_basic\\src\\theory\\IO_Binary_Stream\\DataWrite.txt");

            sit = new SequenceInputStream(fis1, fis2);
            int index;

            while ((index = sit.read()) != -1) {
                System.out.print((char) index);
            }

        } catch (Exception e) {
            System.out.println(e);
        }

        System.out.println("\n\n\t\tRead more than two files\n");

        try {
            fis1 = new FileInputStream("D:\\Intellij\\java_basic\\src\\theory\\IO_Binary_Stream\\DataRead.txt");
            fis2 = new FileInputStream("D:\\Intellij\\java_basic\\src\\theory\\IO_Binary_Stream\\DataWrite.txt");
            fis3 = new FileInputStream("D:\\Intellij\\java_basic\\src\\theory\\IO_Binary_Stream\\Data_DataStream.txt");

            Vector<InputStream> inputstreamVector = new Vector<InputStream>();
            inputstreamVector.add(fis1);
            inputstreamVector.add(fis2);
            inputstreamVector.add(fis3);

            sit = new SequenceInputStream(inputstreamVector.elements());
            int index;

            while ((index = sit.read()) != -1) {
                System.out.print((char) index);
            }

        } catch (Exception e) {
            System.out.println(e);
        } finally {
            fis1.close();
            fis2.close();
            fis3.close();
            sit.close();
        }
    }

}
