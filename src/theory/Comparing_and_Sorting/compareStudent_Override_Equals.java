package theory.Comparing_and_Sorting;

public class compareStudent_Override_Equals {
    public static void main(String[] args) {
        Student student1 =
                        new Student("SuongNguyen",18);

        Student student2 =
                        new Student("NguyenSuong", 18);

        // student1 compare student2 by equals method. parameter is true
        boolean result = student1.equals(student2);
        System.out.println("Student1's name is like student2's name: "+result);


        // student1 compare studentFake by equals method. parameter is false
        String studentFake = "Student";
        boolean result2 = student1.equals(studentFake);
        System.out.println("Result2 is: "+result2);
    }
}
