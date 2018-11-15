package pl.infoshare.structures._2_lists._2_exercise;

import pl.infoshare.structures._1_pojo.Person;

import java.util.ArrayList;
import java.util.List;

public class ListExercise1 {

    // TODO: Ćwiczenie 1 - API list
    // TODO: 1. Utwórz nową ArrayList przechowującą typy Person
    // TODO: 2. Utwórz cztery instancje klasy Person, dodaj je do listy
    // TODO: 3. Wypisz na ekran drugi element
    // TODO: 4. Usuń trzeci element z listy
    // TODO: 5. Sprawdź rozmiar
    // TODO: 6. Wypisz wszystkie pełnoletnie osoby
    public static void main(String[] args) {

        List<Person> persons = new ArrayList<>();

        Person maciek = new Person("Maciek", 26);
        Person karol = new Person("Karol", 30);
        Person oskar = new Person("Oskar", 45);
        Person bolek = new Person("bolek", 10);

        persons.add(maciek);
        persons.add(karol);
        persons.add(oskar);
        persons.add(bolek);

        System.out.println(persons.get(1));

        persons.remove(2);

        System.out.println(persons.size());


        for (Person person : persons) {
            if (person.getAge() >= 18) {
                System.out.println(person);
            }
        }
    }
}
