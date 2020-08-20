package theory.IO_Binary_Stream;

import java.io.FileOutputStream;
import java.io.OutputStream;

public class OutputStreamExample {
    public static void main(String[] args) {
        try {

            OutputStream os = new FileOutputStream("D:\\Intellij\\java_basic\\src\\theory\\IO_Binary_Stream\\DataWrite.txt");

            byte[] by1 = {'h','e','l','l','o',' ','j','a','v','a'};

            // write by1 array to file
            os.write(by1);

            // flush data in memory to file
            os.flush();

            // close stream
            os.close();
            System.out.println("Wrote to DataWrite File");
        } catch (Exception x) {
            System.out.println(x);
        }
    }
}
