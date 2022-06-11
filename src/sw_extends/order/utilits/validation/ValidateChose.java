package sw_extends.order.utilits.validation;

import java.util.Scanner;

public class ValidateChose {
    public static int validateChose(Scanner scanner) {
        while (!scanner.hasNextInt()) {
            String str = scanner.nextLine().trim();
            System.out.printf("\"%s\" - не число!\n", str);
            System.out.println("Ввыберите нужное число!");
        }
        int choose = scanner.nextInt();
        while (choose <= 0){
            System.out.println("Неверное значение! Ввыберите нужное число!");
            while (!scanner.hasNextInt()) {
                String str = scanner.next().trim();
                System.out.printf("\"%s\" - не число!\n", str);
                System.out.println("Ввыберите нужное число!");
            }
            choose = scanner.nextInt();
        }
        return choose;
    }
}