public class Woman {
    private String name;
    private int age;
    private String profession;
    private String city;

    public Woman() {
    }

    public Woman(String name, int age, String profession, String city) {
        this.name = name;
        this.age = age;
        this.profession = profession;
        this.city = city;
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

    public void setProfession(String profession) {
        this.profession = profession;
    }

    public String getProfession() {
        return this.profession;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getCity() {
        return this.city;
    }


    public String toString() {
        return "Woman=[name = " + this.name + ", age = " + this.age + ", profession = " + this.profession + ", city = " + this.city + "].";
    }
}
