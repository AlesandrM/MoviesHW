package ru.netology;

import ru.netology.Movie;

public class MoviePoster {

    private Movie[] movies = new Movie[0];
    private int maxNumberOfMovies = 10;

    public MoviePoster() {
    }

    public MoviePoster(int userLength) {
        if (userLength > 0) {
            maxNumberOfMovies = userLength;
        }

    }


    public void addMovie(Movie movie) {
        int length = movies.length + 1;
        Movie[] tmp = new Movie[length];
        System.arraycopy(movies, 0, tmp, 0, movies.length);
        int lastIndex = tmp.length - 1;
        tmp[lastIndex] = movie;
        movies = tmp;
    }

    public Movie[] getLastAdd() {
        int moviesLength = movies.length;
        int localMovieLength = maxNumberOfMovies;
        if (moviesLength < localMovieLength) {
            localMovieLength = moviesLength;
        }
        Movie[] result = new Movie[localMovieLength];

        for (int i = 0; i < result.length; i++) {
            int index = moviesLength - i - 1;
            result[i] = movies[index];
        }
        return result;
    }


}
