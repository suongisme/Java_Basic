package theory.IO_Binary_Stream;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.util.Date;

public class ObjectOutputStreamExample {
    public static void main(String[] args) {
        try {
            FileOutputStream fos = new FileOutputStream("D:\\Intellij\\java_basic\\src\\theory\\IO_Binary_Stream\\ObjectStreamExample.txt");
            ObjectOutputStream oos = new ObjectOutputStream(fos);

            oos.writeUTF("This is Student List");

            oos.writeObject(new Date());

            Student_ObjectStream st1 = new Student_ObjectStream("Nguyen Van Suong", 18);
            Student_ObjectStream st2 = new Student_ObjectStream("Nguyen Van A", 18);
            Student_ObjectStream st3 = new Student_ObjectStream("Nguyen Van B", 18);
            Student_ObjectStream st4 = new Student_ObjectStream("Nguyen Van C", 18);

            oos.writeObject(st1);
            oos.writeObject(st2);
            oos.writeObject(st3);
            oos.writeObject(st4);

            oos.flush();

            oos.close();
            fos.close();

        } catch (Exception e){
            System.out.println(e);
        }

    }
}
