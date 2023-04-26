import java.io.Console;
import java.util.ArrayList;

public class CafeUtil {
    //  Each week, a customer needs to purchase 1 more drink than they bought the previous week to get some free drinks after 10 weeks
    //  @return: int (sum from 1 to 10)
    public int getStreakGoal() {
        int sum = 0;
        for (int i = 0; i <=10; i++) {
            sum += i;
        }
        return sum;
}

    public double getOrderTotal(double[] prices){
    //  Given an array of order prices, sum the prices and return the total 
        double sum = 0;
        for(double price : prices){
            sum += price;
        }
        return sum;
}

    public void displayMenu(ArrayList<String> menuItems){
        for(int i=0; i<menuItems.size(); i++){
            System.out.println(i + " " + menuItems.get(i));
    }
}

    public void addCustomer(ArrayList<String> customers) {
        System.out.println("Please eneter your name");
        String userName = System.console().readLine();
        System.out.println(String.format("Hello, %s!", userName));
        int customerSize = customers.size();
        System.out.println(String.format("There are %d people in front of you", customerSize));
        customers.add("userName");
    }
}

