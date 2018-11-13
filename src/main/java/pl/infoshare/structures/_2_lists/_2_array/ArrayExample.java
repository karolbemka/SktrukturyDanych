package pl.infoshare.structures._2_lists._2_array;

import pl.infoshare.structures._1_pojo.Person;

import java.util.Arrays;

public class ArrayExample {

    public static void main(String[] args) {
        ArrayWrapper arrayWrapper = new ArrayWrapper();
        arrayWrapper.add(new Person("Maciej", 26));
        arrayWrapper.add(new Person("Anastazja", 23));
        arrayWrapper.add(new Person("Mikołaj", 22));

        System.out.println(arrayWrapper);
    }
}
