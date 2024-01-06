package com.epam.utils;

public class StringUtils {
    public static boolean isPositiveNumber(String str) {
         //here magic will happen
        return StringUtils.isNumeric(str) && Integer.parseInt(str) > 0;
    }
}
