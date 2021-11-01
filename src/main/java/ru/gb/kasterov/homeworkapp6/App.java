package ru.gb.kasterov.homeworkapp6;

public class App {
    public static void main(String[] args) {
        Cats barsik = new Cats("Барсик");
        Cats murzik = new Cats("Мурзик");
        Dogs bobik = new Dogs("Бобик");
        barsik.swim(150);
        barsik.run(20);
        murzik.run(100);
        bobik.swim(5);
        bobik.run(200);
        System.out.println(Animal.getValue());
        System.out.println(Cats.getCatsValue());
        System.out.println(Dogs.getDogsValue());
    }

}
