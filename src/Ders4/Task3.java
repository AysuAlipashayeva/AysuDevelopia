package Ders4;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("1ci ededi daxil edin:");
        int a = scanner.nextInt();
        System.out.println("2ci ededi daxil edin:");
        int b = scanner.nextInt();
        int netice = a * b;
        System.out.println("netice: " + netice);
    }
}
