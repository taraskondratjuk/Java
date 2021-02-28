package task1;

public class Pitbull extends Dog{
    private String name;

    public Pitbull() {
    }

    public Pitbull(String type, int countLegs, String color, String name) {
        super(type, countLegs, color);
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    @Override
    public String toString() {
        return "Pitbull{" +
                "name='" + name + '\'' +
                "} " + super.toString();
    }
}
