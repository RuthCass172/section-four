package com.zinkworks;

public class AreaCalculator {
    public static double area(double radius) {
        double result = radius * radius * Math.PI;
        if (radius < 0) {
            result = -1.0;
        }
        return result;
    }

    public static double area(double x, double y) {
        double result = x * y;
        if (x < 0 || y < 0) {
            result = -1.0;
        }
        return result;
    }
}
