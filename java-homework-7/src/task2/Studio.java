package task2;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Studio {
    List<Clothe> clothes=new ArrayList<>();

    public Studio(List<Clothe> clothes) {
        this.clothes = clothes;
    }

    public List<Clothe> mensChoice() {

        List<Clothe> mensChoice = clothes.stream()
                .filter(clothe -> clothe instanceof MensClothes)
                .collect(Collectors.toList());
        return mensChoice;

    }

    public List<Clothe> womenChoice() {

        List<Clothe> womenChoice = clothes.stream()
                .filter(clothe -> clothe instanceof WomenClothes)
                .collect(Collectors.toList());
        return womenChoice;
    }

}
