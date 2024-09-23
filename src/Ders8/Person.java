package Ders8;

public class Person {

    public String name;
    public String surname;
    public int age;
    public int salary;
    public int experienceYear;

    public void findSalary() {
        if (age > 16) {
            this.salary = 3000;
            System.out.println("Salary: " + salary);
        } else {
            System.out.println("He is student.");
        }
    }

    public void bonus() {
        if (salary > 2000) {
            this.salary += 1000;
            System.out.println("Final salary: " + salary);
        } else {
            this.salary -= 500;
            System.out.println("Final salary: " + salary);
        }
    }

    public void calculateSalary() {
        for (int i = 1; i <= experienceYear; i++) {
            this.salary += 500;
        }
        System.out.println("Salary with experience year: " + salary);
    }

    public void phoneNumber(final String phone) {
        System.out.println(phone);
    }

    public Person() {
        this("Aysu");
    }

    public Person(String name) {
        this(name, "Alipashayeva");
    }

    public Person(String name, String surname) {
        this(name, surname, 18);
    }

    public Person(String name, String surname, int age) {
        this.name = name;
        this.surname = surname;
        this.age = age;
    }
}
