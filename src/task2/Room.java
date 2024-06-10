package task2;

import java.util.ArrayList;
import java.util.List;

public class Room {
    int number;
    List<Human> humans;

    public Room(int number, List<Human> humans) {
        this.number = number;
        this.humans = new ArrayList<>();
     }
}
