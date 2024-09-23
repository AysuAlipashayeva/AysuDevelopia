package Ders3;

public class TheArithmeticOperators {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        int c = 25;
        int d = 25;
        System.out.println("a + b = " + (a + b));//30
        System.out.println("a - b = " + (a - b));//-10
        System.out.println("a * b = " + (a * b));//200
        System.out.println("b / a = " + (b / a));//2
        System.out.println("b % a = " + (b % a));//0
        System.out.println("c % a = " + (c % a));//5
        //unary operators
        System.out.println("a++ = " + (a++));//10
        System.out.println("++a = " + (++a));//10+1+1
        System.out.println("a-- = " + (a--));//12
        System.out.println("--a = " + (--a));//12-1-1

        System.out.println(d++);//25
        System.out.println(d);//26

        System.out.println(++d);//27
        System.out.println(d);//27
    }
}
