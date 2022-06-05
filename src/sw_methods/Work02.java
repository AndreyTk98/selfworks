package sw_methods;

import java.util.Scanner;

public class Work02 {

    static int whiskey;
    static int box;
    static int whiskeyInBox;
    static double broken = 0.05;
    static int allBroken;

    public static void main(String[] args) {
        title();
        doInput();
        handleDate();
        showAllBroken();
    }

    private static void doInput() {
        Scanner puting = new Scanner(System.in);
        System.out.println("Бутылок в одном ящике");
        whiskeyInBox = puting.nextInt();
        System.out.println("Ящиков");
        box = puting.nextInt();
    }

    private static void handleDate() {
        whiskey = findWhiskey(whiskeyInBox, box);
        allBroken = findAllBroken(whiskey, broken);
    }
    private static int findWhiskey(int whiskeyInBox, int box) {
        whiskey = whiskeyInBox * box;
        return whiskey;
    }
    private static int findAllBroken(int whiskey, double broken){
        allBroken = (int) (whiskey * broken);
        return allBroken;
    }
    private static void title(){
        System.out.println("Может быть разбито не больше 5%");
    }
    private static void showAllBroken() {
        System.out.println("Всего бутылок: " + whiskey + "\nВсего разбито: " + allBroken);
    }


}
