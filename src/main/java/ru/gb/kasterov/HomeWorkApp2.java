package ru.gb.kasterov;

public class HomeWorkApp2 {

    public static void main(String[] args) {
        System.out.println(checkSumIsPositive(-5, 0));
        printIsPositive(-100);
        System.out.println(isPositive(-5));
        printStringNTimes(5, "Я научусь программировать на Java");
        System.out.println(isYearHighGrade(1764));
    }

    public static boolean checkSumIsPositive(int a, int b) {
        return a + b > 0;
    }

    public static void printIsPositive(int a) {
        if (isPositive(a)) {
            System.out.println("Число " + a + " - положительное");
        } else {
            System.out.println("Число " + a + " - отрицательное");
        }
    }

    public static boolean isPositive(int a) {
        return a >= 0;
    }

    public static void printStringNTimes(int n, String name) {
        for (int i = 0; i < n; i++) {
            System.out.println(name);
        }
    }

    public static boolean isYearHighGrade(int year) {
        return (year % 4 == 0) && (year % 100 != 0) || (year % 400 == 0);
    }

}
