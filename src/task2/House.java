package task2;

import java.util.ArrayList;
import java.util.List;

public class House {
    int number;
    List<Room> rooms;

    public House(int number, List<Room> rooms) {
        this.number = number;
        this.rooms = new ArrayList<>();
    }
}
