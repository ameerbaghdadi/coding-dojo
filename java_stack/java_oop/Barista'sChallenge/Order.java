import java.util.ArrayList;

public class Order {
    private String name;
    private double total = 0;
    private boolean ready;
    private ArrayList<Item> items = new ArrayList<Item>();

    public Order() {
        this.name = "Guest";
    }

    public Order(String name) {
        this.name = name;
    }

    public void addItem(Item i) {
        double price = i.getItemPrice();
        this.items.add(i);
        this.total += price;
        System.out.println(total);
    }

    public void setStatus(boolean s) {
        this.ready = s;
    }

    public void getStatusMessage() {
        if(this.ready == true) {
            System.out.println("Your order is ready.");
        } else {
            System.out.println("Thank you for waiting. Your order will be ready soon.");
        }
    }

    public void display() {
        System
    }
}

