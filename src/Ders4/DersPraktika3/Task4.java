package Ders4.DersPraktika3;

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("ededi daxil edin: ");
        int eded = sc.nextInt();
        int minReqem = 9;
        while (eded > 0) {
            int reqem = eded % 10;
            if (minReqem > reqem) {
                minReqem = reqem;
            }
            eded = eded / 10;
        }
        System.out.println("En kicik eded: " + minReqem);
    }
}
