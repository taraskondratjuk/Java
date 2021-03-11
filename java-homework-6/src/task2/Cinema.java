package task2;

import java.util.*;

public class Cinema {
    TreeMap<Days, Schedule> cinema;
    Time open;
    Time close;

    public Cinema() {
    }

    public Cinema(TreeMap<Days, Schedule> cinema, Time open, Time close) {
        this.cinema = cinema;
        this.open = open;
        this.close = close;
    }

    public TreeMap<Days, Schedule> getCinema() {
        return cinema;
    }

    public void setCinema(TreeMap<Days, Schedule> cinema) {
        this.cinema = cinema;
    }

    public Time getOpen() {
        return open;
    }

    public void setOpen(Time open) {
        this.open = open;
    }

    public Time getClose() {
        return close;
    }

    public void setClose(Time close) {
        this.close = close;
    }


    public Error checkIfCinemaOpen(Seance seance, Time open, Time close) {


        if (seance.startTime.getHour() < open.getHour()) {
            return new Error(false, "Ви не можете внести цей фільм у розклад, кінотеатр ще закритий!!");

        } else if (seance.startTime.getHour() > close.getHour()) {
            return new Error(false, "Ви не можете внести цей фільм у розклад, кінотеатр вже закритий у цей час!!");

        } else if (seance.endTime.getHour() > close.getHour()) {
            return new Error(false, "Ви не можете внести цей фільм у розклад, він триває довше, ніж працює кінотеатер!!");

        } else if (seance.endTime.getHour() == close.getHour() && seance.endTime.getMin() > 0) {
            return new Error(false, "Ви не можете внести цей фільм у розклад, він триває довше, ніж працює кінотеатер!!");

        } else {
            return new Error(true, "Сеанс внесено у розклад");
        }
    }


    public void addSeance(Days days, Seance seance) {

        Error error = checkIfCinemaOpen(seance, this.open, this.close);

        if (error.getResult()) {

            Set<Map.Entry<Days, Schedule>> entries = cinema.entrySet();

            Iterator<Map.Entry<Days, Schedule>> iterator = entries.iterator();
            while (iterator.hasNext()) {
                Map.Entry<Days, Schedule> next = iterator.next();
                if (next.getKey().equals(days)) {
                    next.getValue().addSeance(seance);
                }
            }
        }
        System.out.println(error.getCause());
    }


    public List<Error> addSeances(Days days, Seance... seances) {


        List<Error> errors = new ArrayList<>();


        for (int i = 0; i < seances.length; i++) {

            errors.add(checkIfCinemaOpen(seances[i], open, close));

            if (errors.get(i).getResult()) {

                Set<Map.Entry<Days, Schedule>> entries = cinema.entrySet();
                Iterator<Map.Entry<Days, Schedule>> iterator = entries.iterator();
                while (iterator.hasNext()) {
                    Map.Entry<Days, Schedule> next = iterator.next();
                    if (next.getKey().equals(days)) {
                        next.getValue().addSeance(seances[i]);
                    }
                }
            }
        }
        return errors;
    }

    public void removeMovie(Movie movie) {

        Set<Map.Entry<Days, Schedule>> entries = cinema.entrySet();
        Iterator<Map.Entry<Days, Schedule>> iterator = entries.iterator();

        while (iterator.hasNext()) {
            Map.Entry<Days, Schedule> next = iterator.next();
            if (iterator.hasNext()) {
                next.getValue().getSeances().removeIf(seance -> seance.movie.equals(movie));
            }
        }

        System.out.println(movie + " був видалений із усіх сеансів");

    }

    public void removeSeance(Days days, Seance seance) {


        Set<Map.Entry<Days, Schedule>> entries = cinema.entrySet();
        Iterator<Map.Entry<Days, Schedule>> iterator = entries.iterator();
        while (iterator.hasNext()) {
            Map.Entry<Days, Schedule> next = iterator.next();
            if (next.getKey().equals(days)) {
                next.getValue().removeSeance(seance);
                System.out.println("Сеанс " + seance + ", було видалено з розкладу");
            } else {
                System.out.println("Такого сеансу не існує");
            }
        }

    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Cinema cinema1 = (Cinema) o;
        return Objects.equals(cinema, cinema1.cinema) && Objects.equals(open, cinema1.open) && Objects.equals(close, cinema1.close);
    }

    @Override
    public int hashCode() {
        return Objects.hash(cinema, open, close);
    }


    @Override
    public String toString() {
        return "Розклад кінотеатру : " +
                cinema +
                ", Кінотеатер відчиняється о " + open +
                ", Кінотеатер зачиняється о " + close;
    }
}
