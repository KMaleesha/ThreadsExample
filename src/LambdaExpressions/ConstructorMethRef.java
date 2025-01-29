package LambdaExpressions;

public class ConstructorMethRef {
    public static void main(String[] args) {
        C c = Teacher::new;
        c.sing();
    }
}

@FunctionalInterface
interface C {
    void sing();
}

class Teacher{

    Teacher(){

    }

    public void teach() {
        System.out.println("Teacher");
    }
}
