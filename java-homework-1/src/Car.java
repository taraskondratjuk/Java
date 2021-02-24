public class Car {
    private String mark;
    private String model;
    private int year;
    private int price;

    public Car() {
    }

    public Car(String mark, String model, int year, int price) {
        this.mark = mark;
        this.model = model;
        this.year = year;
        this.price = price;
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

    public String toString() {
        return "Car=[mark = " + this.mark + ", model = " + this.model + ", year = " + this.year + ", price = " + this.price + "].";
    }


}
