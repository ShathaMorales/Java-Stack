public class Gorilla extends Mammal{

    //print out a message indicating that the gorilla has thrown something, as well as decrease the energy level by 5
    public void throwSomething(){
        setEnergyLevel(getEnergyLevel()-5);
        System.out.println("The Gorilla has thrown something " + displayEnergy()+"/100");
    }

    //print out a message indicating the gorilla's satisfaction and increase its energy by 10
    public void eatBananas(){
        setEnergyLevel(getEnergyLevel()+10);
        System.out.println("Gorilla's Satisfaction Level: " + displayEnergy()+"/100");
    }

    //print out a message indicating the gorilla has climbed a tree and decrease its energy by 10
    public void climb(){
        setEnergyLevel(getEnergyLevel()-10);
        System.out.println("The Gorilla has climed a tree. Energy level: " + displayEnergy()+"/100");
    }
    
}