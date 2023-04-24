import java.util.ArrayList;

//Create the Order class with the member variables listed above.
public class Order {
    public String name;
    public double total;
    public boolean ready;
    public ArrayList<Item> items = new ArrayList<Item>();

  //Create a Constructor, that takes name type String as an argument 
    public Order(String name) {
        this.name = name;
        this.ready = false;
        this.total = 0;
    }
    //Add item1 to order2's item list and increment the order's total.
    public void addItemToOrder(Item item){
        this.items.add(item);
        total+=item.price;
    }

    //order3 ordered a cappucino. Add the cappuccino to their order list and to their tab
    public void addItemToOrder(Item item, int number) {
        for (int i=0; i<number; i++){
        this.items.add(item);
        total+=item.price;
        }
    }

    //Cindhuri’s order is now ready. Update her status
    public void readyOrder() {
        System.out.println(String.format("%s, your order is now ready. Your total is:  $%.2f ", this.name, this.total));
        this.ready=true;
    }

}
