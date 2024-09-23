package Ders5.DersPraktika1;

public class ClassAndObject {
    public static void main(String[] args) {
        Book book1 = new Book();
        book1.id = 1;
        book1.name = "Animal Farm";
        book1.author = "George Orwell";
        book1.pageCount = 141;
        book1.description = "It tells the story of a group of anthropomorphic farm animals who rebel against their human farmer, hoping to create a society where the animals can be equal, free, and happy.";

        Book book2 = new Book();
        book2.id = 2;
        book2.name = "Martin Eden";
        book2.author = "Jack London";
        book2.pageCount = 480;
        book2.description = "Eden differs from London in rejecting socialism, attacking it as \"slave morality\" and relying on Nietzschean individualism.";

        System.out.println("ID: " + book1.id);
        System.out.println("Name: " + book1.name);
        System.out.println("Author: " + book1.author);
        System.out.println("Page count: " + book1.pageCount);
        System.out.println("Description: " + book1.description);

        System.out.println("ID: " + book2.id);
        System.out.println("Name: " + book2.name);
        System.out.println("Author: " + book2.author);
        System.out.println("Page count: " + book2.pageCount);
        System.out.println("Description: " + book2.description);
    }
}
