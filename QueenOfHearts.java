
/**
 * Décrivez votre classe QueenOfHearts ici.
 *
 * @author (votre nom)
 * @version (un numéro de version ou une date)
 */
public class QueenOfHearts extends Character
{
    // variables d'instance - remplacez l'exemple qui suit par le vôtre
    private LilDrink lilDrink;

    /**
     * Constructeur d'objets de classe QueenOfHearts
     */
    public QueenOfHearts()
    {
        // initialisation des variables d'instance
        super("Queen of Hearts","Respect me I am the Queen of Hearts");
        lilDrink = new LilDrink();
        addItem(lilDrink);
    
    }

    
    @Override
      public String dialogue()
    {
        String message = "oui";
        return message;
    }
}
