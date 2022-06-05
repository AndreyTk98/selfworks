package sw_extends.store.utils.validation;

import java.util.Scanner;

public class VaidateName {

    public static String validateName(Scanner scanner) {
        String str = scanner.nextLine().trim();
        while (str.isEmpty()) {
            System.out.println("Пусто! Введите наименование товара: ");
            str = scanner.nextLine().trim();
        }
        return str;
    }
}
