package homework04;

import java.util.LinkedList;
import java.util.Random;

public class ReversList {
    public static void main(String[] args) {
        LinkedList list = new LinkedList<>();
        list = createList();
        System.out.println(list);
        list = reversList(list);
        System.out.println(list);
    }

    /*
        Пусть дан LinkedList с несколькими элементами.
        Реализуйте метод, который вернет “перевернутый” список.
     */
    public static LinkedList<Integer> createList () {
        LinkedList list = new LinkedList<>();
        Random random = new Random();
        for (int i=0; i < 10; i++) {
            list.add(random.nextInt(0, 26));
        }
        return list;
    }
    public static LinkedList<Integer> reversList (LinkedList<Integer> list) {
        LinkedList<Integer> reversList = new LinkedList<>();
        for (Integer item : list) {
            reversList.addFirst(item);
        }
        return reversList;
    }
}
