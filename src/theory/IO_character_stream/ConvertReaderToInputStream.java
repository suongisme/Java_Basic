package theory.IO_character_stream;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;

public class ConvertReaderToInputStream {
    public static void main(String[] args) throws IOException {
        FileInputStream fis = null;
        Reader rd = null;
        try {
            fis = new FileInputStream("D://intellij//java_basic//src//theory//IO_character_stream//ReaderFile.txt");
            rd = new InputStreamReader(fis, "UTF-8");

            int index;

            while((index = rd.read()) != -1) {
                System.out.println(index+" "+(char) index);
            }

        } catch (Exception e) {
            System.out.println(e);
        } finally {
            fis.close();
            rd.close();
        }
    }
}
