package homework05;


public class Program {
    public static void main(String[] args) {
        Phonebook phonebook = new Phonebook();

        phonebook.add("Пупкин", "555000");
        phonebook.add("Андеев", "123123");
        phonebook.add("Волков", "900800");
        phonebook.add("Яковлев", "470074");
        phonebook.add("Яковлев", "074470");
        phonebook.add("Яковлев", "117744");
        phonebook.add("Лебедев", "101010");
        phonebook.add("Агеев", "000333");

        System.out.println(phonebook.get("Яковлев"));
    }
}
