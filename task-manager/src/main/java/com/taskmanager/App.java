package com.taskmanager;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        TaskManager manager = new TaskManager();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\n--- Task Manager ---");
            System.out.println("1. List tasks");
            System.out.println("2. Add task");
            System.out.println("3. Mark done");
            System.out.println("4. Delete task");
            System.out.println("5. Exit");
            System.out.println("Choice: ");

            String choice = scanner.nextLine();

            switch (choice) {
                case "1":
                    var tasks = manager.readAll();
                    if (tasks.isEmpty()) System.out.println("No tasks yet.");
                    else tasks.forEach(System.out::println);
                    break;

                case "2":
                    System.out.print("Title: ");
                    String title = scanner.nextLine();
                    System.out.println("Created: " + manager.create(title));
                    break;

                case "3":
                    System.out.print("Task ID: ");
                    int updateId = Integer.parseInt(scanner.nextLine());
                    boolean updated = manager.update(updateId, null, true);
                    System.out.println(updated ? "Mark done." : "Not found.");
                    break;

                case "4":
                    System.out.print("Task ID: ");
                    int deleteId = Integer.parseInt(scanner.nextLine());
                    boolean deleted = manager.delete(deleteId);
                    System.out.println(deleted ? "Deleted." : "Not found");
                    break;

                case "5":
                    System.out.println("Peace.");
                    break;

                default:
                    System.out.println("Invalid choice.");
            }
        }
    }
}