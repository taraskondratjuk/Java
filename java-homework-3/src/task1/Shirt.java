package task1;

public class Shirt extends Clothe implements MensClothes, WomenClothes {


    public Shirt(Size size, int price, String color) {
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
        return "Shirt{} " + super.toString();
    }
}
