package Ders5.EvIsi1;

public class ClassAndObjectHome {
    public static void main(String[] args) {
        Person woman = new Person();
        woman.id = 1;
        woman.name = "Aysu";
        woman.age = 18;
        woman.surname = "Alipashayeva";
        woman.phone = "0779999999";

        Person man = new Person();
        man.id = 2;
        man.name = "Tural";
        man.age = 17;
        man.surname = "Alipashali";
        man.phone = "0709999999";

        System.out.println("ID: " + woman.id);
        System.out.println("Name: " + woman.name);
        System.out.println("Age: " + woman.age);
        System.out.println("Surname: " + woman.surname);
        System.out.println("Phone: " + woman.phone);
        System.out.println("------------------------------");
        System.out.println("ID: " + man.id);
        System.out.println("Name: " + man.name);
        System.out.println("Age: " + man.age);
        System.out.println("Surname: " + man.surname);
        System.out.println("Phone: " + man.phone);

    }
}
