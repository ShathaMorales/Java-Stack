//had to import ArrayList same as Random as they're BOTH part of the util library (java.util)
import java.util.ArrayList;
import java.util.Random;

//we're basically using this file for testing.
public class TestPuzzleJava {

//Testing file is the only one with this public static with main (which just starts the application or the program that I'm writing.. and then from here I can run methods from other class files)
	public static void main(String[] args) {
        //Created an instance of PuzzleJava that links to the whole class of PuzzleJave in the PuzzleJava.java file in order to use its methods... and through this instance called generator we can actually call the function.
		PuzzleJava generator = new PuzzleJava();
        //whenever we use a (.) DOT NOTATION here we are breaking into the generator instance and just calling the function within that class...
        //we created a randamRolls variable first, it's an ArrayList of integers, so we had to use the generator to call the getTenRolls method and whatever it returns will be stored into this randomRolls variable.
		ArrayList<Integer> randomRolls = generator.getTenRolls();
        //then print the randomRolls variable value...
		System.out.println(randomRolls);
		
//here we will print out all the rest of the returns from other methods called upon from the PuzzleJave class in the PuzzleJava.java file, just to see if they work properly
    // System.out.println(generator.getRandomLetter());
	}
}



