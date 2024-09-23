package Ders4;

public class ProblemAgac {
    public static void main(String[] args) {
        int gun = 0;
        double uzunluq = 30;

        while (uzunluq < 1000) {
            double su = 1 * Math.pow(1.5, gun);
            uzunluq += su * 15;
            gun++;
        }
        System.out.println("Agacin 10 metr olmasi ucun " + gun + "gun lazimdir");
    }

}
