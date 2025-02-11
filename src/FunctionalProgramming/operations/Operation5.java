package FunctionalProgramming.operations;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

public class Operation5 {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1,2,3,4,5,6,7,8,9,10);

        Function<Integer,Integer> function = x -> x * x;
        list.stream().map(function).forEach(System.out::println);

        //after simplify
        list.stream()
                .map(x -> x * x)
                .forEach(System.out::println);

        //filter the even numbers
        list.stream()
                .map(x -> x * x)
                .filter(x -> x % 2 == 0)
                .forEach(System.out::println);
    }
}
