package pl.infoshare.structures._2_lists._1_warmup;

import pl.infoshare.structures._1_pojo.Person;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ListExercise1 {

    // TODO: Ćwiczenie 1 - API list
    // TODO: 1. Utwórz nową ArrayList przechowującą typy Person
    // TODO: 2. Utwórz cztery instancje klasy Person, dodaj je do listy
    // TODO: 3. Wypisz na ekran drugi element
    // TODO: 4. Usuń trzeci element z listy
    // TODO: 5. Sprawdź rozmiar tablicy
    // TODO: 6. Wypisz wszystkie pełnoletnie osoby
    public static void main(String[] args) {
        List<Person> persons = Arrays.asList(
                new Person("Maciek", 26),
                new Person("Anastazja", 23),
                new Person("Mikołaj", 22),
                new Person("Paweł", 3)
        );

        System.out.println(persons.get(1));
        persons.remove(2);
        System.out.println("List size: " + persons.size());
        for (Person person : persons) {
            if (person.getAge() >= 18) {
                System.out.println(person);
            }
        }
    }
}
