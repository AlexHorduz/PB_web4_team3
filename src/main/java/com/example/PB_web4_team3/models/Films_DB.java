package com.example.PB_web4_team3.models;


    import java.util.ArrayList;

    public class Films_DB {
        private ArrayList<Film> films;
        private ArrayList<Actor> actors;

        public Films_DB() {
            this.films = new ArrayList<>();
            this.actors = new ArrayList<>();
        }

        public Films_DB(ArrayList<Film> films, ArrayList<Actor> actors) {
            this.films = films;
            this.actors = actors;
        }

        public void addFilm(Film film) {
            films.add(film);
        }


        public boolean removeFilm(Film film) {
            return films.remove(film);
        }

        public boolean removeFilm(int index) {
            if (index < films.size() && index >= 0)
                return removeFilm(films.get(index));
            return false;
        }

        public void addActor(Actor actor) {
            if (actor == null) {
                throw new NullPointerException("Null passed as a parameter");
            }
            actors.add(actor);
        }

        public boolean removeActor(Actor actor) {
            return actors.remove(actor);
        }

        public boolean removeActor(int index) {
            if (index < actors.size() && index >= 0)
                return removeActor(actors.get(index));
            return false;
        }

        public ArrayList<Film> getFilms() {
            return (ArrayList<Film>) films.clone();
        }

        public ArrayList<Actor> getActors() {
            return (ArrayList<Actor>) actors.clone();
        }

        @Override
        public int hashCode()
        {
            final int prime = 17;
            int result = 1;
            result = prime * result + films.hashCode();
            result = prime * result + actors.hashCode();
            return result;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) {
                return true;
            }

            if (o == null || getClass() != o.getClass()){
                return false;
            }

            Films_DB other = (Films_DB) o;

            return other.hashCode() == hashCode();
        }
    }