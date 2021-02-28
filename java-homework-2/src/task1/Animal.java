package task1;

public class Animal {
    private String type;
    private int countLegs;

    public Animal() {
    }

    public Animal(String type, int countLegs) {
        this.type = type;
        this.countLegs = countLegs;
    }

    public void setType(String type){
        this.type=type;
    }

    public String getType(){
        return this.type;
    }

    public void setCountLegs(int countLegs){
        this.countLegs=countLegs;
    }

    public int getCountLegs(){
        return this.countLegs;
    }


    @Override
    public String toString() {
        return "Animal{" +
                "type='" + type + '\'' +
                ", countLegs=" + countLegs +
                '}';
    }
}
