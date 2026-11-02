package lab5.task1;

public class Documentary extends Movie {
    private String director;

    public Documentary(String title, int duration,
                       double rating, String director) {
        super(title, duration, rating);
        this.director = director;
    }

    public String getDirector() {
        return director;
    }

    @Override
    public String toString() {
        return super.toString() + "\nрежиссер: " + director;
    }

    public String uniqueShots() {
        return "документалка \"" + title +
                "\" снята с ипользованием уник методов съемки";
    }

}
