package Ders4;

public class PrimitiveTypeConversion {
    public static void main(String[] args) {
        short s1 = 69;
        byte b1 = (byte) s1;
        System.out.println(b1);

        short s2 = 589;
        byte b2 = (byte) s2;
        System.out.println(b2);

        long l1 = 458;
        int i1 = (int) l1;
        System.out.println(i1);

        long l2 = 52523635483L;
        int i2 = (int) l2;
        System.out.println(i2);

        double d=5632.6;
        float f=(float) d;
        System.out.println(f);

        char c1='D';
        int i=(int) c1;
        System.out.println(i);

        int ii=123;
        char c2=(char) ii;
        System.out.println(c2);
    }
}
