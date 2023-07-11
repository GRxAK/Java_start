package homework05;

import java.util.ArrayList;
import java.util.HashMap;

public class Phonebook {

    private HashMap<String, ArrayList> phonebook;
    public Phonebook () {
        phonebook = new HashMap<>();
    }

    public void add (String surname, String phone) {
        if (phonebook.containsKey(surname)) {
            phonebook.get(surname).add(phone);
        } else {
            ArrayList<String> list = new ArrayList();
            list.add(phone);
            phonebook.put(surname, list);
        }
    }

    public ArrayList get (String surname) {
        ArrayList<String> phone = phonebook.get(surname);
        return phone;
    }
}
