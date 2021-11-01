package ru.gb.kasterov.homeworkapp6;

public abstract class Animal {
    private String name;
    private static int value = 0;

    public Animal(String name) {
        this.name = name;
        value++;
    }

    public static int getValue() {
        return value;
    }

    public String getName() {
        return name;
    }


    public void swim(int distance) {
    }


    public void run(int distance) {
    }


}
