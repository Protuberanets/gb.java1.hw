package ru.gb.kasterov.homeworkapp5;

public class EmployeesData {
    public static void main(String[] args) {
        Employee[] employee = new Employee[5];
        employee[0] = new Employee("Василий", "Инженер", "0@ya.ru", "+79870", 100000, 35);
        employee[1] = new Employee("Надежда", "Бухгалтер", "1@ya.ru", "+79871", 110000, 41);
        employee[2] = new Employee("Николай", "Стажер", "2@ya.ru", "+79872", 120000, 20);
        employee[3] = new Employee("Анна", "HR", "@3ya.ru", "+79873", 130000, 50);
        employee[4] = new Employee("Ася", "Директор", "@4ya.ru", "+79874", 140000, 65);

        for (int i = 0; i < employee.length; i++) {
            if (employee[i].getAge() > 40) {
                employee[i].print();
            }

        }
    }
}

