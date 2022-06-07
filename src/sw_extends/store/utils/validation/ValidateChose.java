package sw_extends.store.utils.validation;

import java.util.Scanner;

public class ValidateChose {
    public static int validateChose(Scanner scanner) {
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