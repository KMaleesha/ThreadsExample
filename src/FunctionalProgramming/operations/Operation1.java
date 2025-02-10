package FunctionalProgramming.operations;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class Operation1 {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        for (int i=0; i<list.size(); i++){
            System.out.println(list.get(i));
        }

        for (Integer i : list) {
            System.out.println(i);
        }

        list.forEach(System.out::println);

        Consumer<Integer> consumer = (c) -> System.out.println(c);
        list.forEach(consumer);
    }
}
