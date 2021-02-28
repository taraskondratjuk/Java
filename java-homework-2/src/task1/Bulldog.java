package task1;

public class Bulldog extends Dog {
    private String name;

    public Bulldog() {
    }

    public Bulldog(String type, int countLegs, String color, String name) {
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
        return "Bulldog{" +
                "name='" + name + '\'' +
                "} " + super.toString();
    }
}
