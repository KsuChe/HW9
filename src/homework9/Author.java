package homework9;

public class Author {
    private String name;
    private String surname;

    public Author(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }

    public String getName() {
        return this.name;
    }

    public String getSurname() {
        return this.surname;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o==null || getClass()!=o.getClass()) return false;
        Author author = (Author) o;
        return (name + surname).equals(author.name + author.surname);
    }

    public String toString() {
        return this.name + this.surname;
    }
}
