package ru.gb.kasterov;

import java.util.Arrays;

public class HomeWorkApp3 {
    public static void main(String[] args) {
        changeNumbersOfArray();
        createArray();
        multipleArray();
        setDiagonalsOfArray();
        System.out.println(Arrays.toString(initialValueArray(3, 10)));
        System.out.println();
        printMinMaxOfArray();
        System.out.println(checkBalance());
        System.out.println();
        moveArray(4); //Положительное число - смещаем влево, Отрицательное - вправо. 0<=n<=5

    }

    public static void changeNumbersOfArray() {
        int[] a = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};
        System.out.println(Arrays.toString(a));
        for (int i = 0; i < a.length; i++) {
            if (a[i] == 0) {
                a[i] = 1;
            } else {
                a[i] = 0;
            }
        }
        System.out.println(Arrays.toString(a));
        System.out.println();
    }

    public static void createArray() {
        int[] a = new int[100];
        for (int i = 0; i < a.length; i++) {
            a[i] = i + 1;
        }
        System.out.println(Arrays.toString(a));
        System.out.println();
    }

    public static void multipleArray() {
        int[] a = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        System.out.println(Arrays.toString(a));
        for (int i = 0; i < a.length; i++) {
            if (a[i] < 6) {
                a[i] = a[i] * 2;
            }
        }
        System.out.println(Arrays.toString(a));
        System.out.println();
    }

    public static void setDiagonalsOfArray() {
        int size = 10;
        int[][] a = new int[size][size];
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                if (i == j) {
                    a[i][j] = 1;
                }
                if (j == (size - 1) - i) {
                    a[i][(size - 1) - i] = 1;
                }
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }

    public static int[] initialValueArray(int initialValue, int len) {
        int[] a = new int[len];
        Arrays.fill(a, initialValue);
        return a;
    }

    public static void printMinMaxOfArray() {
        int[] a = new int[10];
        int max = 1, min = 1;   //присвоил 1, потому что массив по умолчанию имеет 0, и если мы берем только положительные числа, то меньше 0 быть не может.
        // И в то же время, среди рандомных чисел, 0 может не быть. В общем-то можно было взять любую цифру отличную от 0.
        for (int i = 0; i < a.length; i++) {
            a[i] = (int) (Math.random() * 10);
            if (a[i] > max) {
                max = a[i];
            }
            if (a[i] < min) {
                min = a[i];
            }
        }
        System.out.println(Arrays.toString(a));
        System.out.println("Максимальное число: " + max);
        System.out.println("Минимальное число: " + min);
        System.out.println();

    }

    public static boolean checkBalance() {
        int[] a = {2, 4, 1, 5};
        int sum, sum1;
        System.out.println(Arrays.toString(a));

        for (int i = 0; i < a.length; i++) {
            sum = 0;
            sum1 = 0;

            for (int j = 0; j < i + 1; j++) {
                sum = sum + a[j];
            }
            for (int j = a.length - 1; j >= i + 1; j--) {
                sum1 = sum1 + a[j];
            }
            if (sum == sum1) {
                return true;
            }
        }
        return false;
    }

    public static void moveArray(int n) {
        int[] a = new int[5];
        for (int i = 0; i < a.length; i++) {
            a[i] = i;
        }
        System.out.println(Arrays.toString(a));
        int length = a.length;
        int[] b = new int[length];
        System.out.println(Arrays.toString(b));
        if (n >= 0) {
            System.arraycopy(a, n, b, 0, length - n);
            System.out.println(Arrays.toString(b));
            System.arraycopy(a, 0, b, length - n, n);
        } else {
            System.arraycopy(a, 0, b, length - (n+length), length + n);
            System.out.println(Arrays.toString(b));
            System.arraycopy(a, length + n, b, 0, -1 * n);
        }
        System.out.println(Arrays.toString(b));
    }


}
