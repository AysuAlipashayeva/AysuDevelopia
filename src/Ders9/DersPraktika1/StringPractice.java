package Ders9.DersPraktika1;

import java.util.Arrays;

public class StringPractice {
    public static void main(String[] args) {
        String name = "Cavid";
        System.out.println(name);

        String message = "Java dili və effektli bir proqramlaşdırma dilidir";
        System.out.println(message);
        System.out.println("Simvol sayi: " + message.length());
        System.out.println("2ci simvol: " + message.charAt(3));

        int index = -1;
        do {
            index = message.indexOf("i", index + 1);
            if (index == -1) break;
            System.out.println("i: " + index);
        } while (index != -1);

        System.out.println("Lower case: " + message.toLowerCase());
        System.out.println("Upper case: " + message.toUpperCase());
        System.out.println("Contain: " + message.contains("y"));
        System.out.println("Ends with: " + message.endsWith("dir"));
        System.out.println("Stars with: " + message.startsWith("proqram"));
        name = "    Adil    ";
        System.out.println(name);
        System.out.println("Trim: " + name.trim());
        name = "Baxtiyar";
        System.out.println(name.substring(0, 4));
        name = "Ali Hasanov";
        String[] newName = name.split(" ");
        System.out.println(Arrays.toString(newName));


    }
}
