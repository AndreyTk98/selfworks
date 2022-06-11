package sw_extends.order.utilits.rounder;

import java.text.DecimalFormat;

public class Rounder {

    public static String rounder(double value, String pattern) {
        DecimalFormat df = new DecimalFormat(pattern);
        return df.format(value);
    }
}
