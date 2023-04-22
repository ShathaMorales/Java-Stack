import java.util.ArrayList;

class Item {
    public String name;
    public double price;
    public ArrayList<Item> items = new ArrayList<Item>();

    public void setName(String name, double price, Item item) {
        this.name = name;
        this.price = price;
        this.items.add(item);
    }
}