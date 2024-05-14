package Ders6.pass_by_reference;

public class MainClass {
    public static void main(String[] args) {
        Person employee = new Person();
        employee.name = "Aysu";
        employee.surname = "Alipashayeva";
        employee.experienceYear = 3;
        employee.phone = "0775005555";

        SalaryCalculator calPerSal = new SalaryCalculator();
        calPerSal.calculateSalary(employee);
        employee.printInfo();
    }

}
