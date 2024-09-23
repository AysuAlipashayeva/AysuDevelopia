package Ders9.DersPraktika2;

public class StringPractice2 {
    public static void main(String[] args) {
        char[] simvollar = {'A', 'y', 's', 'u'};
        String setir = String.copyValueOf(simvollar);
        System.out.println(setir);
        System.out.println(setir.length());
        if (setir.length() == 5) {
            System.out.println("5 simvol var");
        } else {
            System.out.println("5 simvoldan az ya da coxdu");
        }

        System.out.println(setir.isEmpty());


    }
    /*public String replaceString(String main, String old, String newString) {

    }*/

}
