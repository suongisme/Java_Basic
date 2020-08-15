package theory.Comparing_and_Sorting;

public class positionStoreOfReferenceType {
    public static void main(String[] args) {
        //Create an object in memory For example
        // A point
        Object a = new Object();

        // assign a value for object 'a'
        // B point
        a = new String("This is position store of reference type");

        // B point. Object 'a' and Object 'b' store the same position in memory
        String b = (String) a;

    }
}
