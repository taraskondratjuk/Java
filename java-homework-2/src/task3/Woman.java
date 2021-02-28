package task3;

public class Woman implements WomensClothes {
    private String name;
    private int age;

    public Woman() {
    }

    public Woman(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String getDressedWoman(String clothes) {
        return this.name + " тепер носить " + clothes;
    }


    @Override
    public String toString() {
        return "Woman{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
