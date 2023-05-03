import java.util.ArrayList;
import java.util.Collections;

public class Museum {
    public static void main(String[] args){

        ArrayList<Art> museum = new ArrayList<Art>();
        museum.add(new Painting ("Monalisa","Leonardo da Vinci","The Mona Lisa bears a strong resemblance to many Renaissance depictions of the Virgin Mary, who was at that time seen as an ideal for womanhood.","Oil on Canvas"));
        museum.add(new Painting ("The Scream","Edvard Munch","I sensed a scream passing through nature; it seemed to me that I heard the scream. I painted this picture, painted the clouds as actual blood. The color shrieked. This became The Scream","Oil And Crayon"));
        museum.add(new Painting ("The Creation of Adam","Michelangelo","The Creation of Adam (Italian: Creazione di Adamo) is a fresco painting by Italian artist Michelangelo, which forms part of the Sistine Chapel's ceiling", "oil on canvas"));
        museum.add(new Sculpture ("Auguste Rodin","Auguste Rodin","The Thinker (French: Le Penseur) is a bronze sculpture by Auguste Rodin, usually placed on a stone pedestal.","Bronze"));
        museum.add(new Sculpture ("Perseus with the Head of Medusa","Benvenuto Cellini","The sculpture stands on a square base which has bronze relief panels depicting the story of Perseus and Andromeda, similar to a predella on an altarpiece.","Bronze"));

        Collections.shuffle(museum);

        for(Art artwork : museum) {
            artwork.viewArt();
        }
    }
}