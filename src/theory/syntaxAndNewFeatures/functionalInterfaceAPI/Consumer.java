package theory.syntaxAndNewFeatures.functionalInterfaceAPI;

import java.util.Arrays;
import java.util.List;

public class Consumer {
    public static void main(String[] args) {
        List<Integer> numList = Arrays.asList(1,2,3,4);

        // using syntax before java 8
        numList.forEach(new java.util.function.Consumer<Integer>() {
            @Override
            public void accept(Integer integer) {
                System.out.println(integer);
            }
        });

        // using syntax lambda expression
        numList.forEach(s -> System.out.println(s));


    }

}
