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
    private Room currentRoom ;
    
    public Alice()
    {
        // initialisation des variables d'instance
        super("Alice", "Hello, I am Alice");
        
    }
    
    /**
     * This method allows Alice to move, her hunger level gets closer to 0 when she moves
     */
    public void move(int orientation) 
    {
        if (!death) 
        {
        String direction = null;//bouton déplacement 
        Room nextRoom = null;
        nextRoom = currentRoom.getExit(direction);

        if (nextRoom == null) {
            System.out.println("There is no room!");
            }
        else 
        {
            currentRoom = nextRoom;
        }
        //elle avance
        hunger=hunger-10;
            if (hunger==0) 
                {
                death=true;
                }
            }
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

    
