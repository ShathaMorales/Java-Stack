//Create a 'CarAndDriver' test class
public class TestCarAndDriver {

    public static void main (String[] args){

        //Instantiate the driver class
        Driver driver = new Driver();

        //Call the drive method four times
        driver.drive();
        driver.drive();
        driver.drive();
        driver.drive();

        //Call the boost method once
        driver.boost();

        //Call the refuel method three times
        driver.refuel();
        driver.refuel();
        driver.refuel();

        //Testing all methods
        driver.boost();
        driver.boost();
        driver.boost();
        driver.boost();

        driver.refuel();
        driver.refuel();

        driver.drive();
        driver.drive();

        driver.boost();
    }
}