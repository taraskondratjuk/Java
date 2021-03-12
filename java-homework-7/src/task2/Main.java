package task2;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Shirt shirt = new Shirt(Size.S, 755, "Green");
        Pants pants = new Pants(Size.L, 1500, "Black");
        Dress dress = new Dress(Size.L, 1855, "Red");
        Tie tie = new Tie(Size.S, 825, "Yellow");



        List<Clothe> clothes = new ArrayList<>();
        clothes.add(shirt);
        clothes.add(pants);
        clothes.add(dress);
        clothes.add(tie);

        Studio studio = new Studio(clothes);


        List<Clothe> mensChoice=studio.mensChoice();
        mensChoice.forEach(clothe -> System.out.println(clothe));

        System.out.println("-------------------------------------------");

        List<Clothe> womenChoice=studio.womenChoice();
        womenChoice.forEach(clothe -> System.out.println(clothe));
    }
}
