package Ders5.DersPraktika2;

public class ClassAndObjectAndConsructors {
    public static void main(String[] args) {
        Computer apple = new Computer();
        apple.id = 1;
        apple.brand = "Apple";
        apple.color = "White";
        apple.model = "Apple MacBook Pro 16";

        Computer hp = new Computer("HP Victus 16");
        hp.id = 2;
        hp.brand = "HP";
        hp.color = "Blue";

        Computer microsoft = new Computer("Surface", "Black");
        microsoft.id = 3;
        microsoft.brand = "Microsoft";

        System.out.println("ID: " + apple.id);
        System.out.println("Brand: " + apple.brand);
        System.out.println("Model: " + apple.model);
        System.out.println("Color: " + apple.color);
        System.out.println("ID: " + hp.id);
        System.out.println("Brand: " + hp.brand);
        System.out.println("Model: " + hp.model);
        System.out.println("Color: " + hp.color);
        System.out.println("ID: " + microsoft.id);
        System.out.println("Brand: " + microsoft.brand);
        System.out.println("Model: " + microsoft.model);
        System.out.println("Color: " + microsoft.color);

    }
}
