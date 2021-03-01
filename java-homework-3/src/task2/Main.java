package task2;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<User> users = new ArrayList<>();
        User user1 = new User(1, "Taras", 28, Sex.Male);
        User user2 = new User(2, "Julia", 26, Sex.Female);
        User user3 = new User(3, "Diana", 24, Sex.Female);
        User user4 = new User(4, "Nazar", 27, Sex.Male);
        User user5 = new User(5, "Oleg", 28, Sex.Male);
        User user6 = new User(6, "Yura", 27, Sex.Male);
        User user7 = new User(7, "Vasil", 29, Sex.Male);
        User user8 = new User(8, "Ruslan", 31, Sex.Male);
        User user9 = new User(9, "Ira", 22, Sex.Female);
        User user10 = new User(10, "Svitlana", 25, Sex.Female);

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


        for (User item : users) {

//   - Проітерувати колекцію юзерів, вивевши тільки юзерів з парним значенням ід
            if (item.getId() % 2 == 0) {
                System.out.println(item);
            }

//  - Проітерувати колекцію юзерів, вивевши тільки юзерів з ім'ям , довжина якого більше ніж 5 символів
            if (item.getName().length() > 5) {
                System.out.println(item);
            }

//  - Проітерувати колекцію юзерів, вивевши тільки юзерів жінок
            if (item.getSex() == Sex.Female) {
                System.out.println(item);

            }
        }
    }
}

