// importing the 'ArrayList' from the java.util library
import java.util.ArrayList;

//Create the testing file TestOrders and complete the rest of the tasks inside the testing file.
public class TestOrders {
    public static void main(String[] args) {
    
        //Create 4 item variables of type Item and instantiate 
        //each as an Item object. Name them item1, item2 etc.
        //Set the price and the name for each -- "mocha", "latte", 
        //"drip coffee" and "capuccino" (price is up to you!)
        Item item1 = new Item("Mocha", 3.5);
        Item item2 = new Item("Latte", 4.0);
        Item item3 = new Item("Drip Coffee", 2.5);
        Item item4 = new Item("Cappuccino", 4.5);
        // ArrayList<Item> itemsArray = new ArrayList();
        
        //Create 4 order variables of type Order and instantiate 
        //each as an Order object. Name them order1, order2 etc.
        //Set each order's name -- "Cindhuri", "Jimmy", "Noah", "Sam"
        Order order1 = new Order("Cindhuri");
        Order order2 = new Order("Jimmy");
        Order order3 = new Order("Noah");
        Order order4 = new Order("Sam");

        //Print the order1 variable to the console to see what happens
        //Predict what will happen if you print order1.total 
        //It will print out the order1 as an object (it did //Order@7344699f)
        System.out.println(order1);

        //Add item1 to order2's item list and increment the order's total.
        order2.addItemToOrder(item1);
        System.out.printf("Total: %s\n", order2.total);
        
        //order3 ordered a cappucino. Add the cappuccino to their order list and to their tab.
        order3.addItemToOrder(item4);
        System.out.printf("Total: %s\n", order3.total);

        //order4 added a latte. Update accordingly
        order4.addItemToOrder(item2);
        System.out.printf("Total: %s\n", order3.total);

        //Cindhuri’s order is now ready. Update her status
        order1.readyOrder();

        //Sam ordered more drinks - 2 lattes. Update their order as well
        order4.addItemToOrder(item2, 2);
        System.out.printf("Total: %s\n", order4.total);
        
        //Jimmy’s order is now ready. Update his status.
        order2.readyOrder();
        
        // Order variables -- order1, order2 etc.

        // Application Simulations
        // Use this example code to test various orders' updates
        // System.out.printf("Name: %s\n", order1.name);
        // System.out.printf("Ready: %s\n", order1.ready);
    }
}