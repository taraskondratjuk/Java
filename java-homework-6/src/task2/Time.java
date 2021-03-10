package task2;

public class Time {
    private int hour;
    private int min;

    public Time() {
    }

    public Time(int hour, int min) {
        if (min >= 0 && min <= 59) {
            this.min = min;
        } else {
            System.out.println("Ви ввели не вірні дані( діапазон хвилин від 0 до 59 )");
        }

        if (hour >= 0 && hour <= 23) {
            this.hour = hour;
        } else {
            System.out.println("Ви ввели не вірні дані( діапазон годин від 0 до 23 )");
        }
    }

    public int getMin() {
        return min;
    }

    public void setMin(int min) {
        if (min >= 0 && min <= 59) {
            this.min = min;
        } else {
            System.out.println("Ви ввели не вірні дані( діапазон хвилин від 0 до 59 )");
        }

    }

    public int getHour() {
        return hour;
    }

    public void setHour(int hour) {
        if (hour >= 0 && hour <= 23) {
            this.hour = hour;
        } else {
            System.out.println("Ви ввели не вірні дані( діапазон годин від 0 до 23 )");
        }
    }


    @Override
    public String toString() {
        return  hour + " година " + min + " хвилин";
    }
}
