package generics;

public class ExampleOne {
    public static void main(String[] args) {
        Box<Apple> appleBox = new Box<>(new Apple());
        appleBox.print();
        Box<Orange> orangeBox = new Box<>(new Orange());
        orangeBox.print();
        Box<Banana> bananaBox = new Box<>(new Banana());
        bananaBox.print();
    }
}

class Box<T>{
    T t;

    public Box(T t){
        this.t = t;
    }

    public void print(){
        System.out.println(t);
    }
}

class Apple{
    @Override
    public String toString(){
        return "Apple";
    }
}

class Orange{
    @Override
    public String toString(){
        return "Orange";
    }
}

class Banana{
    @Override
    public String toString(){
        return "Banana";
    }
}
