package FunctionalProgramming.operations;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Operation6 {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(2,5,7,1,4,9,3,10,34,12);

        //natural order
        list.stream()
                .sorted()
                .forEach(System.out::println);

        List<Student> students = Arrays.asList(
                new Student("Maleesha", 26),
                new Student("Tharu", 28),
                new Student("Amal", 10),
                new Student("sunil", 50)
        );

        //natural order by implementing comparable interface
        students.stream()
                .sorted()
                .forEach(System.out::println);

        //comparator
        students.stream()
                .sorted(new StudentComparator())
                .forEach(System.out::println);
    }
}

class Student implements Comparable<Student> {
    String name;
    int age;

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student{" + "name='" + name + '\'' + ", age=" + age + '}';
    }

    @Override
    public int compareTo(Student o) {
        return Integer.compare(this.age, o.age);
    }
}

class StudentComparator implements Comparator<Student> {

    @Override
    public int compare(Student o1, Student o2) {
        return Integer.compare(o1.age, o2.age);
    }
}
