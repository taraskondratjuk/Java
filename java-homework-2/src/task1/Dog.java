package task1;

public class Dog extends Animal {
    private String color;

    public Dog() {
    }

    public Dog(String type, int countLegs, String color) {
        super(type, countLegs);
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
        return "Dog{" +
                "color='" + color + '\'' +
                "} " + super.toString();
    }
}
