package Ders4.DersPraktika2;

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Radiusu daxil edin:");
        double r = sc.nextDouble();
        double l = 2 * 3.14 * r;
        System.out.println("l= " + l);
    }
}
