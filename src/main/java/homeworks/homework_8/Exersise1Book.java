package homeworks.homework_8;

import java.util.Objects;
import java.util.UUID;

public class Exersise1Book {

    private String id;
    private String title;
    private Exersise1Author author;
    private String year;
    private String description;
    private String isbn;


    public Exersise1Book(String id, String title, Exersise1Author author, String year, String description, String isbn) {
        this.id = id;
        this.title = title;
        this.author = author;
        this.year = year;
        this.description = description;
        this.isbn = isbn;
    }

    public Exersise1Book(String title, Exersise1Author author, String year) {
        this.id = UUID.randomUUID().toString();
        this.description = "";
        this.id = "";
        new Exersise1Book(id, title, author, year, description, isbn);
    }


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Exersise1Author getAuthor() {
        return author;
    }

    public void setAuthor(Exersise1Author author) {
        this.author = author;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    @Override
    public String toString() {
        return "Exersise1Book{" +
                "id='" + id + '\'' +
                ", title='" + title + '\'' +
                ", author=" + author +
                ", year='" + year + '\'' +
                ", description='" + description + '\'' +
                ", isbn='" + isbn + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Exersise1Book that = (Exersise1Book) o;
        return Objects.equals(title, that.title) &&
                Objects.equals(author, that.author) &&
                Objects.equals(year, that.year) &&
                Objects.equals(isbn, that.isbn);
    }

    @Override
    public int hashCode() {
        return Objects.hash(title, author, year, isbn);
    }
}
