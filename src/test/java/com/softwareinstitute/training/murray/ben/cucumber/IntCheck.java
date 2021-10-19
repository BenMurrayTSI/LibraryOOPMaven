package com.softwareinstitute.training.murray.ben.cucumber;

public class IntCheck {
    static String check(int expected, int actual) {
        return expected == actual ? "Yes" : "No";
    }
}