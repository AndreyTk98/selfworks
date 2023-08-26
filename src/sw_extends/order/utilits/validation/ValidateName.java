package sw_extends.order.utilits.validation;

import java.util.Scanner;

public class ValidateName {

    public static String validateName(Scanner scanner) {
        String str = scanner.nextLine().trim();
        while (str.isEmpty()) {
            System.out.println("Пусто! Введите наименование: ");
            str = scanner.nextLine().trim();
        }
        return str;
    }
}
