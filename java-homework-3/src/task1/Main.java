package task1;

public class Main {
    public static void main(String[] args) {
        Pants pants = new Pants(Size.L,2100,"Brown");
        Dress dress = new Dress(Size.M, 2100, "White");
        Shirt shirt = new Shirt(Size.L, 750, "Black");
        Tie tie = new Tie(Size.XS, 500, "Green");

        Clothe[] clothes = new Clothe[4];
        clothes[0] = pants;
        clothes[1] = dress;
        clothes[2] = shirt;
        clothes[3] = tie;


        Studio studio = new Studio(clothes);

        Clothe[] mensClothes=studio.mensChoice();

        Clothe[] womenClothes=studio.womenChoice();

//        for (Clothe item :mensClothes){
//            System.out.println(item);
//        }

        for (Clothe item :womenClothes){
            System.out.println(item);
        }
    }
}
