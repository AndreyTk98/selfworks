package sw_constructors.cargo.utils;

import java.util.Scanner;

public class Validator {

    public static String validateName(Scanner scanner) {
        String str = scanner.nextLine().trim();
        while (str.isEmpty()) {
            System.out.println("Пусто! Введите наименование товара: ");
            str = scanner.nextLine().trim();
        }
        return str;
    }

    public static double validateQuntyInput(Scanner scanner) {
        while (!scanner.hasNextDouble()) {
            String str = scanner.nextLine().trim();
            System.out.printf("\"%s\" - не число!\n", str);
            System.out.println("Введите вес!: ");
        }
        double price = scanner.nextDouble();
        while (price <= 0) {
            System.out.println("Неверное значение! Введите вес: ");
            while (!scanner.hasNextDouble()) {
                String str = scanner.nextLine().trim();
                System.out.printf("\"%s\" - не число! \n", str);
                System.out.print("Введите вес!: ");
            }
            price = scanner.nextDouble();
        }
        return price;
    }
}

