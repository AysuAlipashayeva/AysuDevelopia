package Ders7;

public class ArraysDemo {
    public static void main(String[] args) {
        int[] numbers = {13, 15, 41, 12, 34};

        int cem = 0;
        int edediOrta = 0;
        int minElement = 100;
        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);

            cem += numbers[i];

            if (numbers[i] < minElement)
                minElement = numbers[i];
        }
        edediOrta = cem / numbers.length;

        System.out.println("Massivin ededlerinin cemi: " + cem);
        System.out.println("Massivin ededi ortasi: " + edediOrta);
        System.out.println("Massivin minimum elementi: " + minElement);

        for (int j = 0; j < numbers.length; j++) {
            if (numbers[j] % 2 == 1)
                System.out.println("tek ededdir: " + numbers[j]);
        }
    }
}
