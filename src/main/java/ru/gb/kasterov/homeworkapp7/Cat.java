package ru.gb.kasterov.homeworkapp7;

public class Cat {
    private String name;
    private int appetite;
    private boolean satiety;

    public Cat(String name, int appetite, boolean satiety) {
        this.name = name;
        this.appetite = appetite;
        this.satiety = satiety;
    }

    public String getName() {
        return name;
    }


    public boolean isSatiety() {
        return satiety;
    }

    public void eat(Plate p) {
        if (!isSatiety() && p.isNotEmpty(appetite)) {
            p.decreaseFood(appetite);
            System.out.println("Котик " + getName() + " ест.");
            satiety = true;
            p.info();
        }
        System.out.println("Котик " + getName() + " сыт? " + isSatiety());
        System.out.println();
    }
}
