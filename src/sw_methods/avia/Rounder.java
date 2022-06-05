package sw_methods.avia;

import java.text.DecimalFormat;

public class Rounder {
    public static String formatValue(double value, String pattern) {
        DecimalFormat df = new DecimalFormat(pattern);
        return df.format(value);
    }
}
