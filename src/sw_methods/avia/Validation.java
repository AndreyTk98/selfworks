package sw_methods.avia;

import java.util.Scanner;

public class Validation {

    public static double validate(Scanner scanner) {
        while (!scanner.hasNextDouble()) {
            String str = scanner.nextLine().trim();
            System.out.printf("\"%s\" - Not a number\n!\n", str);
            System.out.println("Repeat input according to the example: 00,00");
        }
        double wight = scanner.nextDouble();
        while (wight <= 0){
            System.out.println("Incorrect value! Repeat input according to the example: 00,00");
            while (!scanner.hasNextDouble()) {
                String str = scanner.nextLine().trim();
                System.out.printf("\"%s\" - invalid input!\n", str);
                System.out.println("Repeat input according to the example: 00,00");
            }
            wight = scanner.nextDouble();
        }
        return wight;
    }
}
