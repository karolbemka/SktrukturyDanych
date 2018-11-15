package pl.infoshare.structures._4_sets._1_comparing;

import pl.infoshare.structures._1_pojo.Person;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class ComparingExample {

    public static void main(String[] args) {

        List<Student> students = new ArrayList<>();

        students.add(new Student("Maciek", 5));
        students.add(new Student("Karol", 3));
        students.add(new Student("Bolek", 4));

        System.out.println(students);
        Collections.sort(students);


    }
}
