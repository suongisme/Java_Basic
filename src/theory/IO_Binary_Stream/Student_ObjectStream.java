package theory.IO_Binary_Stream;

import java.io.Serializable;

public class Student_ObjectStream implements Serializable {
    private static final long serialVersionUID = 5648459982845171178L;

    private String name;
    private int age;

    Student_ObjectStream(String name, int age){
        this.name = name;
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Student_ObjectStream{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
