package task2;

public class Pants extends Clothe implements MensClothes,WomenClothes{
    public Pants() {
    }

    public Pants(Size size, double prize, String color) {
        super(size, prize, color);
    }

    @Override
    public void getDressedMan() {
        System.out.println("Чоловіка одягаємо...");
    }

    @Override
    public void getDressedWoman() {
        System.out.println("Жінку одягаємо...");
    }

    @Override
    public String toString() {
        return "Pants{" +
                "size=" + size +
                "} " + super.toString();
    }
}
