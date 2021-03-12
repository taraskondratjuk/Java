package task2;

public class Dress extends Clothe implements WomenClothes{

    public Dress() {
    }

    public Dress(Size size, double prize, String color) {
        super(size, prize, color);
    }

    @Override
    public void getDressedWoman() {
        System.out.println("Жінку одягаємо...");
    }

    @Override
    public String toString() {
        return "Dress{" +
                "size=" + size +
                "} " + super.toString();
    }
}
