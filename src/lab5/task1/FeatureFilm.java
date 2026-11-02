package lab5.task1;

public class FeatureFilm extends Movie{
    private String genre;

    public FeatureFilm(String title, int duration,
                       double rating, String genre) {
        super(title, duration, rating);
        this.genre = genre;
    }

    public String getGenre() {
        return genre;
    }

    @Override
    public String toString() {
        return super.toString() + "\nжанр: " + genre;
    }
}
