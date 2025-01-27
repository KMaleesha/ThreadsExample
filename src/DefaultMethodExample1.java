public class DefaultMethodExample1 {
    public static void main(String[] args) {
        MyC myC = new MyC();
        myC.greetMe();
    }
}

interface MyA{
    default void greetMe(){
        System.out.println("Hello World");
    }
}

interface MyB{
    default void greetMe(){
        System.out.println("Hello Maleesha");
    }
}

class MyC implements MyA, MyB{
    @Override
    public void greetMe() {
        MyB.super.greetMe();
    }
}
