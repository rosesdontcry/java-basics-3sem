package lab5.task1;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Movie> movies = new ArrayList<>();

        movies.add(new FeatureFilm("Матрица", 136, 8.7, "Фантастика"));
        movies.add(new FeatureFilm("Титаник", 195, 7.9, "Драма"));
        movies.add(new Documentary("Планета Земля", 50, 9.3, "Алистер Фотергилл"));
        movies.add(new Documentary("Человек на проволоке", 94, 8.0, "Джеймс Марш"));

        FeatureFilm duplicate = new FeatureFilm("Матрица", 136, 5.0, "Боевик");


        for (Movie movie : movies) {
            System.out.println(movie.toString());

            if (movie instanceof FeatureFilm ff) {
                System.out.println("\tэто художественный фильм");
            } else if (movie instanceof Documentary doc) {
                System.out.println("\tэто документальный фильм");
                System.out.println("\t" + doc.uniqueShots());
            }

            System.out.println();
        }


        Movie firstMovie = movies.get(0);
        System.out.println("??: " + firstMovie.getTitle() +
                " и " + duplicate.getTitle() +
                " -> " + firstMovie.equals(duplicate));

        Movie anotherMovie = movies.get(1);
        System.out.println("??: " + firstMovie.getTitle() +
                " и " + anotherMovie.getTitle() +
                " -> " + firstMovie.equals(anotherMovie));
    }
}
