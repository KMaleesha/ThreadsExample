package generics;

public class Example4 {
    public static void main(String[] args) {
        MyBox<Integer, String, Double> myBox = new MyBox<Integer, String, Double>();
    }
}

// we can pass multiple parameters
class MyBox<T, S, V>{
    T t;
    S s;

    public V foo(V v){
        return v;
    }
}
