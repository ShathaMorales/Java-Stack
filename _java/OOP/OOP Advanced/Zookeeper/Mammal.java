public class Mammal{
    protected int energyLevel = 100;

    public int displayEnergy(){
        // System.out.println("Mammal's Energy Level: " + getEnergyLevel()+"/100");
        return getEnergyLevel();
    }

    //Getter
    public int getEnergyLevel(){
        return energyLevel;
    }

    //Setter
    public void setEnergyLevel(int energyLevel){
        this.energyLevel = energyLevel;
    }
}