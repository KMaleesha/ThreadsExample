package LambdaExpressions;

public class StaticMethRef {
    public static void main(String[] args) {

        A a = StaticMethRef::addNum;
        a.study();
    }

    public static void addNum(){
        int x = 10;
        int y = 20;
        System.out.println(x + y);
    }
}

@FunctionalInterface
interface A {
    void study();
}
