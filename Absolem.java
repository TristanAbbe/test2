
/**
 * Décrivez votre classe Absolem ici.
 *
 * @author (votre nom)
 * @version (un numéro de version ou une date)
 */
public class Absolem extends Character
{
    // variables d'instance - remplacez l'exemple qui suit par le vôtre
    private boolean headache;

    /**
     * Constructeur d'objets de classe Absolem
     */
    public Absolem()
    {
        // initialisation des variables d'instance
        super("Absolem","Hi, I'm Absolem");
        headache=true;
    }

    /**
     * This method allows Absolem to ask Alice for a Doubiprane
     */
    public void Head()
    {
        //ask for a Doubiprane if he is headache
        if (headache ==true)
        System.out.println("As-tu un Doubiprane pour soulager mon mal de tête ?");
        else 
        System.out.println("Je suis en pleine forme");
    }
}
