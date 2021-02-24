public class Man {
    private String name;
    private int age;
    private String city;
    private Woman woman;
    private Car car;

    public Man() {
    }

    public Man(String name, int age, String city, Woman woman, Car car) {
        this.name = name;
        this.age = age;
        this.city = city;
        this.woman = woman;
        this.car = car;
    }

    public Man(String name, int age, String city, String womanName, int womanAge, String womanProfession, String womanCity, String carMark, String carModel, int carYear, int carPrice, Engine engine) {
        this.name = name;
        this.age = age;
        this.city = city;
        this.woman = new Woman(womanName, womanAge, womanProfession, womanCity);
        this.car = new Car(carMark, carModel, carYear, carPrice, engine);

    }

    public Man(String name, int age, String city, String womanName, int womanAge, String womanProfession, String womanCity, String carMark, String carModel, int carYear, int carPrice, int numberOfCylinders, String type, double volume, int power) {
        this.name = name;
        this.age = age;
        this.city = city;
        this.woman = new Woman(womanName, womanAge, womanProfession, womanCity);
        this.car = new Car(carMark, carModel, carYear, carPrice, new Engine(numberOfCylinders, type, volume, power));

    }


    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return this.age;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getCity() {
        return this.city;
    }

    public void setWoman(Woman woman) {
        this.woman = woman;
    }

    public void setWoman(String name, int age, String profession, String city) {
        this.woman = new Woman(name, age, profession, city);
    }

    public Woman getWoman() {
        return this.woman;
    }

    public void setCar(Car car) {
        this.car = car;
    }

    public void setCar(String mark, String model, int year, int price, Engine engine) {
        this.car = new Car(mark, model, year, price, engine);
    }

    public void setCar(String mark, String model, int year, int price, int numberOfCylinders, String type, double volume, int power) {
        this.car = new Car(mark, model, year, price, new Engine(numberOfCylinders, type, volume, power));
    }

    public Car getCar(Car car) {
        return this.car;
    }


    public String toString() {
        return "name = " + this.name + ", age = " + this.age + ", city = " + this.city + ", " + this.woman + ", " + this.car + "";
    }
}
