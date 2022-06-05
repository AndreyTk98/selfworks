package sw_extends.store.utils.validation;

import java.util.Scanner;

public class ValidateChose {
    public static int validateChose(Scanner scanner) {
        int chose = scanner.nextInt();
        while (chose < 0 || chose > 3) {
            System.out.println("Неверное значение! Ввыберите между 1 и 2!!!: ");
        }
        return chose;
    }
}