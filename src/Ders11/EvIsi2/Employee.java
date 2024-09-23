package Ders11.EvIsi2;

public class Employee extends Person {
    double salary;
    String username;
    int password;
    String department;

    @Override
    public void printInfo() {
        super.printInfo();
        System.out.println(salary);
        System.out.println(username);
        System.out.println(password);
        System.out.println(department);
    }
}
