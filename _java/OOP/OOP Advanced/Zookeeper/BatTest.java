//Create a BatTest class
public class BatTest{

    public static void main(String[] args) {
        //Instantiate a bat 
        Bat bat = new Bat();

        //have it attack three towns
        bat.attackTown();
        bat.attackTown();
        bat.attackTown();

        //have it eat two humans
        bat.eatHumans();
        bat.eatHumans();

        //have it fly twice
        bat.fly();
        bat.fly();

        //Testing on my own
        bat.eatHumans();
        bat.eatHumans();
        bat.eatHumans();
        bat.eatHumans();
        bat.eatHumans();
        bat.fly();
        bat.fly();
        bat.eatHumans();
        bat.eatHumans();
        bat.eatHumans();
        bat.eatHumans();
        bat.eatHumans();
        bat.eatHumans();
        bat.attackTown();
    }


}