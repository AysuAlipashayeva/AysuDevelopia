package Ders3;

public class Casting {
    public static void main(String[] args) {
        //overflow
        short a = 140;
        byte b = (byte) a;
        System.out.println(b);

        //underflow
        short a1 = -130;
        byte b1 = (byte) a1;
        System.out.println(b1);
    }
}
