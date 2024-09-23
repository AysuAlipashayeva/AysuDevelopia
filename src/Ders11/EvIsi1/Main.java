package Ders11.EvIsi1;

public class Main {
    public static void main(String[] args) {
        Cat cat = new Cat("Barney", 3);
        Dog dog=new Dog("Rex",4);
        Lion lion=new Lion("Leo",6);
        cat.makeNoise();
        dog.makeNoise();
        lion.makeNoise();
    }
}
