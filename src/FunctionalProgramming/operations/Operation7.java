package FunctionalProgramming.operations;

import java.util.Optional;

public class Operation7 {
    public static void main(String[] args) {
        Optional<Person> p = Person.getPerson();
        if(p.isPresent()) {
            System.out.println(p.get());
        }else{
            System.out.println("No person found");
        }
    }
}

class Person {
    String name;
    int age;

    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public static Optional<Person> getPerson() {
        return Optional.of(new Person("Maleesha", 26));
    }
}
