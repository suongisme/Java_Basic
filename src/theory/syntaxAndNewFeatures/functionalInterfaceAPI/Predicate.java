package theory.syntaxAndNewFeatures.functionalInterfaceAPI;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.stream.Stream;

public class Predicate {
    public static void main(String[] args) {
        List<Integer> numList = Arrays.asList(1,2,3,30,4,5,798,1);
        Stream<Integer> numStream = numList.stream();

        Stream<Integer> numStream2 = numStream.filter(new java.util.function.Predicate<Integer>() {
            @Override
            public boolean test(Integer integer) {
                return integer >= 5;
            }
        });
        numStream2.forEach(new Consumer<Integer>() {
            @Override
            public void accept(Integer integer) {
                System.out.println(integer);
            }
        });

    }
}
