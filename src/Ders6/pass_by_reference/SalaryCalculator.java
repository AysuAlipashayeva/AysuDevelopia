package Ders6.pass_by_reference;

public class SalaryCalculator {
    public void calculateSalary(Person person) {
        for (int i = 1; i <= person.experienceYear; i++) {
            person.salary += 500;
        }

    }
}
