package homework06;

import java.util.HashSet;

public class Program {
    public static void main(String[] args) {
        HashSet<Cat> cats = new HashSet();

        Cat cat1 = new Cat("Барсик", "Британец", "Серый", 5);
        Cat cat2 = new Cat("Маруська", "Уличный кот", "Серобурокозявчетый", 13);
        Cat cat3 = new Cat("Батон", "Перс", "Рыжий", 7);
        Cat cat4 = new Cat("Барсик", "Британец", "Серый", 5);
        Cat cat5 = new Cat("Толик", "Мейн-кун", "Коричневый", 3);
        Cat cat6 = new Cat("Барсик", "Британец", "Серый", 5);
        Cat cat7 = new Cat("Люси", "Сиамская", "Черно-белый", 1);
        Cat cat8 = new Cat("Жулик", "Сфинкс", "Лысый", 4);
        Cat cat9 = new Cat("Люси", "Сиамская", "Черно-белый", 1);
        Cat cat10 = new Cat("Марс");
        Cat cat11 = new Cat("Наполеон");
        Cat cat12 = new Cat("Марс");

        cats.add(cat1);
        cats.add(cat2);
        cats.add(cat3);
        cats.add(cat4);
        cats.add(cat5);
        cats.add(cat6);
        cats.add(cat7);
        cats.add(cat8);
        cats.add(cat9);
        cats.add(cat10);
        cats.add(cat11);
        cats.add(cat12);
        cats.add(new Cat("Барсик", "Британец", "Серый", 5));

        System.out.println(cat1.equals(cat4));

        int n = 1;
        for (Cat item : cats) {
            System.out.printf("%d. | %s \n", n++, item);
        }
    }
}
