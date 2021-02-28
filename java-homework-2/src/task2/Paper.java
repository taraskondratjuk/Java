package task2;

public class Paper {
    private String color;

    public Paper() {
    }

    public Paper(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }


    @Override
    public String toString() {
        return "Paper{" +
                "color='" + color + '\'' +
                '}';
    }
}

