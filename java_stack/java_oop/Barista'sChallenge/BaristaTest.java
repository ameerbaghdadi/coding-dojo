import java.util.ArrayList;

public class BaristaTest {
    public static void main(String[] args) {
        
        // Menu items

        Item item1 = new Item();
        item1.setItemName("mocha");
        item1.setItemPrice(5.5);
        item1.show();

        Item item2 = new Item();
        item2.setItemName("latte");
        item2.setItemPrice(9);
        item2.show();
        
        Item item3 = new Item();
        item3.setItemName("drip coffee");
        item3.setItemPrice(10.5);
        item3.show();
        
        Item item4 = new Item();
        item4.setItemName("capuccino");
        item4.setItemPrice(8.4);
        item2.show();

        
        // Order variables -- order1, order2 etc.
        Order order1 = new Order();
        order1.addItem(item1);
        order1.setStatus(true);
        order1.getStatusMessage();
        order1.display();

        // Order order2 = new Order();
        // order2.name = "Jimmy";
        // order2.items.add(item3);
        // order2.items.add(item1);
        // order2.total = item3.price + item1.price;
        // order2.ready = true;

        // Order order3 = new Order();
        // order3.name = "Noah";
        // order3.items.add(item4);
        // order3.total = item4.price;
        // order3.ready = true;

        // Order order4 = new Order();
        // order4.name = "sam";
        // order4.items.add(item2);
        // order4.items.add(item2);
        // order4.items.add(item2);
        // order4.total = item2.price + item2.price + item2.price;
        // order4.ready = true;


        // Application Simulations
        // Use this example code to test various orders' updates
        // System.out.printf("Name: %s\n", order1.name);
        // System.out.printf("Total: %s\n", order1.total);
        // System.out.printf("Ready: %s\n", order1.ready);
        // System.out.printf("------------------------------------------\n");
        // System.out.printf("Name: %s\n", order2.name);
        // System.out.printf("Item Name: %s\n", order2.items.get(0).name);
        // System.out.printf("Total: %s\n", order2.total);
        // System.out.printf("Ready: %s\n", order2.ready);
        // System.out.printf("-------------------------------------------\n");
        // System.out.printf("Name: %s\n", order3.name);
        // System.out.printf("Item Name: %s\n", order3.items.get(0).name);
        // System.out.printf("Total: %s\n", order3.total);
        // System.out.printf("Ready: %s\n", order3.ready);
        // System.out.printf("--------------------------------------------\n");
        // System.out.printf("Name: %s\n", order4.name);
        // System.out.printf("Item Name: %s\n", order4.items.get(0).name);
        // System.out.printf("Total: %s\n", order4.total);
        // System.out.printf("Ready: %s\n", order4.ready);
    }
}
