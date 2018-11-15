package pl.infoshare.structures._4_sets._3_api;

import java.util.Comparator;
import java.util.Objects;

public class City implements Comparable<City> {

    private String name;
    private int population;

    public City(String name, int population){
        this.name = name;
        this.population = population;
    }

    public String getName() {
        return name;
    }

    public int getPopulation() {
        return population;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        City city = (City) o;
        return population == city.population &&
                Objects.equals(name, city.name);
    }

    @Override
    public String toString() {
        return "City{" +
                "name='" + name + '\'' +
                ", population=" + population +
                '}';
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, population);
    }


    @Override
    public int compareTo(City o) {
        if (population > o.population) {
            return 1;
        }
        if (population < o.population) {
            return -1;
        }
        return 0;
    }
}
