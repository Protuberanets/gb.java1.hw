package ru.gb.kasterov.homeworkapp7;

public class Plate {
    private int food;

    public Plate(int food) {
        this.food = food;
    }


    public void decreaseFood(int n) {
        if (isNotEmpty(n)) {
            food -= n;
        }
    }

    public boolean isNotEmpty(int n) {
        return food > 0 && food >= n;
    }

    public void increaseFood(int n) {
        System.out.println();
        System.out.println("Добавляем еду =)");
        food += n;
    }

    public void info() {
        System.out.println("В тарелке " + food + " еды.");
    }
}
