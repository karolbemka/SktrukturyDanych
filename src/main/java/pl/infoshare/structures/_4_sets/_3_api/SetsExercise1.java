package pl.infoshare.structures._4_sets._3_api;


import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetsExercise1 {

    // TODO: Ćwiczenie 5 - Sets API
    // TODO: 1. Utwórz nowy HashSet przechowujący klasę City (nazwa miasta i populacja).
    // TODO:     Dodaj do niego 4 miasta. Dodaj jedno miasto dwa razy.
    // TODO: 2. Sprawdź rozmiar seta
    // TODO: 3. Utwórz TreeSet i posortuj miasta w kolejności od największego do najmniejszego.
    public static void main(String[] args) {


        HashSet<City> city = new HashSet();

        city.add(new City("Gdynia", 250));
        city.add(new City("Sopot", 30));
        city.add(new City("Gdansk", 500));
        city.add(new City("Gdynia", 250));

        System.out.println(city.size());

        TreeSet<City> cities = new TreeSet<>(city);

        System.out.println(cities.size());

        System.out.println(cities);



    }
}
