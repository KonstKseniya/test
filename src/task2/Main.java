package task2;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        FamilyFinder familyFinder = new FamilyFinder();
        Scanner scan = new Scanner(System.in);

        System.out.println("Введите количество домов:");
        int quantityHouses = scan.nextInt();
        scan.nextLine();

        List<House> houses = new ArrayList<>();
        for (int i = 0; i < quantityHouses; i++) {
            System.out.println("Введите номер дома:");
            int numberHouse = Integer.parseInt(scan.next());

            House house = new House(numberHouse, new ArrayList<>());

            System.out.println("Введите количество квартир в доме:");
            int quantityRooms = Integer.parseInt(scan.next());
            for (int j = 0; j < quantityRooms; j++) {
                System.out.println("Введите номер квартиры:");
                int numberRoom = Integer.parseInt(scan.next());

                System.out.println("Введите количество человек:");
                int quantityHuman = Integer.parseInt(scan.next());

                Room room = new Room(numberRoom, new ArrayList<>());

                for (int k = 0; k < quantityHuman; k++) {
                    System.out.println("Введите имя, фамилию и возраст человека, разделение должно быть через пробел:");
                    String nameHuman = scan.next();
                    String lastNameHuman = scan.next();
                    int ageHuman = Integer.parseInt(scan.next());
                    Human newHuman = new Human(nameHuman, lastNameHuman, ageHuman);
                    room.humans.add(newHuman);
                }
                house.rooms.add(room);
            }
            houses.add(house);
        }
        familyFinder.printLargeFamilies(houses);
    }
}