package FunctionalProgramming.operations;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class Operation4 {
    public static void main(String[] args) {
        List<String> name = Arrays.asList("Kamal","Nimal","Sunil","Sunimal", "Amal","Ruwan");

        Predicate<String> predicate = x -> (x.endsWith("mal"));
        name.stream().filter(predicate).forEach(System.out::println);

        //after simplify
        name.stream()
                .filter(x -> x.endsWith("mal"))
                .forEach(System.out::println);
    }
}
