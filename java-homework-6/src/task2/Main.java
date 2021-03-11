package task2;


import java.util.TreeMap;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {

        TreeSet<Seance> mondaySeances = new TreeSet<>();
        Schedule mondaySchedule = new Schedule(mondaySeances);

        TreeSet<Seance> tuesdaySeances = new TreeSet<>();
        Schedule tuesdaySchedule = new Schedule(tuesdaySeances);

        TreeSet<Seance> wednesdaySeances = new TreeSet<>();
        Schedule wednesdaySchedule = new Schedule(wednesdaySeances);

        TreeSet<Seance> thursdaySeances = new TreeSet<>();
        Schedule thursdaySchedule = new Schedule(thursdaySeances);

        TreeSet<Seance> fridaySeances = new TreeSet<>();
        Schedule fridaySchedule = new Schedule(fridaySeances);

        TreeSet<Seance> saturdaySeances = new TreeSet<>();
        Schedule saturdaySchedule = new Schedule(saturdaySeances);

        TreeSet<Seance> sundaySeances = new TreeSet<>();
        Schedule sundaySchedule = new Schedule(sundaySeances);


        TreeMap<Days, Schedule> cinemaSchedule = new TreeMap<>();
        cinemaSchedule.put(Days.MONDAY, mondaySchedule);
        cinemaSchedule.put(Days.TUESDAY, tuesdaySchedule);
        cinemaSchedule.put(Days.WEDNESDAY, wednesdaySchedule);
        cinemaSchedule.put(Days.THURSDAY, thursdaySchedule);
        cinemaSchedule.put(Days.FRIDAY, fridaySchedule);
        cinemaSchedule.put(Days.SATURDAY, saturdaySchedule);
        cinemaSchedule.put(Days.SUNDAY, sundaySchedule);

        Cinema cinema = new Cinema(cinemaSchedule, new Time(9, 0), new Time(22, 0));


        Movie superMan = new Movie("Super Man", new Time(1, 33));
        Movie betMan = new Movie("Bet Man", new Time(1, 12));
        Movie superMario = new Movie("Super Mario", new Time(1, 0));
        Movie deepWater = new Movie("Deep Water", new Time(1, 18));


        Seance seance = new Seance(superMan, new Time(19, 44));
        Seance seance1 = new Seance(betMan, new Time(14, 10));
        Seance seance2 = new Seance(superMario, new Time(21, 0));
        Seance seance3 = new Seance(deepWater, new Time(9, 25));

        System.out.println(cinema.addSeances(Days.MONDAY,seance1));
        System.out.println(cinema.addSeances(Days.TUESDAY,seance1,seance,seance2));
        System.out.println(cinema.addSeances(Days.FRIDAY,seance1,seance3,seance));




        cinema.removeMovie(betMan);

        System.out.println(cinema.toString());





    }
}
