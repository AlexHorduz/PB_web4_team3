package com.example.PB_web4_team3.models;

import java.util.ArrayList;

public class Actor {
    private final String name;
    private ArrayList<Film> films;

    public Actor(String name) {
        this.name = name;
        this.films = new ArrayList<Film>();
    }

    public String getName() {
        return this.name;
    }

    public ArrayList<Film> getFilms() {
        return (ArrayList<Film>) this.films.clone();
    }

    public void addFilm(Film film) {
        this.films.add(film);
    }

    @Override
    public int hashCode()
    {
        final int prime = 17;
        return (prime + name.hashCode());
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }

        if (o == null || getClass() != o.getClass()){
            return false;
        }

        Actor other = (Actor) o;

        return other.hashCode() == hashCode();
    }

    @Override
    public String toString() {
        return this.name;
    }
}