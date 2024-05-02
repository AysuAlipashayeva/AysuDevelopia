package Ders4.DersPraktika2;

import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        int i = 789;
        int a = i / 100;
        int b = i / 10 % 10;
        int c = i % 10;
        System.out.println("netice: " + (a + b + c));

        //for all numbers
        Scanner sc = new Scanner(System.in);
        System.out.println("ededi daxil edin: ");
        int eded = sc.nextInt();
        int cem = 0;
        while (eded > 0) {
            cem = cem + eded % 10;
            eded = eded / 10;
        }System.out.println("cem: " + cem);
    }

}
