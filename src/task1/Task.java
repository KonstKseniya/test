package task1;

public class Task {
    String name;
    String description;

    public Task (String name, String description) {
        this.name = name;
        this.description = description;
    }

    public String toString() {
        return name + " - " + description;
    }


    public String getName() {
        return name;
    }
}
