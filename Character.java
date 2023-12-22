import javax.swing.JOptionPane;
/**
 * Décrivez votre classe Character ici.
 *
 * @author (votre nom)
 * @version (un numéro de version ou une date)
 */

public class Character
{
    // variables d'instance - remplacez l'exemple qui suit par le vôtre
    private String name;
    private String description;
    private int state;
    private boolean itemQuest;
    
    /**
     * Constructeur d'objets de classe Character
     */
    public Character(String name, String description)
    {
        setName(name);
        setDescription(description);
        itemQuest = false;
    }

    // Getters et setters (méthodes d'accès)
    public String getName() {
        return name;
    }
    
    public void setName(String name) {
        if (name != null && !name.trim().isEmpty()) {
            this.name = name.trim(); // Trim leading and trailing whitespaces
        } else {
            throw new IllegalArgumentException("Name cannot be null or empty.");
        }
    }
    
    public boolean getItemQuest(){
        return itemQuest;
    }
    
    public void setItemQuest(boolean ItemQuest)
    {
        this.itemQuest=itemQuest;
    }
    
    public String getDescription() {
        return description;
    }
    
    public void setDescription(String description) {
        if (description != null && !description.trim().isEmpty()) {
            this.description = description.trim(); // Trim leading and trailing whitespaces
        } else {
            throw new IllegalArgumentException("Description cannot be null or empty.");
        }
    }
    
    public int getState() {
        return state;
    }

    public void setState(int state) {
        this.state = state;
    }
    
    public void receiveItem (Item item)
    {
        
    }
    
    public void giveItem(Character receiver, Item item)
    {
        
    }
    
    // Méthode pour un dialogue
    public String dialogue() {
        return null; 
        }
    
}
