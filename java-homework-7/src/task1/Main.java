package task1;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        User user1 = new User(1, "Taras", 28, Sex.MALE);
        User user2 = new User(2, "Nazar", 27, Sex.MALE);
        User user3 = new User(3, "Oleg", 28, Sex.MALE);
        User user4 = new User(4, "Diana", 24, Sex.FEMALE);
        User user5 = new User(5, "Julia", 26, Sex.FEMALE);
        User user6 = new User(6, "Ira", 29, Sex.FEMALE);
        User user7 = new User(7, "Vasil", 29, Sex.MALE);
        User user8 = new User(8, "Yuriy", 22, Sex.MALE);
        User user9 = new User(9, "Svitlana", 24, Sex.FEMALE);
        User user10 = new User(10, "Maria", 28, Sex.FEMALE);

        List<User> users = new ArrayList<>();
        users.add(user1);
        users.add(user2);
        users.add(user3);
        users.add(user4);
        users.add(user5);
        users.add(user6);
        users.add(user7);
        users.add(user8);
        users.add(user9);
        users.add(user10);

        List<User> sortById = users.stream().filter(user -> (user.getId() % 2 == 0)).collect(Collectors.toList());
//        for (User u : sortById) {
//            System.out.println(u);
//        }

        List<User> sortByName = users.stream().filter(user -> user.getName().length()<5).collect(Collectors.toList());
//        for (User u : sortByName) {
//            System.out.println(u);
//        }

        List<User> sortByMale = users.stream().filter(user -> user.getSex().equals(Sex.FEMALE)).collect(Collectors.toList());
//        for (User u : sortByMale) {
//            System.out.println(u);
//        }


    }
}

