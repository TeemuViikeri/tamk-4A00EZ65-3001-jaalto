public class Book {

    enum Status {
        NOT_DEFINED
    }

    private String name;
    private String author;
    private String isbn;
    private int published;
    private String publisher;

    Book() {
        name = author = isbn = publisher = null;
        published = Status.NOT_DEFINED.ordinal();
    }

    Book(String name, String author, String isbn, int published, String publisher) {
        this.name = name;
        this.author = author;
        this.isbn = isbn;
        this.published = published;
        this.publisher = publisher;
    }

    void print() {
        System.out.println(toString());
    }

    @Override
    public String toString() {
        return name + ", " + author + ". " + isbn + ". " + published + ": " + publisher;
    }

    String getName() {
        return name;
    }

    void setName(String name) {
        this.name = name;
    }

    String getAuthor() {
        return author;
    }

    void setAuthor(String author) {
        this.author = author;
    }

    String getIsbn() {
        return isbn;
    }

    void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    int getPublished() {
        return published;
    }

    void setPublished(int published) {
        this.published = published;
    }

    String getPublisher() {
        return publisher;
    }

    void setPublisher(String publisher) {
        this.publisher = publisher;
    }
}
