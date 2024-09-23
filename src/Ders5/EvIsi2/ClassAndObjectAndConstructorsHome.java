package Ders5.EvIsi2;

public class ClassAndObjectAndConstructorsHome {
    public static void main(String[] args) {
        Employee employee1 = new Employee();
        employee1.id = 1;
        employee1.name = "Mari";
        employee1.surname = "Alipashayeva";
        employee1.phone="0559999999";
        employee1.address="Baku";
        employee1.salary=5000;

        Employee employee2 = new Employee("Senuber");
        employee2.id = 2;
        employee2.surname = "Talibova";
        employee2.phone="0550001122";
        employee2.address="Baku";
        employee2.salary=4000;

        Employee employee3 = new Employee("Aysel","Huseynova");
        employee3.id = 3;
        employee3.phone="0770001122";
        employee3.address="Baku";
        employee3.salary=6000;

        Employee employee4 = new Employee("Nermin","0771234567",3500);
        employee4.id = 4;
        employee4.surname = "Gulmammadova";
        employee4.address="Baku";

        System.out.println("ID: "+employee1.id);
        System.out.println("Name: "+employee1.name);
        System.out.println("Surname: "+employee1.surname);
        System.out.println("Phone: "+employee1.phone);
        System.out.println("Address: "+employee1.address);
        System.out.println("Salary: "+employee1.salary);
        System.out.println("--------------------------------------");
        System.out.println("ID: "+employee2.id);
        System.out.println("Name: "+employee2.name);
        System.out.println("Surname: "+employee2.surname);
        System.out.println("Phone: "+employee2.phone);
        System.out.println("Address: "+employee2.address);
        System.out.println("Salary: "+employee2.salary);
        System.out.println("--------------------------------------");
        System.out.println("ID: "+employee3.id);
        System.out.println("Name: "+employee3.name);
        System.out.println("Surname: "+employee3.surname);
        System.out.println("Phone: "+employee3.phone);
        System.out.println("Address: "+employee3.address);
        System.out.println("Salary: "+employee3.salary);
        System.out.println("--------------------------------------");
        System.out.println("ID: "+employee4.id);
        System.out.println("Name: "+employee4.name);
        System.out.println("Surname: "+employee4.surname);
        System.out.println("Phone: "+employee4.phone);
        System.out.println("Address: "+employee4.address);
        System.out.println("Salary: "+employee4.salary);
    }
}
