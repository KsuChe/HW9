package homework9;

public class Book {
    private String name;
    private Author author;
    private int publicationYear;
    public Book(String name, Author author, int publicationYear) {
        this.name = name;
        this.author = author;
        this.publicationYear = publicationYear;
    }


    public String getName() {
        return this.name;
    }

    public Author getAuthor() {
        return this.author;
    }

    public int getPublicationYear() {
        return this.publicationYear;
    }

    public void setPublicationYear(int publicationYear) {
        this.publicationYear = publicationYear;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return getName().equals(book.getName());
    }

    public String toString() {
        return "Книга " + this.name + " автор " + author.getName() + author.getSurname() + " год публикации " + this.publicationYear;
    }
    }



