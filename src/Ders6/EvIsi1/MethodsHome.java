package Ders6.EvIsi1;

import Ders6.DersPraktika1.Methods;

public class MethodsHome {
    public static void main(String[] args) {
        MethodsHome print = new MethodsHome();
        print.printNumbers(4, 9);
        print.printNumbers(4, 11);
        print.printNumbers(0, 17);
    }

    void printNumbers(int begin, int end) {
        for (int i = begin + 1; i < end; i++) {
            System.out.println(i);
        }System.out.println("------------------------------");
    }
}
