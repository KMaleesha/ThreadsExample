package generics;

public class Temp  {
    public static void main(String[] args) {
        FruitBox<Mango> MangoFruitBox = new FruitBox<>(new Mango());
        MangoFruitBox.print();

//        FruitBox<Grape> GrapeFruitBox = new FruitBox<>(new Grape());
//        GrapeFruitBox.print();
    }
}

//if extend 1st class then the interface
// <T extend Thread & Fruit>
// in here Thread is a class fruit is an interface

// fruit and Runnable are both interfaces here
class FruitBox<T extends Fruit & Runnable>{
    T t;

    FruitBox(T t){
        this.t = t;
    }

    public void print(){
        System.out.println(t);
    }
}

interface Fruit{
    void eat();
}

class Mango implements Fruit, Runnable{
    @Override
    public String toString() {
        return "Mango";
    }

    @Override
    public void run() {

    }

    @Override
    public void eat() {

    }
}

class Grape implements Fruit {
    @Override
    public void eat() {}
}
