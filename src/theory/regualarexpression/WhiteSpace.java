package theory.regualarexpression;

public class WhiteSpace {
    public final static String TEXT = "This is my text";
    public static void main(String[] args) {
        System.out.println("TEXT: "+TEXT);

        String[] stringArray = TEXT.split("\\s+");

        System.out.println("length of array: "+stringArray.length);

        for (String x : stringArray) {
            System.out.println(x);
        }

        System.out.println("\nReplace whitespace of TEXT String to tab");
        String changed = TEXT.replaceAll("\\s+","\t");
        System.out.println("TEXT changed: "+changed);

    }
}
