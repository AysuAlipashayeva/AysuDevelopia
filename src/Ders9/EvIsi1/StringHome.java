package Ders9.EvIsi1;

import java.util.Arrays;
import java.util.Locale;

public class StringHome {
    public static void main(String[] args) {
        String name = "Meherrem";
        System.out.println(name);
        String message = "Java dilini öyrənmək maraqlı və faydalıdır";
        System.out.println(message);
        System.out.println("Simvol sayi: " + message.length());
        System.out.println("7ci simvol: " + message.charAt(8));

        int index = -1;
        do {
            index = message.indexOf("n", index + 1);
            if (index == -1) break;
            System.out.println("n: " + index);
        } while (index != -1);

        System.out.println("Lower case: " + message.toLowerCase());
        System.out.println("Upper case: " + message.toUpperCase());
        System.out.println("Contain: " + message.contains("f"));
        System.out.println("Ends with: " + message.endsWith("maraq"));
        System.out.println("Stars with: " + message.startsWith("Java"));
        name="   Ayxan  ";
        System.out.println(name);
        System.out.println(name.trim());
        name="Kamil";
        System.out.println(name.substring(0,4));
        name="Huseyn Mehdizade";
        String [] newName=name.split(" ");
        System.out.println(Arrays.toString(newName));

    }
}
