public class Engine {
    private int numberOfCylinders;
    private String type;
    private double volume;
    private int power;

    public Engine() {
    }

    public Engine(int numberOfCylinders, String type, double volume, int power) {
        this.numberOfCylinders = numberOfCylinders;
        this.type = type;
        this.volume = volume;
        this.power = power;

    }

    public void setNumberOfCylinders(int numberOfCylinders) {
        this.numberOfCylinders = numberOfCylinders;
    }

    public int getNumberOfCylinders() {
        return this.numberOfCylinders;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getType() {
        return this.type;
    }

    public void setVolume(double volume) {
        this.volume = volume;
    }

    public double getVolume() {
        return this.volume;
    }

    public void setPower(int power) {
        this.power = power;
    }

    public int getPower() {
        return this.power;
    }

    public String toString() {
        return "Engine = [numberOfCylinders = " + this.numberOfCylinders + ", type = " + this.type + ", volume = " + this.volume + ", power = " + this.power + "]";
    }

}
