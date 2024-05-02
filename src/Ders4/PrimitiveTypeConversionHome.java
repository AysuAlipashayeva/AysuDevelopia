package Ders4;

public class PrimitiveTypeConversionHome {
    public static void main(String[] args) {
        int i=55;
        byte b =(byte) i;
        System.out.println(b);

        short s=636;
        byte b1=(byte) s;
        System.out.println(b1);

        long l1=458;
        short s1=(short) l1;
        System.out.println(s1);

        long l2=9252365483L;
        int ii=(int) l2;
        System.out.println(ii);

        double d=65787.3;
        int i1=(int) d;
        System.out.println(i1);

        char c1='q';
        int i3=(int) c1;
        System.out.println(i3);

        int i4=266;
        char c2=(char) i4;
        System.out.println(c2);
    }
}
