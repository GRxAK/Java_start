package homework01;

import java.util.Scanner;

public class Сalculator {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String status = "";

        while (true) {
            if (status != "") return;
            else {
                System.out.println("Введите первое число: ");
                float x = Float.parseFloat(scanner.nextLine());

                System.out.println("Введите операцию: ");
                System.out.println("'+' сложение,  '-' вычитане");
                System.out.println("'*' умножение, '/' деление");
                String operand = scanner.nextLine();

                System.out.println("Введите второе число: ");
                float y = Float.parseFloat(scanner.nextLine());

                switch (operand) {
                    case "+":
                        System.out.printf("%f + %f = %f \n", x, y, sum(x, y));
                        break;
                    case "-":
                        System.out.printf("%f + %f = %f \n", x, y, subtraction(x, y));
                        break;
                    case "*":
                        System.out.printf("%f + %f = %f \n", x, y, multiplication(x, y));
                        break;
                    case "/":
                        System.out.printf("%f + %f = %f \n", x, y, division(x, y));
                        break;
                    default:
                        System.out.println("Вы ввели некорректный оператор!");
                }
            }
            System.out.println("Для продолжение нажмите 'Enter',");
            System.out.println("для выхода из программы введите любой символ.");
            status = scanner.nextLine();
        }

    }

    static float sum (float x, float y) {
        float result = x + y;
        return result;
    }

    static float subtraction (float x, float y) {
        float result = x - y;
        return  result;
    }

    static float multiplication (float x, float y) {
        float result = x * y;
        return  result;
    }

    static float division (float x, float y) {
        float result = x / y;
        return  result;
    }

}
