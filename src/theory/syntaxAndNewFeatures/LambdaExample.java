package theory.syntaxAndNewFeatures;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class LambdaExample {
    public static void main(String[] args) {
        List<String> nameList = new ArrayList<String>();
        nameList.add("nguyen van suong");
        nameList.add("Nguyen van a");

        // Show list when not using lambda expression
        System.out.println("When not using lambda expression");
        nameList.forEach(new Consumer<String>() {
            @Override
            public void accept(String s) {
                System.out.println(s);
            }
        });

        // when using lambda expression
        // note: Lambda expression just use when that interface is FunctionalInterface
        System.out.println("\nWhen using lambda expression");
        nameList.forEach(x -> System.out.println(x));
    }
}
