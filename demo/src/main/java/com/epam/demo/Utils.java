package com.epam.demo;


import java.util.List;

public class Utils {
    public static boolean isAllPositiveNumbers(List<String> args) {
        for (String str : args) {
            if (!isPositiveNumber(str)) {
                return false;
            }
        }
        return true;
    }

    private static boolean isPositiveNumber(String str) {
        try {
            double num = Double.parseDouble(str);
            return num >= 0;
        } catch (NumberFormatException e) {
            return false;
        }
    }
}