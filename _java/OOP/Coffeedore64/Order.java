import java.util.ArrayList;
    
// Here we're creating a new data type called Order
public class Order {
    
    // MEMBER VARIABLES
    private String name; // default value of null
    private boolean ready; // default value false
    private ArrayList<Item> items; // defaults to null
    
    // CONSTRUCTOR
    // No arguments, sets name to "Guest", initializes items as an empty list.
    public Order() {
        this.name = "Guest";
        this.items = new ArrayList<Item>();
    }
    
    // OVERLOADED CONSTRUCTOR
    // Takes a name as an argument, sets name to this custom name.
    // Initializes items as an empty list.
    public Order(String name) {
        this.name = name;
        this.items = new ArrayList<Item>();
    }
    
    // ORDER METHODS    
    	// Most of your code will go here, 

    //Create a method called addItem that takes an Item 
    //object as an argument and adds the item to the order's 
    //items array. No need to return anything.
    public void addItem(Item item) {
        items.add(item);
    }

    //Create a method called getStatusMessage that returns a 
    //String message. If the order is ready, return "Your order 
    //is ready.", if not, return "Thank you for waiting. 
    //Your order will be ready soon."
    public String getStatusMessage(){
        if(this.ready){
            return "Your order is ready";
        } 
        else {
            return "Thank you for waiting... your order will be ready soon";
        }
    }

    //Similar to the getOrderTotal method from the Cafe Business Logic assignment, 
    //create a method called getOrderTotal that sums together each of the item's prices, 
    //and returns the total amount. Note: This time, you do not need to pass in a list 
    //of prices, because each item object in this order's items array has its own price, 
    //that you can access using a getter!
    public double getOrderTotal(){
        double total = 0.0;
        for(Item item : items){
            total += item.getPrice();
        }
        return total;
    }
    
    //Similar to the displayMenu function from the Cafe Business Logic assignment, 
    //create a method called display that prints out the order information like so:
    public void display(){
        System.out.println("Customer Name: " + this.name);
        for(Item item : items){
            System.out.println(item.getName() + " - $" + item.getPrice());
        }
    System.out.println("Total:  $" +getOrderTotal());
    }


    // GETTERS & SETTERS
    public String getName() {
        return this.name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public boolean getReady(boolean ready){
        return this.ready;
    }
    public void setReady(boolean ready){
        this.ready = ready;
    }

    public ArrayList<Item> getItems(){
        return this.items;
    }
    public void setItems(ArrayList<Item> items){
        this.items = items;
    }
}