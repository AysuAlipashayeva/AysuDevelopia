package Ders6.DersPraktika1;

import java.lang.reflect.Method;

public class Methods {
    public static void main(String[] args) {
        Methods print = new Methods();
        print.printName(4, "Aysu");
        print.printName(5,"book");
        print.printName(2,"Computer");
    }

    void printName(int count, String name) {
        for (int i = 0; i < count; i++) {
            System.out.println(name);
        }
    }
}
