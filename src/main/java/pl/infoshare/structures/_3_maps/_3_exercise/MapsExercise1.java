package pl.infoshare.structures._3_maps._3_exercise;

import java.util.HashMap;
import java.util.Map;

public class MapsExercise1 {

    // TODO: Ćwiczenie 3 - Map API
    // TODO: 1. Utwórz nową HashMapę nazwę miasta od Integer (liczba mieszkańców)
    // TODO: 2. Dodaj do mapy trzy trójmiejskie miasta wraz z liczba ich mieszkancow
    // TODO: 3. Zaktualizuj liczbę mieszkańców Gdyni do 150
    // TODO: 4. Zaktualizuj liczbę mieszkańców Wejherowa do 36000 tylko jeżeli miasto nie było wcześniej dodane do mapy
    // TODO: 5. Zaktualizuj liczbę mieszkańców Gdańska do 100000 tylko jeżeli miasto nie było wcześniej dodane do mapy
    // TODO: 6. Wypisz na ekran tylko miasta
    // TODO: 7. Wypisz na ekran tylko ilość mieszkańców
    // TODO: 8. Wypisz na ekran dane dla Gdańska, Wejherowa i Warszawy. Jeżeli miasta nie ma wypisz zero.
    public static void main(String[] args) {

        Map<String, Integer> cityToCitizens = new HashMap<>();

        cityToCitizens.put("Gdynia", 250000);
        cityToCitizens.put("Sopot", 30000);
        cityToCitizens.put("Gdansk", 500000);

        cityToCitizens.put("Gdynia", 150);
        cityToCitizens.putIfAbsent("Wejherowo", 36000);
        cityToCitizens.putIfAbsent("Gdansk", 100000);

        System.out.println(cityToCitizens.keySet());
        System.out.println(cityToCitizens.values());
        System.out.println(cityToCitizens.entrySet());

        System.out.println(cityToCitizens.getOrDefault("Gdansk", 0));
        System.out.println(cityToCitizens.getOrDefault("Wejherowo", 0));
        System.out.println(cityToCitizens.getOrDefault("Warszawa", 0));

    }
}
