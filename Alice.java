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

    
