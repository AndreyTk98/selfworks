package sw_extends.store.views;

public class Output {

    public static void getWeightOutput(String name, String cost, String weight, String price) {
        String show = name + ":" + "\n"
                + "Общая стоимость: " + cost + "\n"
                + "Вес (кг): " + weight + "\n"
                + "Цена за кг: " + price;
        System.out.println(show);
    }

    public static void getQuantityOutput(String name, String cost, int quantity, String price) {
        String show = name + ":" + "\n"
                + "Общая стоимость: " + cost + "\n"
                + "Количество: " + quantity + "\n"
                + "Цена за единицу: " + price;
        System.out.println(show);
    }

}
