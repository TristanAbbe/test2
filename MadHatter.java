
/**
 * Décrivez votre classe MadHatter ici.
 *
 * @author (votre nom)
 * @version (un numéro de version ou une date)
 */
public class MadHatter extends Character
{   private Helmet helmet; 
    /**
     * Constructeur d'objets de classe MadHatter
     */
    public MadHatter()
    {
        // initialisation des variables d'instance
        super("MadHatter","Hello my dear you are in front of the Mad Hatter!");
        helmet = new Helmet();
        addItem(helmet);
    }
    
    
}
