package homework02;

/*
    Реализуйте алгоритм сортировки пузырьком числового массива,
    результат после каждой итерации запишите в лог-файл.
 */

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Date;

public class IntegerBubbleSort {

    public static void main(String[] args) {
        int[] arr = {5, 10, 25, 19, 0, 1, -99, -15, 105, 17, 19, 21, 47, -7};
        printArray(arr);
        arr = bubbleSort(arr);
        printArray(arr);
    }

    static void printArray (int[] arr) {
        for (int i : arr) {
            System.out.printf("%d ", i);
        }
        System.out.println();
    }

    static int[] bubbleSort (int[] arr) {
        File logFile = new File("log.txt");
        try (FileWriter fileWriter = new FileWriter(logFile, true)) {
            boolean swapped = false;
            for (int i=0; i < arr.length - 1; i++) {
                for (int o=0; o < arr.length - 1 - i; o++) {
                    if (arr[o] > arr[o + 1]) {
                        int temp = arr[o];
                        arr[o] = arr[o + 1];
                        arr[o + 1] = temp;
                        swapped = true;
                        // fileWriter.write("swapped " + arr[o] + " <-> " + arr[o + 1] + "\n");
                        Date date = new Date();
                        fileWriter.write("OK: " + date.toString() + "\n");
                    }
                }
                // Если внутренний цикл не совершил ни одной замены, то массив уже отсортирован
                if (!swapped) {
                    break;
                }
            }
            fileWriter.flush();
            return arr;
        }
        catch (IOException ex) {
            System.out.println("ERROR: Фаил для записи логов не доступен! " + ex.getMessage());
            return null;
        }
    }
}
