package Cartmanagementsystem;

public class Item {
    private int itemid;
    private double price;
    private String description;
    private String title;

    // Constructor
    public Item(int itemid, double price, String description, String title) {
        this.itemid = itemid;
        this.price = price;
        this.description = description;
        this.title = title;
    }

    // Getters
    public int getItemid() {
        return itemid;
    }

    public double getPrice() {
        return price;
    }

    public String getDescription() {
        return description;
    }

    public String getTitle() {
        return title;
    }

    // Override toString() for easy display
    @Override
    public String toString() {
        return "Item ID: " + itemid + "\n"
                + "Title: " + title + "\n"
                + "Description: " + description + "\n"
                + "Price: $" + price;
    }
}
