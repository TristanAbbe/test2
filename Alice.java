import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
/**
 * Décrivez votre classe Alice ici.
 *
 * @author (votre nom)
 * @version (un numéro de version ou une date)
 */
public class Alice extends Character
{
    // variables d'instance - remplacez l'exemple qui suit par le vôtre/**
    List<Object> inventory = new ArrayList<>();
    private int hunger;
    private boolean death = false ;
    
    public Alice()
    {
        // initialisation des variables d'instance
        super("Alice", "Hello, I am Alice");
        
    }
    
    /**
     * This method allows Alice to move, her hunger level gets closer to 0 when she moves
     */
    public void move() 
    {
        if (!death) {
            //elle avance
            hunger=hunger-10;
        if (hunger==0) {
            death=true;
        }
        }
    }
    
    public void inventory()
    {
        //gerer l'inventaire
    }
    
    public void feed()
    {
        if (!death) {
            //browse the list to know if she owns a taco
            for (int i = 0; i < inventory.size(); i++) {
            Object element = inventory.get(i);
            JOptionPane.showMessageDialog(null, element);
        }
        }
    }
    
    
    }

    
