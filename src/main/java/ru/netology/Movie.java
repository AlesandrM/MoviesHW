package ru.netology;

import java.util.Objects;

public class Movie {
    private int id;
    private String imageUrl;
    private String name;
    private String genre;

    public Movie(int id, String imageUrl, String name, String genre) {
        this.id = id;
        this.imageUrl = imageUrl;
        this.name = name;
        this.genre = genre;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Movie movie = (Movie) o;
        return id == movie.id && Objects.equals(imageUrl, movie.imageUrl) && Objects.equals(name, movie.name) && Objects.equals(genre, movie.genre);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, imageUrl, name, genre);
    }

    @Override
    public String toString() {
        return "Movie{" +
                "id=" + id +
                ", imageUrl='" + imageUrl + '\'' +
                ", name='" + name + '\'' +
                ", genre='" + genre + '\'' +
                '}';
    }
}