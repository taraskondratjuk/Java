package task1;

import java.util.*;

public class Main {


    public static void main(String[] args) {

        ZooClub zooClub = new ZooClub();
        Map<Person, List<Pet>> map = new HashMap<>();
        boolean isWork = true;


        do {
            System.out.println("----------------------------------------------------");
            System.out.println("Виберіть, що вихочете зробити");
            System.out.println("1. додати учасника в клуб.");
            System.out.println("2. додати тваринку до учасника клубу.");
            System.out.println("3. видалити тваринку з власника.");
            System.out.println("4. видалити учасника клубу.");
            System.out.println("5. видалити конкретну тваринку з усіх власників.");
            System.out.println("6. вивести на екран зооклуб.");
            System.out.println("7. Вихід.");
            System.out.println("----------------------------------------------------");

            Scanner scanner = new Scanner(System.in);


            String choice = scanner.nextLine();


            switch (choice) {
                case "1":
                    System.out.println("Введіть імя учасника, якого вихочете додати");
                    String name;
                    do {
                        name = scanner.nextLine();
                    } while (name.length() < 2);

                    map.put(new Person(name), null);
                    zooClub.setClub(map);

                    System.out.println("Учасник " + name + " доданий в клуб");
                    break;


                case "2":

                    String namePersonWhomAddPet;
                    boolean isNamePersonWhomAddPet = false;

                    do {
                        System.out.println("Виберіть учасника клубу зі списку, до якого ви хочете додати тваринку");
                        map.forEach(((person, pets) -> {
                            System.out.print(person.getName() + " ");
                        }));

                        namePersonWhomAddPet = scanner.nextLine();

                        Set<Map.Entry<Person, List<Pet>>> entries = map.entrySet();
                        Iterator<Map.Entry<Person, List<Pet>>> iterator = entries.iterator();
                        while (iterator.hasNext()) {
                            Map.Entry<Person, List<Pet>> next = iterator.next();
                            if (next.getKey().getName().equals(namePersonWhomAddPet)) {
                                isNamePersonWhomAddPet = true;
                                break;
                            } else {
                                isNamePersonWhomAddPet = false;
                            }
                        }
                    } while (!isNamePersonWhomAddPet);


                    System.out.println("Введіть тип домашньої тварини");
                    String petType;
                    do {
                        petType = scanner.nextLine();
                    } while (petType.length() < 2);


                    System.out.println("Введіть імя домашньої тварини");
                    String petName;
                    do {
                        petName = scanner.nextLine();
                    } while (petName.length() < 2);


                    Person person = new Person(namePersonWhomAddPet);
                    Pet pet = new Pet(petType, petName);
                    List<Pet> pets = new ArrayList<>();
                    pets.add(pet);
                    map.put(person, pets);

                    System.out.println("Тварина " + petType + " на імя " + petName + " додана до учасника клубу на імя " + namePersonWhomAddPet);
                    break;


                case "3":

                    String personWhomWillDeletePet;
                    boolean isPersonWhomWillDeletePet = false;

                    do {
                        System.out.println("Виберіть з якого учасника клубу ви хочете видалити тваринку");
                        map.forEach(((person3, pets3) -> {
                            System.out.print(person3.getName() + " ");
                        }));

                        personWhomWillDeletePet = scanner.nextLine();

                        Set<Map.Entry<Person, List<Pet>>> entries = map.entrySet();
                        Iterator<Map.Entry<Person, List<Pet>>> iterator = entries.iterator();
                        while (iterator.hasNext()) {
                            Map.Entry<Person, List<Pet>> next = iterator.next();
                            if (next.getKey().getName().equals(personWhomWillDeletePet)) {
                                next.getValue().clear();
                                isPersonWhomWillDeletePet = true;
                                break;
                            } else {
                                isPersonWhomWillDeletePet = false;
                            }
                        }
                    } while (!isPersonWhomWillDeletePet);
                    System.out.println("Тваринка успішно видалена");
                    break;


                case "4":

                    String personWhoWillDelete;
                    boolean isPersonWhoWillDelete = false;

                    do {
                        System.out.println("Виберіть якого учасника клубу ви хочете видалити");

                        if (map.isEmpty()) {
                            System.out.println("Клуб пустий");
                        } else {
                            map.forEach(((person4, pets4) -> {
                                System.out.print(person4.getName() + " ");
                            }));
                        }


                        personWhoWillDelete = scanner.nextLine();

                        Set<Map.Entry<Person, List<Pet>>> entries = map.entrySet();
                        Iterator<Map.Entry<Person, List<Pet>>> iterator = entries.iterator();
                        while (iterator.hasNext()) {
                            Map.Entry<Person, List<Pet>> next = iterator.next();
                            if (next.getKey().getName().equals(personWhoWillDelete)) {
                                iterator.remove();
                                isPersonWhoWillDelete = true;
                                break;
                            } else {
                                isPersonWhoWillDelete = false;
                            }
                        }
                    } while (!isPersonWhoWillDelete);
                    System.out.println("Учасник успішно видалений");
                    break;


                case "5":

                    boolean isPetWhoWillDelete = false;
                    do {
                        System.out.println("Виберіть тваринку, яку ви хочете видалити у всіх учасників");

                        map.forEach(((person5, pets5) -> {
                            System.out.print(pets5 + " ");
                        }));


                        String petWhoWillDelete = scanner.nextLine();

                        Set<Map.Entry<Person, List<Pet>>> entries = map.entrySet();
                        Iterator<Map.Entry<Person, List<Pet>>> iterator = entries.iterator();
                        while (iterator.hasNext()) {
                            Map.Entry<Person, List<Pet>> next = iterator.next();
                            if (next.getValue().removeIf(pet1 -> pet1.getType().equals(petWhoWillDelete))) {
                                isPetWhoWillDelete = true;
                                System.out.println("Тваринка " + petWhoWillDelete + " видалена з " + next.getKey());
                            } else {
                                isPetWhoWillDelete = false;
                            }
                        }

                    } while (!isPetWhoWillDelete);
                    System.out.println("");
                    break;


                case "6":
                    System.out.println(zooClub.toString());
                    break;
                case "7":
                    System.out.println("До побачення, заходьте ще до нас");
                    isWork = false;
                    break;
                default:
                    System.out.println("Ви вибрали не вірний варіант, спробуйте ще раз");
            }

        } while (isWork);
    }
}

