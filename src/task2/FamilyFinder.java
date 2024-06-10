package task2;
import java.util.List;

public class FamilyFinder {

    void printLargeFamilies(List<House> houses) {
        for (House house : houses) {
            int countRoomWithMoreChildren = 0;
            for (Room room : house.rooms) {
                int childCount = 0;
                for (Human human : room.humans) {
                    if (human.age < 18) {
                        childCount++;
                    }
                }
                if (childCount > 2) {
                    countRoomWithMoreChildren++;
                }
            }
            if (countRoomWithMoreChildren > 0) {
                System.out.println("Дом #" + house.number);
                for (Room room : house.rooms) {
                    int childCount = 0;
                    for (Human human : room.humans) {
                        if (human.age < 18) {
                            childCount++;
                        }
                    }
                    if (childCount > 2) {
                        System.out.println("Квартира #" + room.number + ":");
                        for (Human human : room.humans) {
                            if (human.age < 18) {
                                System.out.println(human.name + " " + human.lastName);
                            }
                        }
                    }
                }
                System.out.println();
            }
        }
    }
}