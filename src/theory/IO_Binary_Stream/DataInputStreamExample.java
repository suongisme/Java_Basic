package theory.IO_Binary_Stream;

import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.IOException;

public class DataInputStreamExample {
    public static void main(String[] args) throws IOException {
        FileInputStream fis = null;
        DataInputStream dis = null;
        try {
            fis = new FileInputStream("D:\\Intellij\\java_basic\\src\\theory\\IO_Binary_Stream\\Data_DataStream.txt");
            dis = new DataInputStream(fis);

            System.out.println("Begin\n");

            int id1 = dis.readInt();
            String name1 = dis.readUTF();
            int age1 = dis.readInt();
            double salary1 = dis.readDouble();

            System.out.println("First Person");
            System.out.println("\tID: " +id1);
            System.out.println("\tName: " +name1);
            System.out.println("\tAge: "+age1);
            System.out.println("\tSalary: " +salary1);
            System.out.println();

            int id2 = dis.readInt();
            String name2 = dis.readUTF();
            int age2 = dis.readInt();
            double salary2 = dis.readDouble();

            System.out.println("Second Person");
            System.out.println("\tID: " +id2);
            System.out.println("\tName: " +name2);
            System.out.println("\tAge: "+age2);
            System.out.println("\tSalary: " +salary2);

            System.out.println("\nEnd");

        } catch (Exception e) {
            System.out.println(e);
        } finally {
            dis.close();
            fis.close();
        }

    }
}
