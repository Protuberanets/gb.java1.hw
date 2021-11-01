package ru.gb.kasterov.homeworkapp6;

public class Cats extends Animal {
    private static int catsValue = 0;
    public Cats(String name) {
        super(name);
        catsValue++;
    }

    public static int getCatsValue() {
        return catsValue;
    }

    @Override
    public void swim(int distance) {
        super.swim(distance);
        System.out.println("Коты не умеют плавать!");
    }

    @Override
    public void run(int distance) {
        super.run(distance);
        if (distance <= 200) {
            System.out.println(getName() + " пробежал " + distance + " м.");
        } else {
            System.out.println("Котейка слабый и не смог столько пробежать.");
        }
    }
}
