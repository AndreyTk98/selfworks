package sw_extends.store.utils.validation;

import java.util.Scanner;

public class ValidateWeight {

    public static double validateWeightInput(Scanner scanner) {
        while (!scanner.hasNextDouble()) {
            String str = scanner.nextLine().trim();
            System.out.printf("\"%s\" - не число!\n", str);
            System.out.print("Введите вес!: ");
        }
        double price = scanner.nextDouble();
        while (price <= 0) {
            System.out.print("Неверное значение! Введите вес: ");
            while (!scanner.hasNextDouble()) {
                String str = scanner.nextLine().trim();
                System.out.printf("\"%s\" - не число!\n", str);
                System.out.print("Введите вес!: ");
            }
            price = scanner.nextDouble();
        }
        return price;
    }
}
