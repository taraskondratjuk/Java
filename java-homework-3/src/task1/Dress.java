package task1;

public class Dress extends Clothe implements WomenClothes{



    public Dress(Size size, int price, String color) {
        super(size, price, color);
    }



    @Override
    public void getDressedWoman() {

    }

    @Override
    public String toString() {
        return "Dress{} " + super.toString();
    }
}
