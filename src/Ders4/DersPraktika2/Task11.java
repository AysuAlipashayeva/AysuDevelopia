package Ders4.DersPraktika2;


public class Task11 {
    public static void main(String[] args) {
        int count = 0;
        int eded = 2;
        while (count < 20) {
            boolean sadeEded = true;
            for (int i = 2; i <= Math.sqrt(eded); i++) {
                if (eded % i == 0) {
                    sadeEded = false;
                    break;
                }
            }
            if (sadeEded){
                System.out.println(eded+" ");
                count++;
            }
            eded++;
        }
    }
}