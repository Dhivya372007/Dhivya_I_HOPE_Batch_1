package com.parkinglot.util;

public class Validator {

    public static boolean isValidNumber(String number) {
        return number != null && number.length() >= 5;
    }
}
