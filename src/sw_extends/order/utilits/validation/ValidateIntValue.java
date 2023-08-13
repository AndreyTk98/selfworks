package sw_extends.order.utilits.validation;

import java.util.Scanner;

public class ValidateIntValue {

    private static String title1;
    private static String title2;
    private static String title3;

    public static int validateIntValue(Scanner scanner, int titleType){

        switch (titleType) {
            case 1 -> {
                title1 = " - не число!";
                title2 = "Выберите нужное число!";
                title3 = "Неверное значение! Выберите нужное число!";
            }
            case 2 -> {
                title1 = "- не число!";
                title2 = "Введите количество!: ";
                title3 = "Неверное значение! Введите количество: ";
            }
        }

        while (!scanner.hasNextInt()) {
            String str = scanner.nextLine().trim();
            System.out.println(str + title1);
            System.out.print(title2);
        }
        int quantity = scanner.nextInt();
        while (quantity <= 0) {
            System.out.println(title3);
            while (!scanner.hasNextInt()) {
                String str = scanner.next().trim();
                System.out.println(str + title1);
                System.out.println(title2);
            }
            quantity = scanner.nextInt();
        }
        return quantity;
    }
}
