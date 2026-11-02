package lab5.task1;

public abstract class Movie {
    protected String title;
    protected int duration;
    protected double rating;

    public Movie(String tittle, int duration, double rating) {
        this.title = tittle;
        this.duration = duration;
        this.rating = rating;
    }

    public String getTitle() {
        return title;
    }

    public int getDuration() {
        return duration;
    }

    public double getRating() {
        return rating;
    }

    @Override
    public String toString() {
        return "название: " + title +
                "\nпродолжительность: " + duration +
                "\nрейтинг: " + rating;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }

        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }

        Movie other = (Movie) obj;
        return this.duration == other.duration &&
                this.title.equals(other.title);
    }

    @Override
    public int hashCode() {
        return java.util.Objects.hash(title, duration);
    }
}
