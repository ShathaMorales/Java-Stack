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
    //getRandomLetter
    //Create an array within the method that contains all 26 letters of the alphabet (this array must have 26 values).
    //Generate a random index between 0-25 and use it to pull a random letter out of the array.
    //Return the random letter.
    public char getRandomLetter() {
        char[] alphabet = new char [26];
        for (char c = 'a'; c <= 'z'; c++) {
            alphabet[c - 'a'] = c;
        }
        Random randMachine = new Random();
        // randMachine.nextInt(26);
        return alphabet[randMachine.nextInt(26)];
    }

    //generatePassword
    //Write a method that uses the previous method to create a random string of eight characters and return that string.
    public String generatePassword(){
        String password = new String();
        for (int i = 0; i<8; i++) {
            char temp = getRandomLetter();
            password = password.concat(String.valueOf(temp));
    }
    return password;
    }

    //getNewPasswordSet
    //Write a method that takes an int length as an argument and creates an array of random eight-character words. The array should be the length passed in as an int. Return the array of passwords.
    public ArrayList<String> getNewPasswordSet(int length){
        ArrayList<String> passwordSet = new ArrayList<String>();
        for (int i = 0; i < length; i++){
            passwordSet.add(generatePassword());
        }
    return passwordSet;
    }

    //shuffleArray
    //Write a method that takes an array and mixes up all the values in a pseudo-random way. Hint: use random indexes within the array, and swap values repeatedly.
    public int[] shuffleArray(int[] shuffle){
        Random randMachine = new Random();
        for ( int i = 0; i < shuffle.length; i++ ){
            int randNumber = randMachine.nextInt(shuffle.length);
            int temp = shuffle[randNumber];
            shuffle[randNumber] = shuffle[i];
            shuffle[i]= temp;
        }
        return shuffle;
    }
}
