
/**
 * Décrivez votre classe Twins ici.
 *
 * @author (votre nom)
 * @version (un numéro de version ou une date)
 */
public class Twins extends Character
{
    // variables d'instance - remplacez l'exemple qui suit par le vôtre

    /**
     * Constructeur d'objets de classe Twins
     */
    public Twins()
    {
        // initialisation des variables d'instance
        super("Twins TweedleDee and TweedleDum", "Hi ! We are the twins TweedleDee and TweedleDum"); ;
    }

    @Override
    public void receiveItem(Item item)
    {
        
    }
    
    @Override
    public void giveItem(Character receiver, Item item) {
        if (getItemQuest()==true) {//à changer ici car ils donnent un taco seulement si Alice gagne le jeu
            Item givenItem = item;
            givenItem.setName("Taco");
            receiver.setName("Alice");
            receiver.receiveItem(givenItem);
        }
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
