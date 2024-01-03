
/**
 * Décrivez votre classe Twins ici.
 *
 * @author (votre nom)
 * @version (un numéro de version ou une date)
 */
public class Twins extends Character
{
    // variables d'instance - remplacez l'exemple qui suit par le vôtre
    MiniGame miniGame;
    private Taco taco;
    /**
     * Constructeur d'objets de classe Twins
     */
    public Twins()
    {
        // initialisation des variables d'instance
        super("Twins TweedleDee and TweedleDum", "Hi ! We are the twins TweedleDee and TweedleDum");
        taco = new Taco();
        addItem(taco);
    }
    
    
    @Override
      public String dialogue()
    {
        String message = "oui";
        return message;
    }
}
