package com.example.PB_web4_team3.models;

import java.util.ArrayList;

public class Film {
    private final String name;
    private final ArrayList<Actor> actors;

    public Film(String name, ArrayList<Actor> actors) {
        this.name = name;
        this.actors = actors;
    }

    public String getName() {
        return this.name;
    }

    public ArrayList<Actor> getActors() {
        return (ArrayList<Actor>) this.actors.clone();
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

        Film other = (Film) o;

        return other.hashCode() == hashCode();
    }

    @Override
    public String toString() {
        return "\"" + this.name +  "\"" + " Actors: " + this.actors.toString();
    }

}