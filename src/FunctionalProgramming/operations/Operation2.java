package FunctionalProgramming.operations;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class Operation2 {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

//        Consumer<Integer> consumer = (x) -> {
//            x = x*2;
//            System.out.println(x);
//        };
//        list.forEach(consumer);

        list.stream().forEach(x -> {
            x = x*2;
            System.out.println(x);
        });

//        list.forEach(x -> {
//            x = x*2;
//            System.out.println(x);
//        });
    }
}
