package sw_vars;

import java.util.Scanner;

public class Work02 {

    static double num1;
    static double num2;
    static double num3;

    public static void main(String[] args) {
        Scanner dd = new Scanner(System.in);
        System.out.println("Введите 1е число");
        num1 = dd.nextInt();
        System.out.println("Введите 2е число");
        num2 = dd.nextInt();
        num3 = num1 + num2;
        System.out.println(num1 + "+" + num2 + "=" + num3);
        num3 = num1 - num2;
        System.out.println(num1 +  "-" + num2 + "=" + num3);
    }

}
