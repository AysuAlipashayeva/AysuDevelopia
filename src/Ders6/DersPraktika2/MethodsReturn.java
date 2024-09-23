package Ders6.DersPraktika2;

public class MethodsReturn {
    public static void main(String[] args) {
        Calculator edediOrta = new Calculator();
        double result1=edediOrta.average(6,8);
        double result2=edediOrta.average(7,19);
        System.out.println(result1);
        System.out.println(result2);
    }
}
