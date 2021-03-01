package task1;

public class Tie extends Clothe implements MensClothes{

    public Tie(Size size, int price, String color) {
        super(size, price, color);
    }



    @Override
    public void getDressedMan() {

    }

    @Override
    public String toString() {
        return "Tie{} " + super.toString();
    }
}
