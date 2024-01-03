import java.util.*;

/**
 * Décrivez votre classe Catwalk ici.
 *
 * @author (votre nom)
 * @version (un numéro de version ou une date)
 */
public class Catwalk extends Room {
    private CheshireCat chat;

    /**
     * Constructeur d'objets de classe Catwalk
     */
    public Catwalk() {
        super("A place with cat hair everywhere. A cat basket in the corner of the room with a bowl in the shape of a cat's head next"
                + " to it. There must surely be a cat here. There is also a litter on a mushroom, hence the room's smell...",
                "Catwalk", "ImagesAlice/Catwalk.png");

        chat = new CheshireCat();
        ajouterPersonnage(chat);
    }
}
