package Ders5.EvIsi2;

public class Employee {
    Integer id;
    String name;
    String surname;
    String phone;
    String address;
    int salary;

    Employee(){

    }
    Employee(String name){
    this.name=name;
    }
    Employee(String name, String surname){
    this.name=name;
    this.surname=surname;
    }
    Employee(String name, String phone, int salary){
    this.name=name;
    this.phone=phone;
    this.salary=salary;
    }

}
