package Ders5.DersPraktika2;

public class Computer {
    Integer id;
    String brand;
    String model;
    String color;

    Computer() {
    }

    Computer(String model) {
        this.model = model;
    }

    Computer(String model, String color) {
        this.model = model;
        this.color = color;
    }
}
