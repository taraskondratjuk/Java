package task2;


public class Main {
    public static void main(String[] args) {
        Movie movie = new Movie("SuperMan", new Time(3, 16));


        Seance seance = new Seance(movie, new Time(19, 44));
        Seance seance1 = new Seance(movie, new Time(14, 10));
        Seance seance2 = new Seance(movie, new Time(12, 33));
        Seance seance3 = new Seance(movie, new Time(9, 25));


        Schedule schedule = new Schedule();
        schedule.seances.add(seance);
//        schedule.addSeance(seance1);
//        schedule.addSeance(seance2);
//        schedule.addSeance(seance3);
        System.out.println(schedule.toString());



    }
}
