package task1;

public class Eagle extends Bird{
    private int age;

    public Eagle() {
    }

    public Eagle(String type, int countLegs, String name, int age) {
        super(type, countLegs, name);
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }


    @Override
    public String toString() {
        return "Eagle{" +
                "age=" + age +
                "} " + super.toString();
    }
}
