public class CafeJava {
    public static void main(String[] args){
        String generalGreeting = "Welcome to Cafe Java, ";
        String pendingMessage = ", your order will be ready shortly";
        String readyMeassage = ", your order is ready";
        String displayTotalMessage = "Your order is $";

        double mochaPrice = 3.5;
        double dripCoffeePrice = 2.5;
        double lattePrice = 4.5;
        double cappuccinoPrice = 5.5;

        String customer1 = "Cindhuri";
        String customer2 = "Sam";
        String customer3 = "Jimmy";
        String customer4 = "Noah";

        boolean isReadyOrder1 = false;
        boolean isReadyOrder2 = true;
        boolean isReadyOrder3 = true;
        boolean isReadyOrder4 = false;

//Cindhuri ordered a coffee. Print to the console the correct status message, based on her order status.
        System.out.println(generalGreeting + customer1);
        if (isReadyOrder1) {
            System.out.println(customer1 + readyMeassage);
            System.out.println(displayTotalMessage + dripCoffeePrice);
        }
        else {
            System.out.println(customer1 + pendingMessage);
        }

//Noah ordered a cappuccino. Use an if statement to check the status of his order and print the correct status message. If it is ready, also print the message to display the total. Note: Outcomes may be different depending on what you assigned as the status.
        System.out.println(generalGreeting + customer4);
        if (isReadyOrder4) {
            System.out.println(customer4 + readyMeassage);
            System.out.println(displayTotalMessage + cappuccinoPrice);
        }
        else {
            System.out.println(customer4 + pendingMessage);
        }

//Sam just ordered 2 lattes, print the message to display their total. Next, use an if statement to print the appropriate order status message. Change the isReady flag value from true to false or vice versa in order to test your control logic (if-statement).
            System.out.println(generalGreeting + customer2);
        if (isReadyOrder2) {
            System.out.println(customer2 + readyMeassage);
            System.out.println(displayTotalMessage + 2 * lattePrice);
        }
        else {
            System.out.println(customer2 + pendingMessage);
        }


//Jimmy just realized he was charged for a coffee but had ordered a latte. Print the total message with the new calculated total (what he owes) to make up the difference.
        System.out.println(customer3 + " " +displayTotalMessage + (dripCoffeePrice - lattePrice));
    
}

    }
