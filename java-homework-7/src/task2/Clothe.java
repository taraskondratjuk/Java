package task2;

public abstract class Clothe {
    Size size;
    private double prize;
    private String color;

    public Clothe() {
    }

    public Clothe(Size size, double prize, String color) {
        this.size = size;
        this.prize = prize;
        this.color = color;
    }

    public Size getSize() {
        return size;
    }

    public void setSize(Size size) {
        this.size = size;
    }

    public double getPrize() {
        return prize;
    }

    public void setPrize(double prize) {
        this.prize = prize;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }


    @Override
    public String toString() {
        return "Clothe{" +
                "size=" + size +
                ", prize=" + prize +
                ", color='" + color + '\'' +
                '}';
    }
}
