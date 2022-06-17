package sw_extends.order.utilits.validation;

import java.util.Scanner;

public class ValidateDoubleValue {

    private static final String title1 = " - не число!";
    private static String title2;
    private static String title3;

    public static double validateDoubleValue(Scanner scanner, int titleType) {
        switch (titleType) {
            case 1 -> {
                title2 = "Введите цену!: ";
                title3 = "Неверное значение! Введите цену: ";
            }
            case 2 -> {
                title2 = "Введите вес!: ";
                title3 = "Неверное значение! Введите вес: ";
            }
            case 3 -> {
                title2 = "Введите расстояние!: ";
                title3 = "Неверное значение! Введите расстояние: ";
            }
        }
        while (!scanner.hasNextDouble()) {
            String str = scanner.nextLine().trim();
            System.out.println(str + title1);
            System.out.print(title2);
        }
        double price = scanner.nextDouble();
        while (price <= 0) {
            System.out.print(title3);
            while (!scanner.hasNextDouble()) {
                String str = scanner.nextLine().trim();
                System.out.println(str + title1);
                System.out.print(title2);
            }
            price = scanner.nextDouble();
        }
        return price;

    }
}
