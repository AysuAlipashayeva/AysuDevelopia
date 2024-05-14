package Ders6.EvIsi2;

public class MainClass {
    public static void main(String[] args) {
        Circle circle1 = new Circle();
        circle1.radius = 100;

        Calculator calculator = new Calculator();
        calculator.calculateCircleLength(circle1);
        System.out.println("Circle Length: " + circle1.length);
    }
}
