package theory.syntaxAndNewFeatures.functionalInterfaceAPI;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Function {
    public static void main(String[] args) {
        List<Integer> numList = Arrays.asList(1,2,3,4,5,6);
        Stream<Integer> numStream = numList.stream();
        Stream<String> numStream2 = numStream.map(x -> {
            System.out.println(x.getClass().getName());
            return String.valueOf(x);
        });

        numStream2.forEach(x -> {
            System.out.println(x.getClass().getName());;System.out.println(x);});

    }
}
