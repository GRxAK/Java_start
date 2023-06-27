package homework01;

import java.util.Scanner;

public class Program {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        while (true) {
            System.out.println("Введите номер задачи:");
            System.out.println("1 - найти треугольное число.");
            System.out.println("2 - вывести числа от 1 до 1000.");
            System.out.println("3 - заверщить программу.");
            int task = Integer.parseInt(scanner.nextLine());
            switch(task) {
                case 1:
                    triangularNumber();
                    break;
                case 2:
                    printTo1Do1000();
                    break;
                case 3:
                    System.out.println("Программа завершена.");
                    return;
                default:
                    System.out.println("Вы ввели некорректное значение!");
                    break;
            }
        }
    }

    /*
        Вычислить n-ое треугольного число (сумма чисел от 1 до n),
        n! (произведение чисел от 1 до n)
     */
    static void triangularNumber() {
        System.out.println("Программа: Триугольное число.");
        System.out.println("Введите число которое нужно высчитать:");
        int n = Integer.parseInt(scanner.nextLine());
        int result = (n * (n + 1)) / 2;
        System.out.printf("Из числа %d, триугольное число = %d \n", n, result);
    }

    /*
        Вывести все числа от 1 до 1000
     */
    static void printTo1Do1000() {
        for (int i=1; i <= 1000; i++) {
            System.out.printf("%d ", i);
        }
        System.out.println();
    }

}
