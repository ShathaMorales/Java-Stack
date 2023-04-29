//Create a car class that has a gas attribute
public class Car {
    //Each car should start with a gas level of 10
    private int gas = 10;
    private boolean gameOver = false;
    
    //Create a method that displays the amount of gas remaining in the car
    public String displayStatus(){
        return "Gas remaining: " +getGas()+"/10";
        }

    //Getter
    public int getGas(){
        return gas;
    }

    //Setter
    public void setGas(int gas){
        this.gas = gas;
    }
}