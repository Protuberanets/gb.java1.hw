package ru.gb.kasterov;

import java.util.Random;
import java.util.Scanner;

public class HomeWorkApp4 {
    public static int SIZE = 3;
    public static int DOTS_TO_WIN = 3;
    public static final char DOT_EMPTY = '•';
    public static final char DOT_X = 'X';
    public static final char DOT_O = 'O';
    public static char[][] map;
    public static Scanner sc = new Scanner(System.in);
    public static Random rand = new Random();

    public static void main(String[] args) {
        initMap();
        printMap();
        while (true) { //вводим условия игры
            humanTurn();
            printMap();
            if (checkWin(DOT_X)) {
                System.out.println("Победил человек");
                break;
            }
            if (isMapFull()) {
                System.out.println("Ничья");
                break;
            }
            aiTurn();
            printMap();
            if (checkWin(DOT_O)) {
                System.out.println("Победил Искуственный Интеллект");
                break;
            }
            if (isMapFull()) {
                System.out.println("Ничья");
                break;
            }
        }
        System.out.println("Игра закончена");
    }

    public static boolean checkWin(char symb) { //проверка победы
        int symbCountH;
        int[] symbCountV = new int[SIZE];
        for (int i = 0; i < SIZE; i++) {
            symbCountH = 0;
            for (int j = 0; j < SIZE; j++) {
                if (map[i][j] == symb) {
                    symbCountH++;
                    symbCountV[j]++;
                    if (symbCountH == DOTS_TO_WIN || symbCountV[j] == DOTS_TO_WIN) {
                        return true;
                    }
                } else {
                    symbCountH = 0;
                    symbCountV[j] = 0;
                }
            }
        }

        int diagLR = 0, diagRL = 0;
        for (int i = 0; i < SIZE; i++) {

            if (map[i][i] == symb) {
                diagLR++;
                if (diagLR == DOTS_TO_WIN) {
                    return true;
                }
            } else {
                diagLR = 0;
            }
            if (map[i][(SIZE - 1) - i] == symb) {
                diagRL++;
                if (diagRL == DOTS_TO_WIN) {
                    return true;
                }
            } else {
                diagRL = 0;
            }

        }
        return false;
    }

    public static boolean isMapFull() { //проверка заполненности поля
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                if (map[i][j] == DOT_EMPTY) return false;
            }
        }
        return true;
    }

    public static void aiTurn() { //ход компьютера (рандомное значение в пределах поля)
        int x, y;
        do {
            x = rand.nextInt(SIZE);
            y = rand.nextInt(SIZE);
        } while (!isCellValid(x, y));
        System.out.println("Компьютер походил в точку " + (x + 1) + " " + (y + 1));
        map[y][x] = DOT_O;
    }

    public static void humanTurn() { // аналогично для человека, со смещением на -1 позицию, т.к. индексы ряда нумеруются от 0
        int x, y;
        do {
            System.out.println("Введите координаты в формате X Y");
            x = sc.nextInt() - 1;
            y = sc.nextInt() - 1;
        } while (!isCellValid(x, y)); // while(isCellValid(x, y) == false)
        map[y][x] = DOT_X;
    }

    public static boolean isCellValid(int x, int y) { //границы поля
        if (x < 0 || x >= SIZE || y < 0 || y >= SIZE) return false;
        if (map[y][x] == DOT_EMPTY) return true;
        return false;
    }

    public static void initMap() { //создание поля для игры
        map = new char[SIZE][SIZE];
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                map[i][j] = DOT_EMPTY;
            }
        }
    }

    public static void printMap() { //оформление поля
        for (int i = 0; i <= SIZE; i++) {
            System.out.print(i + " ");
        }
        System.out.println();
        for (int i = 0; i < SIZE; i++) {
            System.out.print((i + 1) + " ");
            for (int j = 0; j < SIZE; j++) {
                System.out.print(map[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }

}
