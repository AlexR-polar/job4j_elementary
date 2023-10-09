package ru.job4j.condition;

public class SqArea {
    public static double square(int p, double k) {
        double h = p / (2 * (k + 1));
        double rsl = k * h * h;
        return rsl;
    }

    public static void main(String[] args) {
        double result1 = SqArea.square(8, 2);
        System.out.println(" p = 8, k = 2, real = " + result1);
        double result2 = SqArea.square(7, 2);
        System.out.println(" p = 7 , k = 2, real = " + result2);
        double result3 = SqArea.square(6, 3);
        System.out.println(" p = 6, k = 3, real = " + result3);

    }
}
