package ru.gb.kasterov.homeworkapp5;

public class Employee {
    private String name;
    private String position;
    private String email;
    private String telNumber;
    private float salary;
    private int age;

    public Employee(String name, String position, String email, String tel_Number, float salary, int age) {
        this.name = name;
        this.position = position;
        this.email = email;
        this.telNumber = tel_Number;
        this.salary = salary;
        this.age = age;
    }

    void print() {
        System.out.printf("Сотрудник %s, занимающий должность %s. E-mail: %s. Телефонный номер: %s. Зарплата: %.2f. Возраст %d\n", name, position, email, telNumber, salary, age);
    }

    public int getAge() {
        return age;
    }
}
