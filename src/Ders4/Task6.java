package Ders4;

import java.util.Scanner;

public class Task6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("ededi daxil edin: ");
        int a = sc.nextInt();
        int count = 0;
        if (a > 1) {
            for (int i = 1; i <= a; i++) {
                if (a % i == 0)
                    count++;
            }
            if (count == 2) {
                System.out.println("sade ededdir");
            } else {
                System.out.println("sade eded deyil");
            }
        }
    }
}
