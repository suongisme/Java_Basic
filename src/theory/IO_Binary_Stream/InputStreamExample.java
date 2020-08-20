package theory.IO_Binary_Stream;

import java.io.FileInputStream;
import java.io.InputStream;

public class InputStreamExample {
    public static void main(String[] args) {
        try {
            InputStream is = new FileInputStream("D:\\Intellij\\java_basic\\src\\theory\\IO_Binary_Stream\\DataRead.txt");

            byte[] temp = new byte[10];
            int index;

            // read method return amount of byte read into byte Array
            while ((index = is.read(temp)) != -1) {
                String toRead = new String(temp, 0, index);
                System.out.println(toRead);
            }
            System.out.println((char)temp[0]);
            is.close();

        } catch (Exception x) {
            System.out.println(x);

        }
    }
}
