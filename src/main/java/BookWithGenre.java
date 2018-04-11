public class BookWithGenre {

    private String title;
    private Genre genre;

    public BookWithGenre(String title, Genre genre) {
        this.title = title;
        this.genre = genre;
    }

    public String getTitle() {
        return this.title;
    }

    public Genre getGenre() {
        return this.genre;
    }

    public String getDescription() {
        return this.genre.getValue();
    }
}