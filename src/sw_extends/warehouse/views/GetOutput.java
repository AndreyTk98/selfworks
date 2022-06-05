package sw_extends.warehouse.views;

public class GetOutput {

    public static void getWeightOutput(String name, String cost, String weight, String price) {
        String show = name + ":" + "\n"
        + "Общая стоимость: " + cost + "\n"
        + "Вес (кг): " + weight +"\n"
        + "Цена за кг: " + price;
        System.out.println(show);
    }

    public static void getQuntyOutput(String name, String cost, int qunty, String price) {
        String show = name + ":" + "\n"
                + "Общая стоимость: " + cost + "\n"
                + "Количество: " + qunty + "\n"
                + "Цена за единицу: " + price;
        System.out.println(show);
    }
}
