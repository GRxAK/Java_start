package homework02;

import java.util.Scanner;
import homework01.Сalculator;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Date;

public class CalculatorLog {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String status = "";

        File logFile = new File("calculatorLog.txt");
        try (FileWriter fileWriter = new FileWriter(logFile, true)) {
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
                            String str1 = Float.toString(Сalculator.sum(x, y));
                            fileWriter.write(printResultWriteLog(x, y, " + ", str1));
                            fileWriter.flush();
                            break;
                        case "-":
                            String str2 = Float.toString(Сalculator.subtraction(x, y));
                            fileWriter.write(printResultWriteLog(x, y, " - ", str2));
                            fileWriter.flush();
                            break;
                        case "*":
                            String str3 = Float.toString(Сalculator.multiplication(x, y));
                            fileWriter.write(printResultWriteLog(x, y, " * ", str3));
                            fileWriter.flush();
                            break;
                        case "/":
                            String str4 = Float.toString(Сalculator.division(x, y));
                            fileWriter.write(printResultWriteLog(x, y, " / ", str4));
                            fileWriter.flush();
                            break;
                        default:
                            String str5 = "Вы ввели некорректный оператор!\n";
                            System.out.println(str5);
                            fileWriter.write(str5);
                            fileWriter.flush();
                    }
                }
                System.out.println("Для продолжение нажмите 'Enter',");
                System.out.println("для выхода из программы введите любой символ.");
                status = scanner.nextLine();
            }
        }
        catch (IOException ex) {
            System.out.println("Невозможно использовать фаил логов! " + ex.getMessage());
        }
    }

    public static String printResultWriteLog (float x, float y, String o, String str) {
        StringBuilder result = new StringBuilder(128);
        Date date = new Date();
        result.append(x)
                .append(o)
                .append(y)
                .append(" = ")
                .append(str)
                .append("\n");

        System.out.printf(result.toString());

        result.insert(0, "OK: ")
                .insert(1, date.toString())
                .insert(2, " ");
        return result.toString();
    }
}
