package task1;

public class Bird extends Animal{
    private String name;

    public Bird() {
    }

    public Bird(String type, int countLegs, String name) {
        super(type, countLegs);
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
        return "Bird{" +
                "name='" + name + '\'' +
                "} " + super.toString();
    }
}

