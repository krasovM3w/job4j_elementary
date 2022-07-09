package ru.job4j.condition;

public class Point {
    public static double distance(int x1, int y1, int x2, int y2) {
       double rsl = Math.sqrt(Math.pow(x1 - x2, 2) + Math.pow(y1 - y2, 2));
        return rsl;
    }

    public static void main(String[] args) {
        double result = Point.distance(4, 2, 6, 3);
        double result2 = Point.distance(7, 4, 5, 9);
        System.out.println("result (4, 2) to (6, 3) " + result);
        System.out.println("result (7, 4) to (5, 9) " + result2);
    }
}
