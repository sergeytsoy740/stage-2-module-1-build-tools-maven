package com.epam.utils;

import org.apache.commons.lang3.math.NumberUtils;

public class StringUtils {
    public static boolean isPositiveNumber(String str) {
        boolean isPositive = false;

        if (str == null) {
            return isPositive;
        }

        if (str.startsWith("0")) {
            return isPositive;
        }

        if (NumberUtils.toDouble(str) > 0) {
            isPositive = true;
        }

        return isPositive;
    }
}
