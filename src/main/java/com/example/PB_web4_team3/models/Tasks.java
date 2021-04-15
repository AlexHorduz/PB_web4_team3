package com.example.PB_web4_team3.models;

import java.util.ArrayList;
import java.util.Iterator;

public class Tasks {
    public static boolean Task1(Films_DB db) {
        ArrayList<Actor> actors = (ArrayList<Actor>)db.getActors();
        for (Iterator<Actor> it = actors.iterator(); it.hasNext(); ) {
            if (it.next().getFilms().isEmpty())
                return true;
        }
        return false;
    }


    public static ArrayList<Actor> Task2(Actor actor) {
        if (actor == null)
            throw new NullPointerException("NULL passed as a parameter");
        ArrayList<Actor> actorsToReturn = new ArrayList<>();
        for (Iterator filmsIt = actor.getFilms().iterator(); filmsIt.hasNext(); ) {
            for (Iterator actorsIt = ((Film)filmsIt.next()).getActors().iterator(); actorsIt.hasNext(); ) {
                Actor otherActor = (Actor) actorsIt.next();
                if ((otherActor != actor) && (!actorsToReturn.contains(otherActor))) {
                    actorsToReturn.add(otherActor);
                }
            }
        }
        return actorsToReturn;
    }

    public static Film Task3(Films_DB db)  {
        ArrayList<Film> allFilms = (ArrayList<Film>) db.getFilms();
        if (allFilms.size() == 0)
            throw new IllegalArgumentException("There is no films in the database");
        Film theBiggestFilm = allFilms.get(0);
        for (Film film : allFilms) {
            if (film.getActors().size() > theBiggestFilm.getActors().size()) {
                theBiggestFilm = film;
            }
        }
        return theBiggestFilm;
    }
}
