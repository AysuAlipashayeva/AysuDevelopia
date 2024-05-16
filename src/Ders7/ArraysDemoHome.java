package Ders7;

public class ArraysDemoHome {
    public static void main(String[] args) {
        int[] numbers = {44, 73, 56, 27};

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

        boolean swapped = true;
        int counter = 1;
        while (swapped) {
            swapped = false;
            for (int j = 0; j < numbers.length - counter; j++) {
                if (numbers[j] < numbers[j + 1]) {
                    swapped = true;
                    int temp = numbers[j];
                    numbers[j] = numbers[j + 1];
                    numbers[j + 1] = temp;
                }
            }
            counter++;
        }
        for (int j : numbers) {
            System.out.println("swapped:"+j);
        }
        edediorta = cem / numbers.length;
        System.out.println("Massivin elementlerinin edediortasi: " + edediorta);

        System.out.println("Massivin maximum element: " + maxElement);
        System.out.println("Massivin minimum element: " + minElement);
    }
}
