package sw_extends.warehouse.utils;

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
    public static int validateQuantityInput(Scanner scanner){
        while (!scanner.hasNextInt()) {
            String str = scanner.nextLine().trim();
            System.out.printf("\"%s\" - не целое число!\n", str);
            System.out.print("Введите целое число!: ");
        }
        int quantity = scanner.nextInt();
        while (quantity <= 0) {
            System.out.println("Неверное значение! Введите положительное число: ");
            while (!scanner.hasNextInt()) {
                String str = scanner.next().trim();
                System.out.printf("\"%s\" - не целое число!\n", str);
                System.out.println("Введите количество!: ");
            }
            quantity = scanner.nextInt();
        }
        return quantity;
    }

    public static double validatePriceInput(Scanner scanner){
        while (!scanner.hasNextDouble()) {
            String str = scanner.nextLine().trim();
            System.out.printf("\"%s\" - не число!\n", str);
            System.out.print("Введите цену!: ");
        }
        double price = scanner.nextDouble();
        while (price <= 0) {
            System.out.print("Неверное значение! Введите цену: ");
            while (!scanner.hasNextDouble()) {
                String str = scanner.nextLine().trim();
                System.out.printf("\"%s\" - не число!\n", str);
                System.out.print("Введите цену!: ");
            }
            price = scanner.nextDouble();
        }
        return price;
    }
    public static int validateChoose (Scanner scanner){
        while (!scanner.hasNextInt()) {
            String str = scanner.nextLine().trim();
            System.out.printf("\"%s\" - не число!\n", str);
            System.out.println("Ввыберите между 1 и 2: ");
        }
        int choose = scanner.nextInt();
        while (choose <= 0 || choose >= 3){
            System.out.println("Неверное значение! Ввыберите между 1 и 2: ");
            while (!scanner.hasNextInt()) {
                String str = scanner.next().trim();
                System.out.printf("\"%s\" - не число!\n", str);
                System.out.println("Ввыберите между 1 и 2: ");
            }
            choose = scanner.nextInt();
        }
        return choose;
    }
}

