// You will need to import the Random library from java.util, as well as the ArrayList library as it will be used.
import java.util.ArrayList;
import java.util.Random;
    
public class PuzzleJava {
    //getTenRolls
    //Write a method that will generate and return an array with 10 random numbers between 1 and 20 inclusive (which needs a lot of digging in that documentation of the Random Library inside of the util library)
    //Tip: To get a random integer, you can use the nextInt method of the Random class
    public ArrayList<Integer> getTenRolls(){
        ArrayList<Integer> randomNumbers = new ArrayList<Integer>();
        //here we're importing or what is called "dependency injection" where i created an instance of this Random class so I can use it, and it contains all of the methods that are associated with those randoms (called it 'randMachine' and that's how it's going to call all the functions from that Random Library)
        Random randMachine = new Random();
        for (int i = 1; i <= 10; i++) {
        // the nextInt function is going to give us the next random integer that it comes up with, then we set the bounds
            randomNumbers.add(randMachine.nextInt(20) + 1);
        }
        return randomNumbers;
        }
    }
