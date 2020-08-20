package theory.IO_Binary_Stream;

import java.io.ByteArrayInputStream;

public class ByteArrayInputStreamExample {
    public static void main(String[] args) {
        byte[] by = {'h','e','l','l','o'};

        ByteArrayInputStream bais = new ByteArrayInputStream(by);

        int char1 = bais.read();
        System.out.println("char: "+(char)char1);

        System.out.println("Skip Two Elements");
        bais.skip(2);

        int char2 = bais.read();
        System.out.println("char: "+(char)char2);

    }
}
