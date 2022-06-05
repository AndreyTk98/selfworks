package sw_arrayz_handle;

import java.util.Scanner;

public class Work02 {
    static String[][] emploers;
    static int days;

    public static void main(String[] args) {

        emploers = new String[][] { {"Игорь", "Петя", "Даша"}, {"Валя", "Лера", "Оксана"} };

        Scanner nums = new Scanner(System.in);
        System.out.println("Выберете номер рабочего дня");
        days = nums.nextInt();

        switch (days) {
            case 1, 3, 5 -> System.out.println("Нечётный день, работники: " + " " + emploers[0][0]
                   + ", " + emploers[0][1] + ", " + emploers[0][2]);
            case 2, 4, 6 -> System.out.println("Чётный день, работники:" + " " + emploers[1][0]
                    + ", " + emploers[1][1] + ", " + emploers[1][2]);
            case 7 -> System.out.println("Выходной!");
            default -> System.out.println("Шестидневная рабочая неделя!");
        }
    }
}
