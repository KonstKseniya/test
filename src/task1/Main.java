package task1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        TaskManager taskManager = new TaskManager();
        Scanner scan = new Scanner(System.in);
        int input;

        do {
            System.out.println("Меню:");
            System.out.println("1. Создать задачу");
            System.out.println("2. Удалить задачу");
            System.out.println("3. Посмотреть все задачи");
            System.out.println("4. Выход");

            input = Integer.parseInt(scan.nextLine());

            switch (input) {
                case 1:
                    System.out.print("Введите имя задачи ");
                    String name = scan.nextLine();

                    System.out.print("Введите описание задачи ");
                    String description = scan.nextLine();

                    Task newTask = new Task(name, description);
                    taskManager.addTask(newTask);

                    break;

                case 2:
                    System.out.print("Введите имя задачи, которую хотите удалить ");
                    String nameRemove = scan.nextLine();
                    taskManager.removeTask(nameRemove);

                    break;

                case 3:
                    System.out.println("Список задач:");
                    taskManager.viewTasks();

                    break;
            }
        } while (input != 4);
    }
}