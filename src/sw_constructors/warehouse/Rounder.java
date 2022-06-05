package sw_constructors.warehouse;

import java.text.DecimalFormat;

public class Rounder {
    public static String formatValue(double value, String pattern) {
        DecimalFormat df = new DecimalFormat(pattern);
        return df.format(value);
    }
}
