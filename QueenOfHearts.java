
/**
 * Décrivez votre classe QueenOfHearts ici.
 *
 * @author (votre nom)
 * @version (un numéro de version ou une date)
 */
public class QueenOfHearts extends Character
{
    // variables d'instance - remplacez l'exemple qui suit par le vôtre
    private int x;
    

    /**
     * Constructeur d'objets de classe QueenOfHearts
     */
    public QueenOfHearts()
    {
        // initialisation des variables d'instance
        super("Queen of Hearts","Respect me I am the Queen of Hearts");
    }

    @Override
    public void receiveItem(Item item)
    {
        
    }
    
    
    /**
     * Un exemple de méthode - remplacez ce commentaire par le vôtre
     *
     * @param  y   le paramètre de la méthode
     * @return     la somme de x et de y
     */
    @Override
      public String dialogue()
    {
        String message = "oui";
        return message;
    }
}
