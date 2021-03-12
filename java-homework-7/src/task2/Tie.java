package task2;

public class Tie extends Clothe implements MensClothes {

    public Tie() {
    }

    public Tie(Size size, double prize, String color) {
        super(size, prize, color);
    }

    @Override
    public void getDressedMan() {
        System.out.println("Чоловіка одягаємо...");
    }

    @Override
    public String toString() {
        return "Tie{" +
                "size=" + size +
                "} " + super.toString();
    }
}
