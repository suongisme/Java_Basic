package theory.IO_Binary_Stream;

import java.io.ByteArrayOutputStream;

public class ByteArrayOutputStreamExample{
    public static void main(String[] args) {
        // as byte array: default size is 32 byte
        ByteArrayOutputStream baos = new ByteArrayOutputStream(10);

        String slogan = "hello basic java";
        byte[] by = slogan.getBytes();
        try {
            baos.write(by);

            System.out.println("Size of ByteArrayOutputStream: " + baos.size());

            String getStringToBaos = new String(baos.toByteArray());

            System.out.println("New String: " +getStringToBaos);

        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
