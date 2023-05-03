//Create a driver class that extends the car class and has the following 
//three methods: drive, boost, refuel
public class Driver extends Car {
    
    //Each method should print the action to the console, followed by the remaining amount of gas
    public void drive(){
        if(getGas()>0){
            //Driving should decrease gas by 1
            setGas(getGas()-1);
            System.out.println("You are driving the car. " + displayStatus());
        }
        //Add a 'game over' message to your car class that is displayed when the gas reaches zero
        else if (getGas()<=0){
            System.out.println("Game Over!");
        }
    }

    //Each method should print the action to the console, followed by the remaining amount of gas
    public void boost(){
        if(getGas()>=3){
            //Using boosters should decrease gas by 3
            setGas(getGas()-3);
            System.out.println("You are using a booster. " + displayStatus());
            if (getGas()==0){
                //Add a 'game over' message to your car class that is displayed when the gas reaches zero
                System.out.println("Game Over!");
            }
        }
        //Don't allow the driver to boost if his car has less than 3 gas
        else {
            System.out.println("Fuel Me! " + displayStatus());
        }
    }

    //Each method should print the action to the console, followed by the remaining amount of gas
    public void refuel(){
        if(getGas()>=8){
            //Don't allow the driver to refuel if his car has more than 8 gas
            System.out.println("Tank is full!");
        }
        else {
            //Refueling should increase gas by 2
            setGas(getGas()+2);
            System.out.println("You just refueled. " + displayStatus());
        }
    }
}