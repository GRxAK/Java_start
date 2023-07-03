package homework03;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Program {

    /*
        Пусть дан произвольный список целых чисел.
        1) Нужно удалить из него чётные числа
        2) Найти минимальное значение
        3) Найти максимальное значение
        4) Найти среднее значение
     */
    public static void main(String[] args) {
        System.out.println();

        List<Integer> list = createRandomList();
        System.out.println(list);

        delEvenList(list);
        System.out.print("Без четных элементов: ");
        System.out.println(list);

        int listMin = searchMinList(list);
        System.out.printf("Минимальный элемент списка: %d\n", listMin);

        int listMax = searchMaxList(list);
        System.out.printf("Максимальный элемент списка: %d\n", listMax);

        int listMid = searchMidList(list, listMin, listMax);
        System.out.printf("Элемент списка со средним значением: %d\n", listMid);
    }

    /*
        Создает список рандомной длинной от 10 до 20,
        с рандомными целыми числами от -25 до 25
     */
    public static List<Integer> createRandomList () {

        List<Integer> list = new ArrayList();
        Random random = new Random();

        int length = random.nextInt(11, 21);

        for (int i=0; i < length; i++) {
            list.add(random.nextInt(-25, 26));
        }
        return list;
    }
    
    /*
        удаляеть из списка четные элементы
     */
    public static void delEvenList (List<Integer> list) {
        for (int i=0; i < list.size(); i++) {
            if (list.get(i) != 0 && list.get(i) % 2 == 0) {
                list.remove(i);
                i--;
            }
        }
    }

    /*
        находит MIN элемент списка
    */
    public static int searchMinList (List<Integer> list) {
        int m = list.get(0);
        for (int item : list) {
            if (m > item) {
                m = item;
            }
        }
        return m;
    }

    /*
        находит MAX элемент списка
     */
    public static int searchMaxList (List<Integer> list) {
        int m = list.get(0);
        for (int item : list) {
            if (m < item) {
                m = item;
            }
        }
        return m;
    }

    /*
        находит элемент списка со средним значением
     */
    public static int searchMidList (List<Integer> list, int min, int max) {
        int middle = (min + max) / 2;
        int closest = list.get(0);
        int closestDiff = Math.abs(list.get(0) - middle);

        for (int number : list) {
            int diff = Math.abs(number - middle);
            if (diff < closestDiff) {
                closest = number;
                closestDiff = diff;
            }
        }
        return closest;
    }

}
