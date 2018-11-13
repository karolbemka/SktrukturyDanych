package pl.infoshare.structures._2_lists._2_array;

import pl.infoshare.structures._1_pojo.Person;

import java.util.Arrays;


// TODO: Zaimplementuj następujące metody
// TODO: 1. Pobranie konkretnego elementu
// TODO: 2. Sprawdzenie czy tablica jest pusta
// TODO: 3. Pobranie ilości wszystkich elementów
// TODO: 4. Sprawdzenie czy podany element istnieje
public class ArrayWrapper {

    private Person[] persons = new Person[]{};

    public void add(Person person) {
        persons = increaseArraySize(persons);
        persons[persons.length - 1] = person;
    }

    private Person[] increaseArraySize(Person[] currentArray) {
        Person[] increasedArray = new Person[currentArray.length + 1];
        for (int i = 0; i < currentArray.length; i++) {
            increasedArray[i] = currentArray[i];
        }

        return increasedArray;
    }

    @Override
    public String toString() {
        return "ArrayWrapper{" +
                "persons=" + Arrays.toString(persons) +
                '}';
    }
}
