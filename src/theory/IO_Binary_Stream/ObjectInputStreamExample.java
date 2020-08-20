package theory.IO_Binary_Stream;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.text.SimpleDateFormat;
import java.util.Date;

public class ObjectInputStreamExample {
    public static void main(String[] args) throws IOException {
        FileInputStream fis = null;
        ObjectInputStream ois = null;
        SimpleDateFormat formatDate = new SimpleDateFormat("MMMM,dd yyyy");
        try {

            fis = new FileInputStream("D:\\Intellij\\java_basic\\src\\theory\\IO_Binary_Stream\\ObjectStreamExample.txt");
            ois = new ObjectInputStream(fis);

            System.out.println("Read Succeed!");

            String topic = ois.readUTF();

            Date date = (Date) ois.readObject();

            Student_ObjectStream st1 =  (Student_ObjectStream) ois.readObject();
            Student_ObjectStream st2 =  (Student_ObjectStream) ois.readObject();
            Student_ObjectStream st3 =  (Student_ObjectStream) ois.readObject();
            Student_ObjectStream st4 =  (Student_ObjectStream) ois.readObject();

            System.out.println("topic: "+topic);
            System.out.println("Date: "+formatDate.format(date));
            System.out.println("Student 1: "+st1);
            System.out.println("Student 2: "+st2);
            System.out.println("Student 3: "+st3);
            System.out.println("Student 4: "+st4);

        } catch (Exception e) {
            System.out.println(e);
        } finally {
            ois.close();
            fis.close();
        }
    }
}
