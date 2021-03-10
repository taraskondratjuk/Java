package task1;

import java.util.Objects;

public class Pet {
    private String type;
    private String name;

    public Pet() {
    }

    public Pet(String type, String name) {
        this.type = type;
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Pet pet = (Pet) o;
        return Objects.equals(type, pet.type) && Objects.equals(name, pet.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(type, name);
    }


    @Override
    public String toString() {
        return "Pet(" +
                "type='" + type + '\'' +
                ", name='" + name + '\'' +
                ')';
    }
}
