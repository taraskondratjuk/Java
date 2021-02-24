public class Car {
    private String mark;
    private String model;
    private int year;
    private int price;
    private Engine engine;

    public Car() {
    }

    public Car(String mark, String model, int year, int price, Engine engine) {
        this.mark = mark;
        this.model = model;
        this.year = year;
        this.price = price;
        this.engine = engine;
    }


    public Car(String mark, String model, int year, int price, int numberOfCylinders, String type, double volume, int power) {
        this.mark = mark;
        this.model = model;
        this.year = year;
        this.price = price;
        this.engine = new Engine(numberOfCylinders, type, volume, power);
    }

    public void setMark(String mark) {
        this.mark = mark;
    }

    public String getMark() {
        return this.mark;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getModel() {
        return this.model;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getYear() {
        return this.year;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getPrice() {
        return this.price;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    public void setEngine(int numberOfCylinders, String type, double volume, int power) {
        this.engine = new Engine(numberOfCylinders, type, volume, power);
    }

    public String toString() {
        return "Car=[mark = " + this.mark + ", model = " + this.model + ", year = " + this.year + ", price = " + this.price + ", " + this.engine;
    }


}
