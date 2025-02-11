package FunctionalProgramming.operations;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class Operation8 {
    public static void main(String[] args) {
        List<Teacher> list = Arrays.asList(
                new Teacher("kamal", 30),
                new Teacher("Nimal", 61),
                new Teacher("amal", 41),
                new Teacher("sunimal", 73)
        );
        Optional<Teacher> teacherOptional = list.stream()
                .filter(x -> x.age % 2 == 1)
                .filter(x -> x.age > 65)
                .findAny();

        if (teacherOptional.isPresent()) {
            Teacher teacher = teacherOptional.get();
            System.out.println(teacher.name);
        } else {
            System.out.println("No teacher found");
        }
    }
}

class Teacher {
    String name;
    int age;

    Teacher(String name, int age) {
        this.name = name;
        this.age = age;
    }
}
