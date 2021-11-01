package ru.gb.kasterov.homeworkapp6;

public class Dogs extends Animal {
    private static int dogsValue = 0;
    public Dogs(String name) {
        super(name);
        dogsValue++;
    }

    public static int getDogsValue() {
        return dogsValue;
    }

    @Override
    public void swim(int distance) {
        super.swim(distance);
        if (distance <= 10) {
            System.out.println(getName() + " проплыл " + distance + " м.");
        } else {
            System.out.println(getName() + "не проплывет" + distance + " м.");
        }
    }

    @Override
    public void run(int distance) {
        super.run(distance);
        if (distance <= 500) {
            System.out.println(getName() + " пробежал " + distance + " м.");
        } else {
            System.out.println(getName() + "не может пробежать" + distance + " м.");
        }
    }
}
