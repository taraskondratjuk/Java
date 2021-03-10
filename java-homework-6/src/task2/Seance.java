package task2;

public class Seance implements Comparable<Seance> {
    Movie movie;
    Time startTime;
    Time endTime;


    public Seance() {
    }

    public Seance(Movie movie, Time startTime) {
        this.movie = movie;
        this.startTime = startTime;

        int hour = movie.getDuration().getHour() + startTime.getHour();
        int min = movie.getDuration().getMin() + startTime.getMin();

        if (min >= 60) {
            hour++;
            min -= 60;

        }
        if (hour > 24) {
            hour -= 24;
        }

        this.endTime = new Time(hour, min);
    }

    public Movie getMovie() {
        return movie;
    }

    public void setMovie(Movie movie) {
        this.movie = movie;
    }

    public Time getStartTime() {
        return startTime;
    }

    public void setStartTime(Time startTime) {
        this.startTime = startTime;
    }

    public Time getEndTime() {
        return endTime;
    }

    public void setEndTime(Time endTime) {
        this.endTime = endTime;
    }

    @Override
    public String toString() {
        return "Seance{" + movie +
                ", Початок сеансу о " + startTime +
                ", Кінець сеансу о " + endTime +
                '}';
    }

    @Override
    public int compareTo(Seance obj) {
        if (obj.startTime.getHour() == this.startTime.getHour()) {
            return obj.startTime.getMin() - this.startTime.getMin();
        } else {
            return obj.startTime.getHour() - this.startTime.getHour();
        }
    }
}
