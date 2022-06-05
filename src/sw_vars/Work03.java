package sw_vars;

import java.util.Scanner;

public class Work03 {

    static int shtuka;
    static double price;
    static double weight;

    public static void main(String[] args) {


        Scanner products = new Scanner(System.in);

        System.out.println("""
                Цена товара поштучно 24.50 грн., на развес 21.50 грн.
                Выберете тип товара:\s
                1 - Поштучно
                2 - На развес""");

        int type = products.nextInt();

        switch (type) {
            case 1 -> {
                price = 24.50;
                System.out.println("Введите количество штук");
                shtuka = products.nextInt();
                price *= shtuka;
                System.out.printf("Цена товара: %.2f", price);
            }
            case 2 -> {
                price = 21.50;
                System.out.println("Введите вес товара: ");
                weight = products.nextDouble();
                price *= weight;
                System.out.printf("Цена товара: %.2f", price);
            }
            default -> System.out.println("Мужина опта нету!");
        }
    }
}
