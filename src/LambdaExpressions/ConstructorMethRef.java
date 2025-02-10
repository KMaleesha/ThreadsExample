package LambdaExpressions;

public class ConstructorMethRef {
    public static void main(String[] args) {
        C c = Teacher::new;
        Teacher t = c.sing();
        t.teach();
        System.out.println(t);
    }
}

@FunctionalInterface
interface C {
    Teacher sing();
}

class Teacher{

    Teacher(){
        System.out.println("Teacher is teaching java");
    }

    public void teach() {
        System.out.println("I am a Teacher");
    }
}
