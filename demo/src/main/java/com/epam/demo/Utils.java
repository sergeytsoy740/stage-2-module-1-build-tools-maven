package com.epam.demo;

import java.util.List;
import com.epam.utils.StringUtils;

public class Utils {
    public static boolean isAllPositiveNumbers(List<String> args) {

        for (String e : args) {
            if (!StringUtils.isPositiveNumber(e)) {
                return false;
            }
        }
        return true;
    }
}