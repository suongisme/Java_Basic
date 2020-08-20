package theory.IO_Binary_Stream;

import java.io.*;

public class DataOutputStreamExample {
    public static void main(String[] args) throws IOException {
        int id1 = 001;
        String name1 = "Basic Java";
        int age1 = 18;
        double salary1 = 10000.5;

        int id2 = 002;
        String name2 = "Advanced Java";
        int age2 = 16;
        double salary2 = 20000.5;
        FileOutputStream fis = null;
        DataOutputStream dis = null;
        try {
            fis = new FileOutputStream("D:\\Intellij\\java_basic\\src\\theory\\IO_Binary_Stream\\Data_DataStream.txt");
            dis = new DataOutputStream(fis);

            dis.writeInt(id1);
            dis.writeUTF(name1);
            dis.writeInt(age1);
            dis.writeDouble(salary1);

            dis.writeInt(id2);
            dis.writeUTF(name2);
            dis.writeInt(age2);
            dis.writeDouble(salary2);

            System.out.println("Write Succeed!");

        } catch (Exception e) {
            System.out.println(e);
        } finally {
            fis.close();
            dis.close();
        }
    }
}
