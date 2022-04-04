package ru.netology;

import org.junit.jupiter.api.Test;


import static org.junit.jupiter.api.Assertions.*;

class MoviePosterTest {

    private final Movie first = new Movie(1, "http://", "Spider-Man: No Way Home", "Adventure");
    private final Movie second = new Movie(2, "http://", "No Time To Die", "Thriller");
    private final Movie third = new Movie(3, "http://", "Shang-Chi And The Legend Of The Ten Rings", "Fantasy");
    private final Movie fourth = new Movie(4, "http://", "The Father", "Drama");
    private final Movie fifth = new Movie(5, "http://", "Dune", "Adventure");
    private final Movie sixth = new Movie(6, "http://", "ШеA Quiet Place: Part II", "Thriller");
    private final Movie seventh = new Movie(7, "http://", "Palm Springs", "Mystery");
    private final Movie eighth = new Movie(8, "http://", "The Suicide Squad", "Adventure");
    private final Movie ninth = new Movie(9, "http://", "Free Guy", "Comedy");
    private final Movie tenth = new Movie(10, "http://", "Cruella", "Crime");


    @Test
        // должен показывать последние 10 фильмов
    void shouldShowLast10Movies() {
        MoviePoster poster = new MoviePoster(10);
        poster.addMovie(first);
        poster.addMovie(second);
        poster.addMovie(third);
        poster.addMovie(fourth);
        poster.addMovie(fifth);
        poster.addMovie(sixth);
        poster.addMovie(seventh);
        poster.addMovie(eighth);
        poster.addMovie(ninth);
        poster.addMovie(tenth);
        Movie[] expected = {tenth, ninth, eighth, seventh, sixth, fifth, fourth, third, second, first};
        Movie[] actual = poster.getLastAdd();
        assertArrayEquals(expected, actual);
    }

    @Test
        // показывать 4 фильма из списка

    void shouldShowCustomMovieLength() {
        MoviePoster poster = new MoviePoster(4);
        poster.addMovie(first);
        poster.addMovie(second);
        poster.addMovie(third);
        poster.addMovie(fourth);
        Movie[] expected = {fourth, third, second, first};
        Movie[] actual = poster.getLastAdd();
        assertArrayEquals(expected, actual);
    }



    @Test
        //должен показывать больше максимума
    void mustShowOverMax() {
        MoviePoster poster = new MoviePoster(15);
        poster.addMovie(first);
        poster.addMovie(second);
        poster.addMovie(third);
        poster.addMovie(fourth);
        poster.addMovie(fifth);
        poster.addMovie(sixth);
        poster.addMovie(seventh);
        poster.addMovie(eighth);
        poster.addMovie(ninth);
        poster.addMovie(tenth);
        Movie[] expected = {tenth, ninth, eighth, seventh, sixth, fifth, fourth, third, second, first};
        Movie[] actual = poster.getLastAdd();
        assertArrayEquals(expected, actual);

    }

    @Test
        // ни чего не показывать
    void mustShowNothing() {
        MoviePoster poster = new MoviePoster();
        Movie[] actual = poster.getLastAdd();
        Movie[] expected = {};
        assertArrayEquals(expected, actual);
    }


}

