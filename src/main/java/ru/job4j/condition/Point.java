package ru.job4j.condition;

public class Point {
    public static double distance(int x1, int y1, int x2, int y2) {
        double rsl = Math.sqrt(Math.pow((x2 - x1), 2) + Math.pow((y2 - y1), 2));
        return rsl;
    }

    public static void main(String[] args) {
        double result = Point.distance(1, 0, 4, 3);
        System.out.println("result (1, 0) to (4, 3) " + result);
        result = Point.distance(1, 6, 3, 4);
        System.out.println("result (1, 6) to (3, 4) " + result);
        result = Point.distance(11, 5, 6, 7);
        System.out.println("result (11, 5) to (6, 7) " + result);
    }
}
