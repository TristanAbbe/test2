import java.util.*;

/**
 * Décrivez votre classe CaterpillarCraddle ici.
 *
 * @author (votre nom)
 * @version (un numéro de version ou une date)
 */
public class CaterpillarCraddle extends Room {
    private Absolem chenille;

    /**
     * Constructeur d'objets de classe CaterpillarCraddle
     */
    public CaterpillarCraddle() {
        super("I better understand where the smoke altering reality comes from: a hookah surely coming from the countries"
                + " of sand. On both sides of the room there are fossilized skins resembling molts of butterflies, normally they should not be this big for such"
                + " a small animal. Very light silk threads starting from the ceiling cross the room with in its center a large red mushroom with white spots on"
                + " which is placed a strange character of an unempathetic nature.", "Caterpillar Cradle", "ImagesAlice/Caterpillar.png");

        chenille = new Absolem();
        ajouterPersonnage(chenille);
    }
}
