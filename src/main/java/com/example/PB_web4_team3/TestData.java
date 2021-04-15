package com.example.PB_web4_team3;

import com.example.PB_web4_team3.models.Actor;
import com.example.PB_web4_team3.models.Film;
import com.example.PB_web4_team3.models.Films_DB;

import java.util.ArrayList;
import java.util.Arrays;

public class TestData {
    private static Films_DB db = new Films_DB();
    private static Actor actor = new Actor("Wil Smith");
    static {
        db.addActor(actor);
        Actor tommy = new Actor("Tommy Lee Jones");
        db.addActor(tommy);
        Film menInBlack = new Film("Men in Black", new ArrayList<>(Arrays.asList(tommy, actor)));
        tommy.addFilm(menInBlack);
        actor.addFilm(menInBlack);
        db.addFilm(menInBlack);
        Actor dan = new Actor("Daniel Radcliffe");
        db.addActor(dan);
        Film harry = new Film("Harry Potter", new ArrayList<Actor>(Arrays.asList(dan)));
        db.addFilm(harry);
        dan.addFilm(harry);
        Actor me = new Actor("Alex Horduz");
        db.addActor(me);
    }
    public static Films_DB getDB() {
        return db;
    }

    public static Actor getActor() {
        return actor;
    }
}
