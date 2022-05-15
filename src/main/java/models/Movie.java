package models;

public class Movie {

    private String title;
    private Director director;
    private Actor actor;

    public Movie(String title, Director director, Actor actor) {
        this.title = title;
        this.director = director;
        this.actor = actor;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Director getDirector() {
        return director;
    }

    public void setDirector(Director director) {
        this.director = director;
    }

    public Actor getActor() {
        return actor;
    }

    public void setActor(Actor actor) {
        this.actor = actor;
    }

    @Override
    public String toString() {
        return "Movie{" +
                "title='" + title + '\'' +
                ", director=" + director +
                ", actor=" + actor +
                '}';
    }
}
