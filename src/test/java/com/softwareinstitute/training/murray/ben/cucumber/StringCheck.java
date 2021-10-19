package com.softwareinstitute.training.murray.ben.cucumber;

public class StringCheck {
    static String check(String expected, String actual) {
        return expected.equals(actual) ? "Yes" : "No";
    }
}
