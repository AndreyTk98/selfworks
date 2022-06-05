package sw_arrayz_handle.work01;

import java.util.Scanner;

public class PriceValidation {
    public static double validatePrice(Scanner scanner) {
        while (!scanner.hasNextDouble()) {
            String str = scanner.nextLine().trim();
            System.out.printf("\"%s\" - invalid input!\n", str);
            System.out.println("Repeat input according to the example: 00,00");
        }
        double price = scanner.nextDouble();
        while (price <= 0) {
            System.out.println("Incorrect value! Repeat input according to the example: 00,00");
            while (!scanner.hasNextDouble()) {
                String str = scanner.nextLine().trim();
                System.out.printf("\"%s\" - invalid input!\n", str);
                System.out.println("Repeat input according to the example: 00,00");
            }
            price = scanner.nextDouble();
        }
        return price;
    }
}