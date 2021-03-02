package task1;

import java.util.Arrays;

public class Studio {
    Clothe[] clothes;

    public Studio(Clothe[] clothes) {
        this.clothes = clothes;
    }

    public Clothe[] mensChoice() {
        Clothe [] chosenMan= new Clothe[clothes.length];
        for (int i=0;i<clothes.length;i++) {
            if (clothes[i] instanceof MensClothes) {
                chosenMan[i]=clothes[i];
            }
        }
        return chosenMan;
    }

    public Clothe[] womenChoice() {
        Clothe [] chosenWoman= new Clothe[clothes.length];
        for (int i=0;i<clothes.length;i++) {
            if (clothes[i] instanceof WomenClothes) {
                chosenWoman[i]=clothes[i];
            }
        }
        return chosenWoman;
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
