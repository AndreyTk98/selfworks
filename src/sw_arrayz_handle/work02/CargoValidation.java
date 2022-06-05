package sw_arrayz_handle.work02;

import java.util.Scanner;

public class CargoValidation {
    public static double validateCargo(Scanner scanner) {
        while (!scanner.hasNextDouble()) {
            String str = scanner.nextLine().trim();
            System.out.printf("\"%s\" - invalid input!\n", str);
            System.out.println("Repeat input according to the example: 00,000");
        }
        double cargo = scanner.nextDouble();
        while (cargo <= 0) {
            System.out.println("Incorrect value! Repeat input according to the example: 00,000");
            while (!scanner.hasNextDouble()) {
                String str = scanner.nextLine().trim();
                System.out.printf("\"%s\" - invalid input!\n", str);
                System.out.println("Repeat input according to the example: 00,000");
            }
            cargo = scanner.nextDouble();
        }
        return cargo;
    }
}