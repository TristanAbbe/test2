import javax.swing.JOptionPane;
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
    // Override the dialogue method for the Caterpillar
    @Override
    public void dialogue() {
        String message;

        // Different dialogues based on the state
        switch (getState()) {
            case 1:
                message = "I have a headache, I need a Doubiprane.";
                break;
            case 2:
                message = "I am good, I don't have a headache anymore.";
                break;
            case 3:
                message = "I hope this string will help you.";
                break;
            default:
                message = "I am the Caterpillar. Welcome to Wonderland!";
                break;
        }

        JOptionPane.showMessageDialog(null, message);
    }

}
