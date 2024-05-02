package Ders4;

import java.util.Scanner;

public class Task9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("ededi daxil edin:");
        int a= sc.nextInt();
        if (a%2==0){
            System.out.println("eded cutdur");
        }else {
            System.out.println("eded tekdir");
        }
    }
}
