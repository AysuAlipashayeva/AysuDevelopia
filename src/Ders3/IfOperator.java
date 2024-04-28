package Ders3;

public class IfOperator {
    public static void main(String[] args) {
        int x = 20;
        if (x < 30) {
            System.out.println("if blokunun daxilinde olan kodlar");
        }
        System.out.println("if blokunun xaricinde olan kodlar");

        int i = 30;
        if (i > 40) {
            System.out.println("sert true olduqda icra olunan kodlar");
        } else {
            System.out.println("sert false olduqda icra olunan kodlar");
        }

        int a = 30;
        if (a == 10) {
            System.out.println("a deyiseninin deyeri 10dur");
        } else if (a == 20) {
            System.out.println("a deyiseninin deyeri 20dur");
        }else if (a == 30) {
            System.out.println("a deyiseninin deyeri 30dur");
        }else {
            System.out.println("bu else blokudur");
        }

        int m=30;
        int n=10;
        if(m==30){
            if(n==10){
                System.out.println("m = 30 ve n = 10");
            }
        }
    }
}
