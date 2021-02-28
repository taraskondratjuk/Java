package task1;

public class Main {
    public static void main(String[] args) {
        Animal parrot = new Parrot("Bird", 2, "Charly", true);
        Animal eagle = new Eagle("Bird", 2, "Eagle", 14);
        Animal bullDog = new Bulldog("Dog", 4, "white", "Tuzik");
        Animal pitBull = new Pitbull("Dog", 3, "black", "Murzik");

        Animal[] animals = new Animal[4];
        animals[0] = parrot;
        animals[1] = eagle;
        animals[2] = bullDog;
        animals[3] = pitBull;


        Dog[] dogs = new Dog[2];
        Dog pitBull2 = new Pitbull("Dog", 4, "white", "Nick");
        Dog bullDog2 = new Bulldog("Dog", 4, "brown", "Charly");
        dogs[0] = bullDog2;
        dogs[1] = pitBull2;

        Bird[] birds = new Bird[2];
        Bird parrot2 = new Parrot("Bird", 2, "Chik", false);
        Bird eagle2 = new Eagle("Bird", 2, "Eagle", 14);
        birds[0]=parrot2;
        birds[1]=eagle2;


    }
}
