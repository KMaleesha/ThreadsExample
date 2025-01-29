package LambdaExpressions;

public class ObjectMethRef {
    public static void main(String[] args) {
        Student student = new Student();
        B b = student::sleep;
        b.read();
    }
}

@FunctionalInterface
interface B {
    void read();
}

class Student {
    public void sleep(){
        System.out.println("sleep");
    }
}
