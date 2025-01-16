package generics;

public class Example2 {
    public static void main(String[] args) {
        Animal<Dog> dog = new Animal<Dog>(new Dog());
        Animal<Cat> cat = new Animal<Cat>(new Cat());

        dog.Print();
        cat.Print();
    }
}

class Animal<T> {
    T t;

    public Animal(T t) {
        this.t = t;
    }

    public void Print(){
        System.out.println(t);
    }
}

class Dog{
    @Override
    public String toString() {
        return "Dog";
    }
}

class Cat{
    @Override
    public String toString() {
        return "Cat";
    }
}
