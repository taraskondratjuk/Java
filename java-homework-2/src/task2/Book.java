package task2;

public class Book extends Paper {
    private String genre;

    public Book() {
    }

    public Book(String color, String genre) {
        super(color);
        this.genre = genre;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }


    @Override
    public String toString() {
        return "Book{" +
                "genre='" + genre + '\'' +
                "} " + super.toString();
    }
}
