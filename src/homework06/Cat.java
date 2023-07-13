package homework06;

import java.util.HashSet;
import java.util.Objects;

public class Cat {
    String name;
    String breed;
    String coloring;
    Integer age;


    public Cat (String name, String  breed, String coloring, Integer age) {
        this.name = name;
        this.breed = breed;
        this.coloring = coloring;
        this.age = age;
    }

    public Cat (String name) {
        this (name, "", "", null);
    }

    @Override
    public String toString() {
        String a = age == null ? "неизвестен" : String.valueOf(age);
        return String.format("Имя: %s; Порода: %s; Окрас: %s; Возраст: %s год/года/лет.", name, breed, coloring, a);
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Cat cat = (Cat) o;
        return Objects.equals(name, cat.name) && Objects.equals(breed, cat.breed) && Objects.equals(coloring, cat.coloring) && Objects.equals(age, cat.age);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, breed, coloring, age);
    }
}
