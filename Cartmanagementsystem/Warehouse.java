package Cartmanagementsystem;

import java.util.HashMap;
import java.util.Map;

public class Warehouse {
    private Map<Integer, Item> inventory;

    // Constructor
    public Warehouse() {
        this.inventory = new HashMap<>();
    }

    // Add item to warehouse
    public void addItem(Item item) {
        if (inventory.containsKey(item.getItemid())) {
            System.out.println("Item with ID " + item.getItemid() + " already exists in warehouse.");
        } else {
            inventory.put(item.getItemid(), item);
            System.out.println("Item added to warehouse: " + item.getTitle());
        }
    }

    // Remove item from warehouse
    public void removeItem(int itemid) {
        if (inventory.containsKey(itemid)) {
            Item removedItem = inventory.remove(itemid);
            System.out.println("Item removed from warehouse: " + removedItem.getTitle());
        } else {
            System.out.println("Item with ID " + itemid + " does not exist in warehouse.");
        }
    }

    // Update item details
    public void updateItem(int itemid, Item updatedItem) {
        if (inventory.containsKey(itemid)) {
            inventory.put(itemid, updatedItem);
            System.out.println("Item updated successfully.");
        } else {
            System.out.println("Item with ID " + itemid + " does not exist in warehouse.");
        }
    }

    // View all items in warehouse
    public void viewInventory() {
        System.out.println("Warehouse Inventory:");
        for (Item item : inventory.values()) {
            System.out.println(item.toString());
            System.out.println("--------------------------");
        }
    }

    // Get item by ID
    public Item getItemById(int itemid) {
        return inventory.get(itemid);
    }

    // Get total number of items in warehouse
    public int getTotalItems() {
        return inventory.size();
    }
}
