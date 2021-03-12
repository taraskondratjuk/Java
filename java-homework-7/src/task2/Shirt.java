package task2;

public class Shirt extends Clothe implements MensClothes,WomenClothes{

    public Shirt() {
    }

    public Shirt(Size size, double prize, String color) {
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
        return "Shirt{" +
                "size=" + size +
                "} " + super.toString();
    }
}
