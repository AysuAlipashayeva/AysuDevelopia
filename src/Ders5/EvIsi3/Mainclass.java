package Ders5.EvIsi3;

import java.util.SortedMap;

public class Mainclass {
    public static void main(String[] args) {
        Student s1 = new Student("Adil", 14);
        Student s2 = new Student("Cavid", 17);
        Student s3 = s2;
        Student s4 = s1;
        // s1=null;
        s4=null;
        s4 = new Student("Hesen", 11);
        System.out.println(s1.name);//Adil
        System.out.println(s1.age);//14
        System.out.println(s2.name);//Cavid
        System.out.println(s2.age);//17
        System.out.println(s3.name);//Cavid
        System.out.println(s3.age);//17
        System.out.println(s4.name);//Hesen
        System.out.println(s4.age);//11
    }
}
