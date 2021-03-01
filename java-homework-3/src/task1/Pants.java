package task1;

public class Pants extends Clothe implements MensClothes, WomenClothes{



    public Pants(Size size, int price, String color) {
        super(size, price, color);
    }

    @Override
    public void getDressedMan() {

    }

    @Override
    public void getDressedWoman() {

    }

    @Override
    public String toString() {
        return "Pants{} " + super.toString();
    }


}
