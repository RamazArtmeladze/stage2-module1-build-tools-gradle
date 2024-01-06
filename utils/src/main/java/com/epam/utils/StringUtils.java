package com.epam.utils;



public class StringUtils {
    public static boolean isPositiveNumber(String str) {
        if (str == null || str.trim().isEmpty()) {
            return false; // null or empty strings are not positive numbers
        }

        try {
            double num = Double.parseDouble(str);
            return num >= 0;
        } catch (NumberFormatException e) {
            return false; // parsing failed, not a valid number
        }
    }
}
