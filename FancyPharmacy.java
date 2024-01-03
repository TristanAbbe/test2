import java.util.*;
/**
 * Décrivez votre classe Fancy_pharmacy ici.
 *
 * @author (votre nom)
 * @version (un numéro de version ou une date)
 */
public class FancyPharmacy extends Room
{   private Doubiprane doubiprane;
    /**
     * Constructeur d'objets de classe Fancy_pharmacy
     */
    public FancyPharmacy()
    {
       super("I better understand why this room was hidden, there are tons of packaged medecine arranged in a very symmetrical way!"
        +" Among all its well-maintained goods, one of them stands out with a streak of light delicately depositing on the packaging, reflecting all its"
        +" splendor in the room. This is a box of Doubiprane.", "Fancy Pharmacy","ImagesAlice/Fancy_farmacy.png");
        //ImagesAlice/Fancy_farmacy.png
        doubiprane = new Doubiprane();
        addItem(doubiprane); 
    }
    
}
