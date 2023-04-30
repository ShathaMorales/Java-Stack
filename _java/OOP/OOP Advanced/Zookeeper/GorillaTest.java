public class GorillaTest {
    public static void main(String[] args) {
        // Instantiate a gorilla
        Gorilla gorilla = new Gorilla();

        // Have it throw three things
        gorilla.throwSomething();
        gorilla.throwSomething();
        gorilla.throwSomething();
        gorilla.displayEnergy();

        // Have it eat two bananas
        gorilla.eatBananas();
        gorilla.eatBananas();

        // Have it climb
        gorilla.climb();
    }
}
