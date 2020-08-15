package theory.Comparing_and_Sorting;

import java.util.Comparator;

public class Student implements Comparable<Student>, Comparator<Student> {
    private String name;
    private int age;

    Student(){

    }

    /**
     * create a student object
     * @param name name of student
     * @param age age of student
     */
    Student(String name, int age){
        this.name = name;
        this.age = age;
    }
    /**
      * @return age of student
     **/
    public int getAge() {
        return age;
    }

    /**
     *
     * @param age change age of student
     */
    public void setAge(int age) {
        this.age = age;
    }

    /**
     *
     * @return name of student
     */
    public String getName() {
        return name;
    }

    /**
     * using rename of student
     * @param name new name
     */
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    @Override
    public int compare(Student o1, Student o2) {
        return o1.getName().compareTo(o2.getName());
    }

    @Override
    public boolean equals(Object o) {
        if (o == null){
            System.out.println("Object is null");
            return false;
        }


        if (! (o instanceof Student)){
            System.out.println(o.getClass()+" is not Student");
            return false;
        }

        if (this.getName().compareTo(((Student) o).getName()) != 0) return false;

        return true;
    }

    @Override
    public int compareTo(Student o) {
        return this.getName().compareTo(o.getName());
    }


}
