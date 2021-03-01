package task1;

import java.util.Arrays;

public class Studio {
    Clothe[] clothes;

    public Studio(Clothe[] clothes) {
        this.clothes = clothes;
    }

    public Clothe mensChoice() {
        for (Clothe item : clothes) {
            if (item instanceof MensClothes) {
                return item;
            }
        }
        return null;
    }

    public Clothe womenChoice() {
        for (Clothe item : clothes) {
            if (item instanceof WomenClothes) {
                return item;
            }
        }
        return null;
    }

    public Clothe[] getClothes() {
        return clothes;
    }

    public void setClothes(Clothe[] clothes) {
        this.clothes = clothes;
    }


    @Override
    public String toString() {
        return "Studio{" +
                "clothes=" + Arrays.toString(clothes) +
                '}';
    }
}
