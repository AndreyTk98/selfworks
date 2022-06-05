package sw_arrayz_handle;

public class Work01 {

    static double[] temperature;
    static int num;

    public static void main(String[] args) {
        temperature = new double[] {0.5, -2.8, -4.1, -3.2, -1.6, -0.6, 1.1, 2.3, 3.4, -4.2};
        for (double c : temperature) {
            num++;
            System.out.println("Температура " + num + "го числа: " + c);
        }
    }
}
