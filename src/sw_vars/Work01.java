package sw_vars;

import java.util.Scanner;

public class Work01 {
    static String slovo;
    static int tsifra;
    static char bukva;

    public static void main(String[] args) {

        Scanner tt = new Scanner(System.in);
        System.out.println("Введите целое число");

        slovo = "grizzly";
        tsifra = tt.nextInt();
        bukva = 'k';
        if (tsifra > 25) {
            System.out.println(slovo);
        } else System.out.println(bukva);

        System.out.println("Введите целое число:");
        tsifra = tt.nextInt();
        bukva = 'l';
        slovo = "lavochka";
        switch (tsifra) {
            case 1 -> System.out.println(bukva);
            case 2 -> System.out.println(slovo);
        }
    }
}
