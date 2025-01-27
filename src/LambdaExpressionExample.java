public class LambdaExpressionExample {
    public static void main(String[] args) {
        ExampleA a = () -> {
            System.out.println("Hello");
        };
        a.myMethod();

        ExampleB b = () -> 10;
        ExampleB b1 = () -> {
            return 10;
        };
        b.methodB();

        ExampleC c = (x, y) ->
        {
            return 5;
        };
    }
}

interface ExampleA{
    void myMethod();
}

interface ExampleB{
    int methodB();
}

interface ExampleC{
    int add(int a, int b);
}
