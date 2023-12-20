import javax.swing.JOptionPane;
/**
 * Décrivez votre classe CheshireCat ici.
 *
 * @author (votre nom)
 * @version (un numéro de version ou une date)
 */
public class CheshireCat extends Character
{
    // variables d'instance - remplacez l'exemple qui suit par le vôtre
    
    
    /**
     * Constructeur d'objets de classe CheshireCat
     */
    public CheshireCat()
    {
        // initialisation des variables d'instance
        super("Cheshire Cat", "I am the Cheshire Cat : welcome in the game");
    }

    // Override the dialogue method for the CheshireCat
    @Override
    public void dialogue() {
        String message;

        // Different dialogues based on the state
        switch (getState()) {
            case 1:
                message = "Welcome, Alice! The Caterpillar is waiting for you. Go see him!";
                break;
            case 2:
                message = "Hello again, Alice. I suggest you visit the fancy pharmacy for some medication.";
                break;
            case 3:
                message = "Great to see you, Alice! Take the medication to the Caterpillar; he'll appreciate it.";
                break;
            case 4:
                message = "Alice, why not visit the hat makers? They create the most extraordinary hats!";
                break;
            case 5:
                message = "Alice, the Queen's palace is a fascinating place. Go and explore!";
                break;
            case 6:
                message = "Curiouser and curiouser, Alice! Venture into the bunny hole and see what awaits you.";
                break;
            default:
                message = "Congratulations, Alice! You've completed your adventures. Now, it's time to leave Wonderland.";
                break;
        }

        JOptionPane.showMessageDialog(null, message);
    }
    
}
