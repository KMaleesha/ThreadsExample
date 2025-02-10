package FunctionalProgramming;

import java.util.function.Consumer;

public class Example2 {
    public static void main(String[] args) {
        Consumer<Integer> con = x -> System.out.println(x*2);
        con.accept(10);
    }
}
