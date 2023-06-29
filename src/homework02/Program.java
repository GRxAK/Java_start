package homework02;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Введите номер задачи:");
            System.out.println("1 - создать WHERE запросс.");
            System.out.println("2 - сортировка пузырьком.");
            System.out.println("3 - калькулятор с записей логов.");
            System.out.println("4 - заверщить программу.");
            int task = Integer.parseInt(scanner.nextLine());
            switch(task) {
                case 1:
                    SQLQueryBuilder task1 = new SQLQueryBuilder();
                    System.out.println();
                    task1.main();
                    System.out.println();
                    break;
                case 2:
                    IntegerBubbleSort task2 = new IntegerBubbleSort();
                    System.out.println();
                    task2.main(new String[]{});
                    System.out.println();
                    break;
                case 3:
                    CalculatorLog task3 = new CalculatorLog();
                    System.out.println();
                    task3.main(new String[]{});
                    System.out.println();
                    break;
                case 4:
                    System.out.println("Программа завершена.");
                    return;
                default:
                    System.out.println("Вы ввели некорректное значение!");
                    break;
            }
        }
    }
}
