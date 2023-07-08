package homework04;

import homework01.Сalculator;
import homework02.CalculatorLog;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

public class CalculatorThree {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String operand = "c";
        String status = "c";
        float result = 0;
        Deque<String> memory = new ArrayDeque();

        File logFile = new File("calculatorLog.txt");
        try (FileWriter fileWriter = new FileWriter(logFile, true)) {

            float x = 0;

            while (true) {

                if (status == "c") {
                    System.out.println("Введите первое число: ");
                    x = Float.parseFloat(scanner.nextLine());
                }

                System.out.println("Введите операцию: +, -, *, /");
                operand = scanner.nextLine();
                memory.add(operand);

                System.out.println("Введите второе число: ");
                float y = Float.parseFloat(scanner.nextLine());
                memory.add(Float.toString(y));

                switch (operand) {
                    case "+":
                        result = Сalculator.sum(x, y);
                        String str1 = Float.toString(result);
                        fileWriter.write(CalculatorLog.printResultWriteLog(x, y, " + ", str1));
                        fileWriter.flush();
                        break;
                    case "-":
                        result = Сalculator.subtraction(x, y);
                        String str2 = Float.toString(result);
                        fileWriter.write(CalculatorLog.printResultWriteLog(x, y, " - ", str2));
                        fileWriter.flush();
                        break;
                    case "*":
                        result = Сalculator.multiplication(x, y);
                        String str3 = Float.toString(result);
                        fileWriter.write(CalculatorLog.printResultWriteLog(x, y, " * ", str3));
                        fileWriter.flush();
                        break;
                    case "/":
                        result = Сalculator.division(x, y);
                        String str4 = Float.toString(result);
                        fileWriter.write(CalculatorLog.printResultWriteLog(x, y, " / ", str4));
                        fileWriter.flush();
                        break;
                    default:
                        String str5 = "Вы ввели некорректный оператор!\n";
                        System.out.println(str5);
                        fileWriter.write(str5);
                        fileWriter.flush();
                }

                System.out.println("Выберетие опцию: ");
                System.out.println("'q'- выход, 'b'- предыдущий резутат, 'c'- сбросить, ENTER продолжить дальше");
                status = scanner.nextLine();

                switch (status) {
                    case "q":
                        System.out.println("Программа завершена.");
                        return;
                    case "c":
                        status = "c";
                        break;
                    case "b":
                        status = "b";
                        if (memory.removeFirst().equals("+")) {
                            System.out.println(memory.getFirst());
                            if (memory.isEmpty()) {
                                x = result;
                            }
                            x = result - Float.parseFloat(memory.removeFirst());
                        }
                        else if (memory.removeFirst().equals("-")) {
                            if (memory.isEmpty()) {
                                x = result;
                            }
                            x = result + Float.parseFloat(memory.removeFirst());
                        }
                        else if (memory.removeFirst().equals("*")) {
                            if (memory.isEmpty()) {
                                x = result;
                            }
                            x = result / Float.parseFloat(memory.removeFirst());
                        }
                        else if (memory.removeFirst().equals("/")) {
                            if (memory.isEmpty()) {
                                x = result;
                            }
                            x = result * Float.parseFloat(memory.removeFirst());
                        }
                        break;
                    default:
                        status = "";
                        x = result;
                        System.out.println(x);
                }
            }
        }
        catch (IOException ex) {
            System.out.println("Невозможно использовать фаил логов! " + ex.getMessage());
        }
    }

}
