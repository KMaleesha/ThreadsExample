public class DefaultMethodExample1 {
    public static void main(String[] args) {
        MyC myC = new MyC();
        myC.greetMe();
        MyD.greetMe();
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

interface MyD{
    static void greetMe(){
        System.out.println("Hello Tharuprabha");
    }
}

class MyC implements MyA, MyB{
    @Override
    public void greetMe() {
        MyB.super.greetMe();
    }
}
