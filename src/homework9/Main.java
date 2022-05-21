package homework9;

public class Main {
    public static void main(String[] args) {


        Book theLordOfRing = new Book("The Lord of Ring", new Author("John","Tolkien"), 1954);
        System.out.println("theLordOfRing.name = " + theLordOfRing.getName());
        System.out.println("theLordOfRing.author = " + theLordOfRing.getAuthor());
        System.out.println("theLordOfRing.publicationYear = " + theLordOfRing.getPublicationYear());
        theLordOfRing.setPublicationYear(1965);
        System.out.println("theLordOfRing.getPublicationYear() = " + theLordOfRing.getPublicationYear());

        Book harryPotter = new Book("Harry Potter", new Author("J.K.", "Rowling"), 1990);
        System.out.println("harryPotter.name = " + harryPotter.getName());
        System.out.println("harryPotter.author = " + harryPotter.getAuthor());
        System.out.println("harryPotter.publicationYear = " + harryPotter.getPublicationYear());
        Author author = new Author("John", "Tolkien");
        System.out.println("author.name = " + author.getName());
        System.out.println("author.surname = " + author.getSurname());
        Author author1 = new Author("J.K.", "Rowling");
        System.out.println("author1.name = " + author1.getName());
        System.out.println("author1.surname = " + author1.getSurname());
        System.out.println(theLordOfRing);
        System.out.println(harryPotter.equals(theLordOfRing));
        System.out.println(author.equals(author1));
        System.out.println(harryPotter.hashCode());
        System.out.println(theLordOfRing.hashCode());
        System.out.println(author.hashCode());
        System.out.println(author1.hashCode());
    }
}
