
public class TestOrder {

    public static void main(String[] args) {

        //Menu Items
        Item item1 = new Item("Drip Coffee", 2.5);
        Item item2 = new Item("latte", 4.5);
        Item item3 = new Item("Mocha", 3.2);
        Item item4 = new Item("Cappuccino", 5.0);

        //Create 2 orders for unspecified guests (without specifying a name);
        Order order1 = new Order();
        Order order2 = new Order();

        //Create 3 orders using the overloaded constructor to give each a name for the order
        Order order3 = new Order("Dan");
        Order order4 = new Order("Sam");
        Order order5 = new Order("Tom");

        //Implement the addItem method within the Order class
        //Add at least 2 items to each of the orders using the addItem method you wrote
        order1.addItem(item3);
        order1.addItem(item2);

        order2.addItem(item2);
        order2.addItem(item1);

        order3.addItem(item4);
        order3.addItem(item2);

        order4.addItem(item1);
        order4.addItem(item3);

        order5.addItem(item1);
        order5.addItem(item4);

        //Implement the getStatusMessage method within the Order class
        System.out.println(order1.getStatusMessage());

        //set some orders to ready and print the messages for each order
        order4.setReady(true);
        System.out.println(order4.getStatusMessage());

        order2.setReady(true);
        System.out.println(order2.getStatusMessage());

        //Implement the getOrderTotal method within the Order class
        order1.getOrderTotal();

        //Test the total by printing the return value like so: 
        //System.out.println(order1.getOrderTotal());
        System.out.println(order1.getOrderTotal());

        //Finally, call the display method on all of your orders, like so: order3.display();
        order1.display();
        order2.display();
        order3.display();
        order4.display();
        order5.display();
    }
}

