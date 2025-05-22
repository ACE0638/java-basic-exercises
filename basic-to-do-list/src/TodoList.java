import java.util.ArrayList;
import java.util.Scanner;

public class TodoList {
    private ArrayList<String> tasks = new ArrayList<>();
    private Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        TodoList todoApp = new TodoList();
        todoApp.run();
    }

    public void run() {
        boolean running = true;

        while (running) {
            printMenu();
            int choice = getIntInput(1, 4);

            switch (choice) {
                case 1:
                    addTask();
                    break;
                case 2:
                    viewTasks();
                    break;
                case 3:
                    removeTask();
                    break;
                case 4:
                    running = false;
                    System.out.println("Exiting...");
                    break;
            }
        }
        scanner.close();
    }

    private void printMenu() {
        System.out.println("\n--- To-Do List Menu ---");
        System.out.println("1. Add Task");
        System.out.println("2. View Tasks");
        System.out.println("3. Remove Task");
        System.out.println("4. Exit");
        System.out.print("Choose an option: ");
    }

    private int getIntInput(int min, int max) {
        while (true) {
            try {
                int input = Integer.parseInt(scanner.nextLine());
                if (input >= min && input <= max) {
                    return input;
                }
                System.out.printf("Please enter a number between %d and %d: ", min, max);
            } catch (NumberFormatException e) {
                System.out.print("Invalid input. Please enter a number: ");
            }
        }
    }

    private void addTask() {
        System.out.print("Enter task description: ");
        String task = scanner.nextLine().trim();

        if (task.isEmpty()) {
            System.out.println("Error: Task cannot be empty!");
            return;
        }

        tasks.add(task);
        System.out.println("Task added successfully!");
    }

    private void viewTasks() {
        if (tasks.isEmpty()) {
            System.out.println("No tasks in the list!");
            return;
        }

        System.out.println("\n--- Your Tasks ---");
        for (int i = 0; i < tasks.size(); i++) {
            System.out.printf("%d. %s\n", i + 1, tasks.get(i));
        }
    }

    private void removeTask() {
        viewTasks();
        if (tasks.isEmpty()) return;

        System.out.print("Enter task number to remove: ");
        int taskNumber = getIntInput(1, tasks.size());
        String removedTask = tasks.remove(taskNumber - 1);
        System.out.printf("Removed: %s\n", removedTask);
    }
}