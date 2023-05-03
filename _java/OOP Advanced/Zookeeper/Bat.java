//Create a Bat class
public class Bat extends Mammal{
    
    //Has a default energy level of 300
    // protected int energyLevel=300;

    public Bat(){
        //Has a default energy level of 300
        super.energyLevel=300;
    }

    //Create a Bat class that can fly, print the sound of a bat taking off and decrease its energy by 50
    public void fly(){
        setEnergyLevel(getEnergyLevel()-50);
        System.out.println("Flap Flap.. Energy Level: " + displayEnergy()+"/300");
    }

    //Create a Bat class that can eatHumans, print the so- well, never mind, just increase its energy by 25
    public void eatHumans(){
        setEnergyLevel(getEnergyLevel()+25);
        System.out.println("Ooooh Nooooo! Energy Level: " + displayEnergy()+"/300");
    }

    //Create a Bat class that can attackTown,print the sound of a town on fire and decrease its energy by 100
    public void attackTown(){ 
        setEnergyLevel(getEnergyLevel()-100);
        System.out.println("Sizzle, Sizzle, Sizzle. Energy Level: " + displayEnergy()+"/300");
    }

    // //Getter
    // public int getEnergyLevel(){
    //     return energyLevel;
    // }

    // //Setter
    // public void setEnergyLevel(int energyLevel){
    //     this.energyLevel = energyLevel;
    // }

}