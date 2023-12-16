import java.awt.GridLayout;

 import javax.swing.JPanel;
/**
 * Décrivez votre classe GUI_Interface ici.
 *
 * @author (votre nom)
 * @version (un numéro de version ou une date)
 */
public class GamePanel extends JPanel
{
    private static int COLS = 3; // colonne
    private static int ROWS = 2; // ligne
    /**
     * Constructeur d'objets de classe GUI_Interface
     */
    public GamePanel()
    {
        // initialisation des variables d'instance
        
        setLayout(new GridLayout(ROWS, COLS));
        
        
    }

    /**
     * Un exemple de méthode - remplacez ce commentaire par le vôtre
     *
     * @param  y   le paramètre de la méthode
     * @return     la somme de x et de y
     */
}
