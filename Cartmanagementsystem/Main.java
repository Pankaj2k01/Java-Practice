package Cartmanagementsystem;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Warehouse warehouse = new Warehouse();

        while (true) {
            System.out.println("Warehouse Manager Menu:");
            System.out.println("1. Add Item to Warehouse");
            System.out.println("2. Remove Item from Warehouse");
            System.out.println("3. Update Item Details");
            System.out.println("4. View Warehouse Inventory");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline character

            switch (choice) {
                case 1:
                    System.out.print("Enter Item ID: ");
                    int itemid = scanner.nextInt();
                    scanner.nextLine(); // Consume newline character
                    System.out.print("Enter Price: $");
                    double price = scanner.nextDouble();
                    scanner.nextLine(); // Consume newline character
                    System.out.print("Enter Description: ");
                    String description = scanner.nextLine();
                    System.out.print("Enter Title: ");
                    String title = scanner.nextLine();
                    Item newItem = new Item(itemid, price, description, title);
                    warehouse.addItem(newItem);
                    break;
                case 2:
                    System.out.print("Enter Item ID to remove: ");
                    int itemToRemove = scanner.nextInt();
                    scanner.nextLine(); // Consume newline character
                    warehouse.removeItem(itemToRemove);
                    break;
                case 3:
                    System.out.print("Enter Item ID to update: ");
                    int itemToUpdate = scanner.nextInt();
                    scanner.nextLine(); // Consume newline character
                    Item existingItem = warehouse.getItemById(itemToUpdate);
                    if (existingItem != null) {
                        System.out.print("Enter new Price: $");
                        double newPrice = scanner.nextDouble();
                        scanner.nextLine(); // Consume newline character
                        System.out.print("Enter new Description: ");
                        String newDescription = scanner.nextLine();
                        System.out.print("Enter new Title: ");
                        String newTitle = scanner.nextLine();
                        Item updatedItem = new Item(itemToUpdate, newPrice, newDescription, newTitle);
                        warehouse.updateItem(itemToUpdate, updatedItem);
                    } else {
                        System.out.println("Item with ID " + itemToUpdate + " does not exist in warehouse.");
                    }
                    break;
                case 4:
                    warehouse.viewInventory();
                    break;
                case 5:
                    System.out.println("Exiting program...");
                    scanner.close();
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid choice. Please enter a number between 1 and 5.");
                    break;
            }
        }
    }
}
