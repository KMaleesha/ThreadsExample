public class LmbdaExExample {
    public static void main(String[] args) {
//        myInterface newInterface =  () -> {
//            myClass.bar();
//        };

        //more simplify the lambda expression
        myInterface newInterface = myClass::bar;


    }
}

@FunctionalInterface
interface myInterface {
    void myMethod();
}

// in the lambda expression in the method body it is done
//class newClass implements myInterface {
//    @Override
//    public void myMethod() {
//        myClass.bar();
//    }
//}

class myClass {
    public static void bar(){
        System.out.println("bar");
    }
}

// if we pass method parameters here the in the functional interface method and the class methods bot should have equal number of parameters

