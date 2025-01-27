public class DefaultMethodExample {
    public static void main(String[] args) {
        B b = new B();
        b.greet();
        b.sayGoodBye();
    }
}

interface A{
    default void greet(){
        System.out.println("Hello");
    }

    default void sayGoodBye(){
        System.out.println("Good Bye");
    }
}
class B implements A{}
