package sw_constructors.warehouse;

import java.util.Scanner;

public class Validation {
    public static double validate(Scanner scanner) {
        while (!scanner.hasNextDouble()) {
            String str = scanner.nextLine().trim();
            System.out.printf("\"%s\" - Не число!\n", str);
            System.out.println("Повторить ввод по примеру: 00,000");
        }
        double value = scanner.nextDouble();
        while (value <= 0) {
            System.out.println("Неверное значение! Повторить ввод по примеру: 00,000");
            while (!scanner.hasNextDouble()) {
                String str = scanner.nextLine().trim();
                System.out.printf("\"%s\" - Неверный ввод!\n", str);
                System.out.println("Повторить ввод по примеру: 00,000");
            }
            value = scanner.nextDouble();
        }
        return value;

    }
}
