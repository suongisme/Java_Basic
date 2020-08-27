package theory.syntaxAndNewFeatures.keywordfourpoint;

public class DoJob {

    public static void DO(int a, int b, MyInterface x) {
        System.out.println("Total: "+x.doSomething(a,b)+"\n");
    }

    public static int structure(int a, int b) {
        System.out.println("A: "+a);
        System.out.println("B: "+b);
        return a + b;
    }

    public static void main(String[] args) {
        // instead of do this
        System.out.println("Old type");
        DO(10,20, (a, b) -> {
            System.out.println("A: "+a);
            System.out.println("B: "+b);
            return a + b;});

        DO(20,20, (a, b) -> {
            System.out.println("A: "+a);
            System.out.println("B: "+b);
            return a + b;});

        DO(30,20, (a, b) -> {
            System.out.println("A: "+a);
            System.out.println("B: "+b);
            return a + b;});

        DO(40,20, (a, b) -> {
            System.out.println("A: "+a);
            System.out.println("B: "+b);
            return a + b;});

        // Should do this
        System.out.println("\nModern type");
        DO(10,20, DoJob::structure);
        DO(20,20, DoJob::structure);
        DO(30,20, DoJob::structure);
        DO(40,20, DoJob::structure);


    }
}
