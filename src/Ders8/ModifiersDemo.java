package Ders8;

public class ModifiersDemo {
    public static void main(String[] args) {
        Person employee = new Person();
        employee.experienceYear=5;
        System.out.println("Name: "+employee.name);
        System.out.println("Surname: "+employee.surname);
        System.out.println("Age: "+employee.age);
        System.out.println("Experience year:"+employee.experienceYear);
        employee.findSalary();
        employee.bonus();
        employee.calculateSalary();
        System.out.println("-------------------------------------");

        Person employee1 = new Person();
        employee1.name = "Ruslan";
        employee1.surname = "Ramazanov";
        employee1.age = 7;
        employee.experienceYear=0;
        System.out.println("Name: "+employee1.name);
        System.out.println("Surname: "+employee1.surname);
        System.out.println("Age: "+employee1.age);
        System.out.println("Experience year:"+employee.experienceYear);
        employee1.findSalary();
        employee1.calculateSalary();
        System.out.println("-------------------------------------");

        Person employee2 = new Person();
        employee2.name = "Tural";
        employee2.surname = "Alipashali";
        employee2.age = 17;
        employee2.salary = 1500;
        employee2.experienceYear=2;
        System.out.println("Name: "+employee2.name);
        System.out.println("Surname: "+employee2.surname);
        System.out.println("Age: "+employee2.age);
        System.out.println("Salary: " + employee2.salary);
        System.out.println("Experience year:"+employee.experienceYear);
        employee2.bonus();
        employee2.calculateSalary();
        employee2.phoneNumber("0556781234");
    }
}
