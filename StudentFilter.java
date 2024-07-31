package lab9;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StudentFilter {
    public static void main(String[] args) {
        List<String> students = new ArrayList<>();
        students.add("Sam");
        students.add("John");
        students.add("Sara");
        students.add("Michael");

        students = students.stream()
                .filter(name -> !name.startsWith("S"))
                .collect(Collectors.toList());

        students.forEach(System.out::println);
    }
}
