public class Main {
    public static void main(String[] args) {
        Woman woman = new Woman("Diana", 24, "Designer", "Lvov");
        System.out.println(woman);
        Car car = new Car("Audi", "A6", 2021, 36500);
        System.out.println(car);
        Man taras = new Man("Taras", 28, "Lvov", woman, car);
        System.out.println(taras);
        Man nazar = new Man("Nazar", 27, "Lvov", "Julia", 26, "Designer", "Lvov", "Opel", "Zafira", 2010, 8200);
        System.out.println(nazar);
        nazar.setCar(car);
        System.out.println(nazar);
        nazar.setWoman("Svitlana",24,"Seller","Kyiv");
        System.out.println(nazar);

    }
}
