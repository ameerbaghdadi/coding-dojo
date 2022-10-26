import java.util.ArrayList;

public class TestOrders {
    public static void main(String[] args) {
        
        // Menu items
        Items item1 = new Items();
        item1.name = "mocha";
        item1.price = 5.5;
        Items item2 = new Items();
        item2.name = "latte";
        item2.price = 9;
        Items item3 = new Items();
        item3.name = "drip coffee";
        item3.price = 10.5;
        Items item4 = new Items();
        item4.name = "capuccino";
        item4.price = 8.4;

        // Order variables -- order1, order2 etc.
        Order order1 = new Order();
        order1.name = "Cindhuri";
        order1.items.add(item1);
        order1.total = item1.price;
        order1.ready = true;

        Order order2 = new Order();
        order2.name = "Jimmy";
        order2.items.add(item3);
        order2.items.add(item1);
        order2.total = item3.price + item1.price;
        order2.ready = true;

        Order order3 = new Order();
        order3.name = "Noah";
        order3.items.add(item4);
        order3.total = item4.price;
        order3.ready = true;

        Order order4 = new Order();
        order4.name = "sam";
        order4.items.add(item2);
        order4.items.add(item2);
        order4.items.add(item2);
        order4.total = item2.price + item2.price + item2.price;
        order4.ready = true;


        // Application Simulations
        // Use this example code to test various orders' updates
        System.out.printf("Name: %s\n", order1.name);
        System.out.printf("Total: %s\n", order1.total);
        System.out.printf("Ready: %s\n", order1.ready);
        System.out.printf("------------------------------------------\n");
        System.out.printf("Name: %s\n", order2.name);
        System.out.printf("Item Name: %s\n", order2.items.get(0).name);
        System.out.printf("Total: %s\n", order2.total);
        System.out.printf("Ready: %s\n", order2.ready);
        System.out.printf("-------------------------------------------\n");
        System.out.printf("Name: %s\n", order3.name);
        System.out.printf("Item Name: %s\n", order3.items.get(0).name);
        System.out.printf("Total: %s\n", order3.total);
        System.out.printf("Ready: %s\n", order3.ready);
        System.out.printf("--------------------------------------------\n");
        System.out.printf("Name: %s\n", order4.name);
        System.out.printf("Item Name: %s\n", order4.items.get(0).name);
        System.out.printf("Total: %s\n", order4.total);
        System.out.printf("Ready: %s\n", order4.ready);
    }
}
