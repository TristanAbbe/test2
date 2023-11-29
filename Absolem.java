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
    public void Head()
    {
        //ask for a Doubiprane if he is headache
         if (headache) {
            JOptionPane.showMessageDialog(null, "J'ai mal à la tête, j'ai besoin d'un Doubiprane !");
        } else {
            JOptionPane.showMessageDialog(null, "Je vais bien, je n'ai pas mal à la tête !");
        }
    }
}
