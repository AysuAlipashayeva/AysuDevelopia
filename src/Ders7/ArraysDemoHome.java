package Ders7;

public class ArraysDemoHome {
    public static void main(String[] args) {
        int[] numbers = {27, 44, 56, 73};

        int cem = 0;
        int edediorta = 0;
        int maxElement = 0;
        int minElement = 100;

        for (int i = 0; i < numbers.length; i++) {
            cem += numbers[i];
            if (numbers[i] > maxElement)
                maxElement = numbers[i];

            if (numbers[i] < minElement)
                minElement = numbers[i];

            if (numbers[i] % 2 == 1) {
                System.out.println("tek: " + numbers[i]);
            } else {
                System.out.println("cut: " + numbers[i]);
            }
        }
        System.out.println("Massivin elementlerinin cemi: " + cem);

        for (int number : numbers) {
            System.out.println(number);
        }

        edediorta = cem / numbers.length;
        System.out.println("Massivin elementlerinin edediortasi: " + edediorta);

        System.out.println("Massivin maximum element: " + maxElement);
        System.out.println("Massivin minimum element: " + minElement);
    }
}
