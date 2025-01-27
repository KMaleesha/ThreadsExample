public class InnerClassExample {
    public static void main(String[] args) {

        // inline implementation or implement as an anonymous class

        interA a = new interA() {
            @Override
            public void sayHello() {
                System.out.println("Hello");
            }

            @Override
            public void sayGoodbye() {
                System.out.println("Goodbye");
            }

        };
    }
}

interface interA{
    void sayHello();
    void sayGoodbye();
}

//class interB implements interA{
//    @Override
//    public void sayHello() {
//        System.out.println("Hello");
//    }
//}
