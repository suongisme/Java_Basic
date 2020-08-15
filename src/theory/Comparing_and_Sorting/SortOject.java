package theory.Comparing_and_Sorting;

import java.util.*;

public class SortOject {
    public static void main(String[] args) {
        Student[] studentArray = new Student[6];
        studentArray[0] = new Student("suongnguyen",18);
        studentArray[1] = new Student("nguyenvansuong",18);
        studentArray[2] = new Student("suongnguyen",19);
        studentArray[3] = new Student("suongnguyenvan",19);
        studentArray[4] = new Student("noname", 20);
        studentArray[5] = new Student("havename", 21);
        List<Student> studentList = Arrays.asList(studentArray.clone());
        // arrange array by compareTo method
        Arrays.sort(studentArray);

        for (Student x : studentArray) {
            System.out.println(x);
        }
        // arrange list by compareTo method
        Collections.sort(studentList);
        System.out.println();
        studentList.forEach( x -> System.out.println(x));

        System.out.println();
        // arrange list by Comparator
        Comparator<Student> a = (Student x ,Student y) -> {return x.getName().compareTo(y.getName());};
        Collections.sort(studentList, a);
        studentList.forEach(x -> System.out.println(x));

        System.out.println();
        // arrange list by override Comparator
        // parameter of Collections is List&Comparator. Student implement Comparator
        Collections.sort(studentList, new Student());
        studentList.forEach(x -> System.out.println(x));


    }
}
