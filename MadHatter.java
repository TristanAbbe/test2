
/**
 * Décrivez votre classe MadHatter ici.
 *
 * @author (votre nom)
 * @version (un numéro de version ou une date)
 */
public class MadHatter extends Character
{
    /**
     * Constructeur d'objets de classe MadHatter
     */
    public MadHatter()
    {
        // initialisation des variables d'instance
        super("MadHatter","Hello my dear you are in front of the Mad Hatter!");
    }
    
    @Override
    public void receiveItem(Item item)
    {
        if (item.getName() == "Silk Thread")
        {
            setItemQuest(true);
    }
    }
    
    @Override
    public void giveItem(Character receiver, Item item) {
        if (getItemQuest()==true) {
            Item givenItem = item;
            givenItem.setName("Helmet");
            receiver.setName("Alice");
            receiver.receiveItem(givenItem);
        }
    }
    
}
